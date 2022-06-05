// valid moves will be checked in Piece class
import java.util.*;

public class ChessBoard {

  public Piece[][] board;
  public ArrayList<String> scoreSheet=new ArrayList<String>();

  public ChessBoard(){
    board=new Piece[8][8];

    for(int i=2; i< 6; i++){
      for(int j=0; j<8; j++){
        board[i][j] = null;

    }

    board[0][0]= new Rook("white");
    board[0][1]= new Knight("white");
    board[0][2]= new Bishop("white");
    board[0][3]= new Queen("white");
    board[0][4]= new King("white");
    board[0][5]= new Bishop("white");
    board[0][6]= new Knight("white");
    board[0][7]= new Rook("white");

    for(int y=0; y<=7; y++){
      board[1][y] = new Pawn("white");
    }

    board[7][0]= new Rook("black");
    board[7][1]= new Knight("black");
    board[7][2]= new Bishop("black");
    board[7][3]= new Queen("black");
    board[7][4]= new King("black");
    board[7][5]= new Bishop("black");
    board[7][6]= new Knight("black");
    board[7][7]= new Rook("black");

    for(int y=0; y<=7; y++){
      board[6][y] = new Pawn("black");
    }
  }
}

  public boolean isChecked(String color){
    int[] kingPos = getKingPosition(color);
    int row = kingPos[0];
    int col = kingPos[1];

    for(int i = 0; i<board.length; i++){
      for(int j = 0; j<board[0].length; j++){
        if(board[i][j] != null){
          if(board[i][j].canMove(this, i, j, row, col) && !board[i][j].getColor().equals(color)){
            return true;
          }
        }
      }
    }
    return false;
  }

  public static int charToInt(char c){
    switch(c){
      case 'a': return 0;
      case 'b': return 1;
      case 'c': return 2;
      case 'd': return 3;
      case 'e': return 4;
      case 'f': return 5;
      case 'g': return 6;
      case 'h': return 7;
      default: return 8;
    }
  }

  public static int[] parseScanner(String move){
    int[] returnArray = new int[4];

    String[] split = move.split(" ");
    returnArray[1] = charToInt(Character.toLowerCase(split[0].charAt(0)));
    returnArray[0] = Integer.parseInt(move.charAt(1) + "") - 1;

    returnArray[3] = charToInt(Character.toLowerCase(split[1].charAt(0)));
    returnArray[2] = Integer.parseInt(split[1].charAt(1) + "") - 1;
    return returnArray;

  }

  private int[] getKingPosition(String color){
    int row = 0;
    int col = 0;

    for(int i = 0; i<board.length; i++){
      for(int j = 0; j<board[0].length; j++){
        if(board[i][j] != null){
          if(board[i][j].getClass().isInstance(new King(color)) && board[i][j].getColor().equals(color)){
            row = i;
            col = j;
          }
        }
      }
    }
    int[] output = new int[2];
    output[0] = row;
    output[1] = col;

    return output;

  }

  public void makeMove(String move, String color, boolean moveCompleted) throws IllegalArgumentException{
    int[] arrOfMoves = parseScanner(move);

    if(board[arrOfMoves[0]][arrOfMoves[1]] == null){
      throw new IllegalArgumentException("Input needs to be valid. Make sure starting square has a piece on it");
    }

    if(!board[arrOfMoves[0]][arrOfMoves[1]].getColor().equals(color)){
      throw new IllegalArgumentException("Color for initial square should match player color");
    }

    if(board[arrOfMoves[2]][arrOfMoves[3]] != null){
      if(board[arrOfMoves[2]][arrOfMoves[3]].getColor().equals(color)){
        throw new IllegalArgumentException("Color for final square should not match if square is occupied");
      }
    }

    if(board[arrOfMoves[0]][arrOfMoves[1]].canMove(this, arrOfMoves[0], arrOfMoves[1], arrOfMoves[2], arrOfMoves[3])){

      if(isChecked(color)){
        //need to code this
        throw new IllegalArgumentException("Player is in check");
      }

      if(moveCompleted){
        //fails enpassant and castle
        //Switch
        board[arrOfMoves[2]][arrOfMoves[3]] = board[arrOfMoves[0]][arrOfMoves[1]];
        board[arrOfMoves[0]][arrOfMoves[1]] = null;
        scoreSheet.add(move);
      }

      if(board[arrOfMoves[2]][arrOfMoves[3]] != null){
        if(board[arrOfMoves[2]][arrOfMoves[3]].getClass().isInstance(new King(color))){
          if(moveCompleted){ //king moves
            ((King) board[arrOfMoves[2]][arrOfMoves[3]]).hasMoved = true;
          }
//where does it set hasCastled to true
          if(!(((King) board[arrOfMoves[2]][arrOfMoves[3]]).hasCastled)){
            //what is this
            if(arrOfMoves[3] - arrOfMoves[1] == 2){
              board[arrOfMoves[2]][arrOfMoves[3] - 1] = board[arrOfMoves[2]][arrOfMoves[3] + 1];
              board[arrOfMoves[2]][arrOfMoves[3] + 1] = null;

            }else{
              board[arrOfMoves[2]][arrOfMoves[3] + 1] = board[arrOfMoves[2]][arrOfMoves[3] - 2];
              board[arrOfMoves[2]][arrOfMoves[3] - 2] = null;
            }
            ((King) board[arrOfMoves[2]][arrOfMoves[3]]).hasCastled = false;
          }
        }
      }

    }

    //for pawns
    //what is moveCompleted
    if(moveCompleted){
      Piece temp2 = board[arrOfMoves[2]][arrOfMoves[3]];
      if(temp2 != null){
        if(temp2.getClass().isInstance(new Pawn(color))){
          Pawn piece=(Pawn) temp2;
          piece.hasMoved = true;

          if (piece.emPassanAble){
            int[] prevMove= parseScanner(scoreSheet.get(scoreSheet.size()-2));
            board[prevMove[2]][prevMove[3]]=null;
            piece.emPassanAble=false;
          }

          //promote
          Piece replacement;
          if(move.split(" ").length < 3){
            move += " s";
          }
          if(piece.getColor().equals(color)){
            if(arrOfMoves[2] == 7){
              switch(move.split(" ")[2].charAt(0)){
                case 'B': replacement = new Bishop("white"); break;
                case 'N': replacement = new Knight("white"); break;
                case 'R': replacement = new Rook("white"); break;
                default: replacement = new Queen("white"); break;
              }
              board[arrOfMoves[2]][arrOfMoves[3]] = replacement;
            }
          }else{
            if(arrOfMoves[2] == 0){
              switch(move.split(" ")[2].charAt(0)){
                case 'B': replacement = new Bishop("black"); break;
                case 'N': replacement = new Knight("black"); break;
                case 'R': replacement = new Rook("black"); break;
                default: replacement = new Queen("black"); break;
              }
              board[arrOfMoves[2]][arrOfMoves[3]] = replacement;
            }
          }
        }
      }
    }
  }

  private String convertCoord(int initialX, int initialY, int destX, int destY){

    String outputStr = "";

    switch(initialY){
      case 0: outputStr += 'a'; break;
      case 1: outputStr += 'b'; break;
      case 2: outputStr += 'c'; break;
      case 3: outputStr += 'd'; break;
      case 4: outputStr += 'e'; break;
      case 5: outputStr += 'f'; break;
      case 6: outputStr += 'g'; break;
      case 7: outputStr += 'h'; break;
      default: outputStr += 'a'; break;
    }

    int addInc = initialX + 1;

    outputStr += addInc + "";

    outputStr += " ";

    switch(destY){
      case 0: outputStr += 'a'; break;
      case 1: outputStr += 'b'; break;
      case 2: outputStr += 'c'; break;
      case 3: outputStr += 'd'; break;
      case 4: outputStr += 'e'; break;
      case 5: outputStr += 'f'; break;
      case 6: outputStr += 'g'; break;
      case 7: outputStr += 'h'; break;
      default: outputStr += 'a'; break;
    }

    addInc = destX + 1;

    outputStr += addInc + "";
    return outputStr;
  }

//Confused
  public boolean canAnyMove(String color){
    Piece[][] oldBoard = board.clone();

    for(int i = 0; i<board.length; i++){
      for(int j = 0; j<board[0].length; j++){

        //Check piece with each other piece

        for(int k = 0; k<board.length; k++){
          for(int l= 0; l<board[0].length; l++){
            try{
              if(board[i][j] != null){
                if(board[i][j].getColor().equals(color)){
                  makeMove(convertCoord(i, j, k, l), board[i][j].getColor(), false);
                  board = oldBoard;
                  return true;
                }
              }
              board = oldBoard;
            } catch(Exception e){
              board = oldBoard;
            }
          }
        }
      }
    }

    board = oldBoard;
    return false;
  }

  /*public boolean staleMate(String color){
    if (board.canAnyMove(color)==false){
      return true;
    }
    return false;
  }

  public boolean checkMate(String color){
    if (board.canAnyMove(color)==false){
      for (int i=0;i<board.length;i++){
        for (int k=0;k<board[i].length;k++){
          if (canMove(board, board.getKingPosition(color)[0], board.getKingPosition(color)[1], k, i)){
            return false;
          }
        }
      }
      return true;
    }
    return false;
  }
*/

  //Displays board given side to display from
  /*
  public String toString(){
  int k=8;
  for (int i=0;i<8;i++){
  System.out.print(k);
  k--;
  for (int j=0;j<board[i].length;j++){
  System.out.print(" "+ board[i][j]);
}
System.out.println();
}
System.out.print("  a b c d e f g h");
System.out.println();
}
else{
for (int i=0;i<board.length;i++){
System.out.print(i+1);
for (int j=board[i].length-1;j>=0;j--){
System.out.print(" "+ board[i][j]);
}
System.out.println();
}
System.out.print("  h g f e d c b a");
System.out.println();
}
*/

public String toString(){
  String str = "";
  int count1 = 0;
  for(Piece[] pieces: board){
    int count2 = 0;
    for(Piece piece: pieces){
      if(piece==null){
        str += " ";
      }else{
        str += piece;
      }
      str += " ";
    }
    str += "\n";
  }
  String reverse = "";
  String[] split = str.split("\n");
  for(int x = split.length-1; x >= 0; x--){
    reverse += x+1 + " " + split[x] + "\n";
  }
  reverse += "  a b c d e f g h \n";
  return reverse;
}
}
