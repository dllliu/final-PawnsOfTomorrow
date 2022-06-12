import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class ChessBoard {
  public Piece[][] board;
  public ArrayList<String> scoreSheet=new ArrayList<String>();
  public int count50;

  public ChessBoard(ArrayList<String> locationList, ArrayList<String> piecesList, ArrayList<String> colorList){
    count50=0;
    board=new Piece[8][8];
    for (int i=0;i<locationList.size();i++){
      if (piecesList.get(i).equals("rook")){
        board[Integer.parseInt(locationList.get(i).substring(1,2))][Integer.parseInt(locationList.get(i).substring(0,1))]=new Rook(colorList.get(i));
      }
      if (piecesList.get(i).equals("pawn")){
        board[Integer.parseInt(locationList.get(i).substring(1,2))][Integer.parseInt(locationList.get(i).substring(0,1))]=new Pawn(colorList.get(i));
      }
      if (piecesList.get(i).equals("bishop")){
        board[Integer.parseInt(locationList.get(i).substring(1,2))][Integer.parseInt(locationList.get(i).substring(0,1))]=new Bishop(colorList.get(i));
      }
      if (piecesList.get(i).equals("knight")){
        board[Integer.parseInt(locationList.get(i).substring(1,2))][Integer.parseInt(locationList.get(i).substring(0,1))]=new Knight(colorList.get(i));
      }
      if (piecesList.get(i).equals("king")){
        board[Integer.parseInt(locationList.get(i).substring(1,2))][Integer.parseInt(locationList.get(i).substring(0,1))]=new King(colorList.get(i));
      }
      if (piecesList.get(i).equals("queen")){
        board[Integer.parseInt(locationList.get(i).substring(1,2))][Integer.parseInt(locationList.get(i).substring(0,1))]=new Queen(colorList.get(i));
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

  public int[] getKingPosition(String color){
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

  public boolean getPawns(String color){
    for(int i = 0; i<board.length; i++){
      for(int j = 0; j<board[0].length; j++){
        if(board[i][j] != null){
          if(board[i][j].getColor().equals(color)){
              return true;
          }
        }
      }
    }
  return false;
  }


public static void makeChess960(){

  ArrayList<String> locationList960 = new ArrayList<String>();
  ArrayList<String> piecesList960 = new ArrayList<String>();
  ArrayList<String> colorList960 = new ArrayList<String>();

  for(int i=0; i<=7; i++){
    locationList960.add("" + i + "" + 0);
  }

  for(int i=0; i<=7; i++){
    locationList960.add("" + i + "" + 1);
  }

  for(int i=0; i<=7; i++){
      locationList960.add("" + i + "" + 6);
  }

  for(int i=0; i<=7; i++){
    locationList960.add("" + i + "" + 7);
  }

  String[] notPawns = {"rook", "knight", "bishop", "queen", "king", "bishop", "knight", "rook"};
  List<String> list =Arrays.asList(notPawns);
  Collections.shuffle(list);
  list.toArray(notPawns);
  String str = "";
  int firstBIndex = -1;
  boolean val = true;
  loop: for(int i=0; i<notPawns.length; i++){
    switch(notPawns[i]) {
      case "bishop":
      if (firstBIndex == -1) {
        firstBIndex = i;
      } else {
        if (firstBIndex % 2 == i % 2) {
          val = false;
          break loop;
        }
      }
      break;
    }
  }

if(val){
  for(int i=0; i<notPawns.length; i++){
  piecesList960.add(notPawns[i]);
}
}

piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");

piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");
piecesList960.add("pawn");

String[] notPawns1 = {"rook", "knight", "bishop", "queen", "king", "bishop", "knight", "rook"};
List<String> list1 =Arrays.asList(notPawns);
Collections.shuffle(list);
list.toArray(notPawns);
String str1 = "";
int firstBIndex1 = -1;
boolean val1 = true;
loop: for(int i=0; i<notPawns1.length; i++){
  switch(notPawns1[i]) {
    case "bishop":
    if (firstBIndex1 == -1) {
      firstBIndex1 = i;
    } else {
      if (firstBIndex1 % 2 == i % 2) {
        val1 = false;
        break loop;
      }
    }
    break;
  }
}

if(val){
for(int i=0; i<notPawns.length; i++){
piecesList960.add(notPawns[i]);
}
}

  for(int i=0; i<16; i++){
    colorList960.add("white");
  }

  for(int i=0; i<16; i++){
  colorList960.add("black");
}
  ChessBoard fischerBoard = new ChessBoard(locationList960, piecesList960, colorList960);
  String color = "white";

  while(true){
  System.out.println("\nChess Mode is: Fischer Chess or Chess 960");
  System.out.println (fischerBoard.scoreSheet.toString());
  System.out.println(fischerBoard.toString(color));
  System.out.println(color + " enter your move");
  Scanner in = new Scanner(System.in);
  String move = in.nextLine();
  if (move.contains("resign")){
    System.out.println(color + " resigns");
    System.out.println(otherColor(color) + " wins");
    return;
  }
  System.out.print("\033[H\033[2J");
  System.out.flush();
  try{
    fischerBoard.makeMove(move, color, true);
  }catch(IllegalArgumentException e){
    //e.printStackTrace();
    System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
    continue;
  }

  Piece[][] oldBoard = fischerBoard.board.clone();
if(!fischerBoard.canAnyMove(otherColor(color))){
    if(!fischerBoard.canAnyMove(otherColor(color))){
    System.out.println(color + " checkmated " + otherColor(color));
  }else{
    System.out.println("Game has ended in a stalemate");
  }
  return;
}
  fischerBoard.board = oldBoard;
 if(fischerBoard.isChecked(otherColor(color))) {
    System.out.println(otherColor(color) + " is in check.");
  }
    color = otherColor(color);
    if (fischerBoard.count50 == 100){
      System.out.println("Game has ended in a draw due to the 50 move rule");
      return;
    }
    if(fischerBoard.getPawns("white") == false){
      System.out.println("black has has won the game by capturing all white pawns");
      return;
    }
}
}

public static String otherColor(String color){
  if (color.equals("white")){
    return "black";
  }
  return "white";
}


//moveCompleted makes sure it's completely a valid square
  public void makeMove(String move, String color, boolean moveCompleted) throws IllegalArgumentException{
    boolean reset=false;
    int[] arrOfMoves = parseScanner(move);

    if (arrOfMoves[0]<0||arrOfMoves[0]>7||arrOfMoves[1]<0||arrOfMoves[1]>7||arrOfMoves[2]<0||arrOfMoves[2]>7||arrOfMoves[3]<0||arrOfMoves[3]>7){
      throw new IllegalArgumentException("Input needs to be valid. Make sure the move is not out of bounds");
    }
    if(board[arrOfMoves[0]][arrOfMoves[1]] == null){
      throw new IllegalArgumentException("Input needs to be valid. Make sure starting square has a piece on it");
    }

    if(!board[arrOfMoves[0]][arrOfMoves[1]].getColor().equals(color)){
      throw new IllegalArgumentException("Color for initial square should match player color");
    }

    if(board[arrOfMoves[2]][arrOfMoves[3]] != null){
      if(board[arrOfMoves[2]][arrOfMoves[3]].getColor().equals(color)){
        throw new IllegalArgumentException("Destination square is occupied by a piece of the same color");
      }
      else{
        reset=true;
      }
    }

    if(board[arrOfMoves[0]][arrOfMoves[1]].canMove(this, arrOfMoves[0], arrOfMoves[1], arrOfMoves[2], arrOfMoves[3])){
      Piece[][] oldBoard=new Piece[board.length][board.length];
      for (int i=0;i<board.length;i++){
        for (int k=0;k<board.length;k++){
          oldBoard[i][k]=board[i][k];
        }
      }
      board[arrOfMoves[2]][arrOfMoves[3]] = board[arrOfMoves[0]][arrOfMoves[1]];
      board[arrOfMoves[0]][arrOfMoves[1]] = null;
      if(moveCompleted){
        scoreSheet.add(move);
       }

      //empassant
      Piece temp2 = board[arrOfMoves[2]][arrOfMoves[3]];
      if(temp2 != null){
        if(temp2.getClass().isInstance(new Pawn(color))){
          reset=true;
          Pawn piece=(Pawn) temp2;
          if (piece.emPassanAble){
            int[] prevMove;
            if (moveCompleted){
              prevMove= parseScanner(scoreSheet.get(scoreSheet.size()-2));
            }
            else {
              prevMove= parseScanner(scoreSheet.get(scoreSheet.size()-1));
            }
            board[prevMove[2]][prevMove[3]]=null;
            if(moveCompleted){
              piece.emPassanAble=false;
            }
          }
/*
          if(scoreSheet.size() >= 7){
            int[] wMove1 = parseScanner(scoreSheet.get(scoreSheet.size()-6));
            int[] bMove1 = parseScanner(scoreSheet.get(scoreSheet.size()-5));
            int[] wMove2 = parseScanner(scoreSheet.get(scoreSheet.size()-4));
            int[] bMove2 = parseScanner(scoreSheet.get(scoreSheet.size()-3));
            int[] wMove3 = parseScanner(scoreSheet.get(scoreSheet.size()-2));
            int[] bMove3 = parseScanner(scoreSheet.get(scoreSheet.size()-1));
          if(Arrays.equals(wMove1,wMove2) && Arrays.equals(wMove2,wMove3) && Arrays.equals(bMove1,bMove2) && Arrays.equals(bMove2,bMove3)) {
            System.out.println("The game has ended in a stalemate. You cannot have the same moves on each side three times in a row");
            return;
          }
        }
        */

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

      if(isChecked(color)){
        for (int i=0;i<board.length;i++){
          for (int k=0;k<board.length;k++){
            board[i][k]=oldBoard[i][k];
          }
        }
        if (moveCompleted){
          scoreSheet.remove(scoreSheet.size()-1);
        }
        throw new IllegalArgumentException("Player is in check");
      }

      if(board[arrOfMoves[2]][arrOfMoves[3]] != null){ //if there is a rook there
        if(board[arrOfMoves[2]][arrOfMoves[3]].getClass().isInstance(new King(color))){ //new King

          //set hasCastled to true
          if(((King) board[arrOfMoves[2]][arrOfMoves[3]]).hasCastled){
            if((arrOfMoves[3] - arrOfMoves[1] == 2)) { //if the difference in row number is 2
              board[arrOfMoves[2]][arrOfMoves[3] - 1] = board[arrOfMoves[2]][arrOfMoves[3] + 1]; //
              board[arrOfMoves[2]][arrOfMoves[3] + 1] = null;
            }
            else{
              board[arrOfMoves[2]][arrOfMoves[3] + 1] = board[arrOfMoves[2]][arrOfMoves[3] - 2];
              board[arrOfMoves[2]][arrOfMoves[3] - 2] = null;
            }
            if(moveCompleted){
              ((King) board[arrOfMoves[2]][arrOfMoves[3]]).hasCastled = false;
            }
          }
        }
      }
    }
    else{
      throw new IllegalArgumentException();
    }
    if (moveCompleted){
      board[arrOfMoves[2]][arrOfMoves[3]].hasMoved=true;
      if (reset){
        count50=1;
      }
      else{count50++;}
    }
  }

  public String convertCoord(int initialX, int initialY, int destX, int destY){
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

  public boolean canAnyMove(String color){
    Piece[][] oldBoard=new Piece[board.length][board.length];
    for (int i=0;i<board.length;i++){
      for (int k=0;k<board.length;k++){
        oldBoard[i][k]=board[i][k];
      }
    }
    for(int i = 0; i<board.length; i++){
      for(int j = 0; j<board[0].length; j++){

        //Check piece with each other piece

        for(int k = 0; k<board.length; k++){
          for(int l= 0; l<board[0].length; l++){
            try{
              if(board[i][j] != null){
                if(board[i][j].getColor().equals(color)){
                  makeMove(convertCoord(i, j, k, l), board[i][j].getColor(), false);

                    for (int m=0;m<board.length;m++){
                      for (int n=0;n<board.length;n++){
                        board[m][n]=oldBoard[m][n];
                      }
                    }
                    return true;
                  }
                }
            } catch(Exception e){
                for (int m=0;m<board.length;m++){
                  for (int n=0;n<board.length;n++){
                    board[m][n]=oldBoard[m][n];
                  }
                }
              }
          }
        }
      }
    }
   return false;
  }


/*
public String toString(){
  String str = "";
  for(Piece[] pieces: board){
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
*/

/*
public String toString(){
  String str = "";
  int countRow = 0;
  for(Piece[] pieces: board){
    int countCol = 0;
    for(Piece piece: pieces){
      if(piece==null){
        str += " ";
      }
      else{
      str += piece;
    }
      str += " ";
    }
    countRow++;
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
    */



    public String toString(String color){
      String str = "";
      int countRow = 0;
      String reverseString;
      if (color.equals("white")){
      for(Piece[] pieces: board){
        int countCol = 0;
        for(Piece piece: pieces){
          if(piece==null){
            if(countRow%2 == 0){
              if(countCol%2 == 0){
                str += Color.colorize(" ", Color.BLUE + Color.BACKGROUND);
              }else{
                str += Color.colorize(" ", Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }
            }else{
              if(countCol%2 == 0){
                str += Color.colorize(" ",Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }else{
                str += Color.colorize(" ", Color.BLUE + Color.BACKGROUND);
              }
            }
          }else if(piece != null){
            if(countRow%2 == 0){
              if(countCol%2 == 0){
                str += Color.colorize(piece.toString(), Color.BLUE + Color.BACKGROUND);
              }else{
                str += Color.colorize(piece.toString(), Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }
            }else{
              if(countCol%2 == 0){
                str += Color.colorize(piece.toString(),Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }else{
                str += Color.colorize(piece.toString(), Color.BLUE + Color.BACKGROUND);
              }
            }
        }
          str += " ";
          countCol++;
      }
        countRow++;
        str += "\n";
      }
     reverseString = "";

      reverseString += "  a b c d e f g h \n";
      String[] stringSplit = str.split("\n");
      for(int x = stringSplit.length-1; x >= 0; x--){
        reverseString += x+1 + " " + stringSplit[x] + "\n";
      }
    }
      else{
      for(int i=board.length-1;i>=0;i--){
        int countCol = 0;
        for(int j=board.length-1;j>=0;j--){
          if(board[i][j]==null){
            if(countRow%2 == 0){
              if(countCol%2 == 0){
                str += Color.colorize(" ", Color.BLUE + Color.BACKGROUND);
              }else{
                str += Color.colorize(" ", Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }
            }else{
              if(countCol%2 == 0){
                str += Color.colorize(" ",Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }else{
                str += Color.colorize(" ", Color.BLUE + Color.BACKGROUND);
              }
            }
          }else if(board[i][j] != null){
            if(countRow%2 == 0){
              if(countCol%2 == 0){
                str += Color.colorize(board[i][j].toString(), Color.BLUE + Color.BACKGROUND);
              }else{
                str += Color.colorize(board[i][j].toString(), Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }
            }else{
              if(countCol%2 == 0){
                str += Color.colorize(board[i][j].toString(),Color.RED+Color.BRIGHT + Color.BACKGROUND);;
              }else{
                str += Color.colorize(board[i][j].toString(), Color.BLUE + Color.BACKGROUND);
              }
            }
        }
          str += " ";
          countCol++;
      }
        countRow++;
        str += "\n";
      }
       reverseString = "";

      String[] stringSplit = str.split("\n");
      for(int x = stringSplit.length-1;x>=0; x--){
        reverseString +=    stringSplit[x] +(8-x)+ "\n";
      }
      reverseString += "h g f e d c b a \n";
    }
    return reverseString;
  }


  public ArrayList<String> allPossibleMoves(String color){
    ArrayList<String> list = new ArrayList<String>();
    Piece[][] oldBoard=new Piece[board.length][board.length];
    for (int i=0;i<board.length;i++){
      for (int k=0;k<board.length;k++){
        oldBoard[i][k]=board[i][k];
      }
    }
    for(int i = 0; i<board.length; i++){
      for(int j = 0; j<board[0].length; j++){

        //Check piece with each other piece

        for(int k = 0; k<board.length; k++){
          for(int l= 0; l<board[0].length; l++){
            try{
              if(board[i][j] != null){
                if(board[i][j].getColor().equals(color)){
                  makeMove(convertCoord(i, j, k, l), board[i][j].getColor(), false);
                    list.add(convertCoord(i,j,k,l));
                    for (int m=0;m<board.length;m++){
                      for (int n=0;n<board.length;n++){
                        board[m][n]=oldBoard[m][n];
                      }
                    }
                  }
                }
            } catch(Exception e){
                for (int m=0;m<board.length;m++){
                  for (int n=0;n<board.length;n++){
                    board[m][n]=oldBoard[m][n];
                  }
                }
              }
          }
        }
      }
    }
    return list;
  }
}
