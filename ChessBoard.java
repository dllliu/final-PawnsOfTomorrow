// valid moves will be checked in Piece class
import java.util.*;

public class ChessBoard{
  private String[][] board;
  private ArrayList<String> removedPieces;
  private ArrayList<String> currentPieces;

  public static void main(String[] args){
    ChessBoard c = new ChessBoard();

    c.printBoard(true);

    System.out.println("__________________");
    System.out.println("__________________");
    System.out.println("__________________");

    c.printBoard(false);
    System.out.println("__________________");
    System.out.println("__________________");
    System.out.println("__________________");

    c.updateMove("N", 1, 2, 3, 3);
    c.printBoard(true);
    System.out.println("__________________");
    System.out.println("__________________");
    System.out.println("__________________");

    c.printBoard(false);
  }

  //Constructor
  public ChessBoard(){
    board=new String[8][8];
    for (int i=0;i<board.length;i++){
      for (int j=0;j<board[i].length;j++){
        board[i][j]=" ";
      }
    }
    removedPieces=new ArrayList<String>();
    //Need to create separate currentPieces for white and black
    currentPieces=new ArrayList<String>();

    //Board is initialized from white's perspective
    board[0][0]="R";
    board[0][1]="N";
    board[0][2]="B";
    board[0][3]="Q";
    board[0][4]="K";
    board[0][5]="B";
    board[0][6]="N";
    board[0][7]="R";

    board[1][0]="P";
    board[1][1]="P";
    board[1][2]="P";
    board[1][3]="P";
    board[1][4]="P";
    board[1][5]="P";
    board[1][6]="P";
    board[1][7]="P";

    board[7][0]="R";
    board[7][1]="N";
    board[7][2]="B";
    board[7][3]="Q";
    board[7][4]="K";
    board[7][5]="B";
    board[7][6]="N";
    board[7][7]="R";

    board[6][0]="P";
    board[6][1]="P";
    board[6][2]="P";
    board[6][3]="P";
    board[6][4]="P";
    board[6][5]="P";
    board[6][6]="P";
    board[6][7]="P";
  }

  //Makes move given piece and coordinates
  public boolean updateMove(String piece, int initialX, int initialY, int finalX, int finalY){
    if (board[initialX-1][initialY-1].equals(piece)){ //and it is a legal move
      board[initialX-1][initialY-1]=" ";
      if (!(board[finalX-1][finalY-1].equals(" "))){
        removedPieces.add(board[finalX-1][finalY-1]);
        currentPieces.remove(board[finalX-1][finalY-1]);
      }
      board[finalX-1] [finalY-1]=piece;
      return true;
    }
    return false;
  }

  //Displays board given side to display from
  public void printBoard(boolean whiteView){
    if (whiteView){
      int k=8;
      for (int i=0;i<8;i++){
        System.out.print(k);
        k--;
        for (int j=0;j<board[i].length;j++){
          System.out.print(" "+board[i][j]);
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
          System.out.print(" "+board[i][j]);
        }
        System.out.println();
      }
      System.out.print("  h g f e d c b a");
      System.out.println();
    }
  }
}
