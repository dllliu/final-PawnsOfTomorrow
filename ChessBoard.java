// valid moves will be checked in Piece class
import java.util.*;

public class ChessBoard{
  private Piece[][] board;
  private ArrayList<Piece> removedPieces;
  private ArrayList<Piece> currentPieces;

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

    //c.updateMove("N", 1, 2, 3, 3);
    c.printBoard(true);
    System.out.println("__________________");
    System.out.println("__________________");
    System.out.println("__________________");

    c.printBoard(false);
  }

  //Constructor
  public ChessBoard(){
    board=new Piece[8][8];
    removedPieces=new ArrayList<Piece>();
    //Need to create separate currentPieces for white and black
    currentPieces=new ArrayList<Piece>();

    for(int i=2; i< 6; i++){
      for(int j=0; j<8; j++){
        board[i][j] = null;
      }
    }

    //Board is initialized from white's perspective
    board[0][0]= new Rook(true);
    board[0][1]= new Knight(true);
    board[0][2]= new Bishop(true);
    board[0][3]= new Queen(true);
    board[0][4]= new King(true);
    board[0][5]= new Bishop(true);
    board[0][6]= new Knight(true);
    board[0][7]= new Rook(true);

    for(int y=0; y<=7; y++){
      board[1][y] = new Pawn(true);
    }

    board[7][0]= new Rook(false);
    board[7][1]= new Knight(false);
    board[7][2]= new Bishop(false);
    board[7][3]= new Queen(false);
    board[7][4]= new King(false);
    board[7][5]= new Bishop(false);
    board[7][6]= new Knight(false);
    board[7][7]= new Rook(false);

    for(int y=0; y<=7; y++){
      board[6][y] = new Pawn(false);
    }
  }

  //Makes move given piece and coordinates


  public boolean updateMove(Piece piece, int initialX, int initialY, int finalX, int finalY){
    if (board[initialX-1][initialY-1].equals(piece)){ //and it is a legal move
      board[initialX-1][initialY-1]=null;
      if (!(board[finalX-1][finalY-1].equals(null))){
        removedPieces.add(board[finalX-1][finalY-1]);
        currentPieces.remove(board[finalX-1][finalY-1]);
      }
      board[finalX-1] [finalY-1]= piece;
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
  }
}
