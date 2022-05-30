// valid moves will be checked in Piece class
import java.util.*;
import java.io.IOException;

public class ChessBoard{
  public Piece[][] board;

  //Constructor
  public ChessBoard(){
    board=new Piece[8][8];
    for(int i=2; i< 6; i++){
      for(int j=0; j<8; j++){
        board[i][j] = null;
      }
    }

    //Board is initialized from white's perspective
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

  public boolean isChecked(String color){
    int[] kingPos = getKingPos(color);
    int r = kingPos[0];
    int c = kingPos[1];

    for(int i =0; i<board.length; i++){
      for(int j=0; j<board[0].length; j++){
        if(board[i][j] != null){
          if (board[i][j].canMove(board, i, j, r, c) && !board[i][j].getColor().equals(color)){
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
        case 'b':  return 1;
        case 'c':  return 2;
        case 'd':  return 3;
        case 'e':  return 4;
        case 'f':  return 5;
        case 'g':  return 6;
        case 'h':  return 7;
        default: return 8;
      }
    }
    
  public static int[] parse(String move){
     int[] output = new int[4];
     String[] split = move.split(" ");
     output[1] = charToInt(Character.toLowerCase(split[0].charAt(0)));
     output[0] = Integer.parseInt(move.charAt(1) + "") - 1;
     output[3] = charToInt(Character.toLowerCase(split[1].charAt(0)));
     output[2] = Integer.parseInt(split[1].charAt(1) + "") - 1;
     return output;
   }

   private int[] getKingPos(String color){
   int r = 0;
   int c = 0;
   for(int i =0; i<board.length; i++){
     for(int j=0; j<board[0].length; j++){
       if(board[i][j] != null){
         if(board[i][j].getClass().isInstance(new King("white")) && board[i][j].getColor().equals(color)){
           r = i;
           c = j;
         }
       }
     }
   }
   int[] out = new int[2];
   out[0] = r;
   out[1] = c;
   return out;
 }

  public void makeMove(String move, String color, boolean willMove) throws IOException {
    int[] moveArr = parse(move);

    if(board[moveArr[0]][moveArr[1]] == null){
      throw new IOException();
    } if(board[moveArr[0]][moveArr[1]].getColor().equals(color)){
      throw new IOException();
    }if(board[moveArr[2]][moveArr[3]] != null){
      if (board[moveArr[2]][moveArr[3]].getColor().equals(color)){
        throw new IOException();
      }
    } if (board[moveArr[0]][moveArr[1]].canMove(board, moveArr[0], moveArr[1], moveArr[2], moveArr[3])) { //if its a valid move
      if(isChecked(color)){
        throw new IOException();
      }
      if(willMove){
        board [moveArr[2]][moveArr[3]] = board[moveArr[0]][moveArr[1]];
        board[moveArr[0]][moveArr[1]] = null;
      } if(board[moveArr[2]][moveArr[3]] != null){
        if(board[moveArr[2]][moveArr[3]].getClass().isInstance(new King("white"))){
          if(willMove){
            ((King) board[moveArr[2]][moveArr[3]]).hasMoved = true;
          }
          if  (((King) board[moveArr[2]][moveArr[3]]).hasCastled) {
            if(moveArr[3] - moveArr[1] == 2){
              board[moveArr[2]][moveArr[3]-1] = board[moveArr[2]][moveArr[3]+1];
              board[moveArr[2]][moveArr[3]+1] = null;
            }else{
              board[moveArr[2]][moveArr[3]+1] = board[moveArr[2]][moveArr[3]-1];
              board[moveArr[2]][moveArr[3]-1] = null;
            }
            ((King) board[moveArr[2]][moveArr[3]]).hasCastled = false;
          }
        }
      }
    } else{
      throw new IOException();
    }

    if(willMove){
      Piece pc = board[moveArr[2]][moveArr[3]];
      pc.emPassanAble = false;
      if (pc != null){
        if (pc.getClass().isInstance(new Pawn("white"))){
          pc.hasMoved = true;
          Piece replacement;
          if(move.split(" ").length <= 2){
            move += " s";
          } if (pc.getColor().equals("white")){
            if(moveArr[2] == 7){
              switch(move.split(" ")[2].charAt(0)){
                case 'N': replacement = new Knight("white"); break;
                case 'B': replacement = new Bishop("white"); break;
                default: replacement = new Queen("white"); break;
              }board[moveArr[2]][moveArr[3]] = replacement;
            }
          }else{
             if(moveArr[2] == 0){
               switch(move.split(" ")[2].charAt(0)){
                 case 'N': replacement = new Knight("black"); break;
                 case 'B': replacement = new Bishop("black"); break;
                default: replacement = new Queen("black"); break;
          }
          board[moveArr[2]][moveArr[3]] = replacement;
        }
      }
    }
  }
}
}
     public boolean canAnyMove(String color){
        Piece[][] oldBoard = board.clone();
        for(int i =0; i<board.length; i++){
          for(int j=0; j<board[0].length; j++){
            for(int x =0; x<board.length; x++){
              for(int y=0; y<board[0].length; y++){
                try{
                  if (board[i][j] != null){
                     if(board[i][j].getColor().equals(color)){
                        makeMove(convertMoveString(i, j, x, y), board[x][y].getColor(), false);
                         board = oldBoard;
                         return true;
                  }
                }
                board = oldBoard;
              } catch (Exception e){
                board = oldBoard;
              }
            }
          }
        }
     }
     board = oldBoard;
     return false;
   }

   private String convertMoveString(int r, int c, int destR, int destC){
     String output = "";
      switch(c){
        case 0: output += 'a'; break;
        case 1: output += 'b'; break;
        case 2: output += 'c'; break;
        case 3: output += 'd'; break;
        case 4: output += 'e'; break;
        case 5: output += 'f'; break;
        case 6: output += 'g'; break;
        case 7: output += 'h'; break;
        default: output += 'a'; break;
      }

        int temp = r + 1;
        output += temp + "";
        output += " ";

        switch(destC){
          case 0: output += 'a'; break;
          case 1: output += 'b'; break;
          case 2: output += 'c'; break;
          case 3: output += 'd'; break;
          case 4: output += 'e'; break;
          case 5: output += 'f'; break;
          case 6: output += 'g'; break;
          case 7: output += 'h'; break;
          default: output += 'a'; break;
        }

        int t = destR + 1;
        output += t + "";
        return output;
   }

   public boolean staleMate(String color){
      return false;
    }




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
    String string = "";
    int count1 = 0;
    for(Piece[] pieces: board){
      int count2 = 0;
      for(Piece piece: pieces){
          if(piece==null){
              if(count1%2 == 0){
                if(count2%2 == 0){
                  string += "##";
                }else{
                  string += "  ";
                }
              }else{
                  if(count2%2 == 0){
                    string += "  ";
              }else{
                  string += "##";
                }
              }
            }else{
              string += piece;
            } string += " ";
            count2 ++;
          }count1 ++;
          string += "\n";
        }
      String reverseString = "";
      reverseString += "  a  b  c  d  e  f  g  h \n";
      String[] stringSplit = string.split("\n");
      for(int x = stringSplit.length-1; x >= 0; x--){
          reverseString += x+1 + " " + stringSplit[x] + "\n";
      }
      return reverseString;
  }


}
