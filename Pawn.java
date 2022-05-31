public class Pawn extends Piece{
  private String name;
  private int value;
  private boolean jumpTwo;

  public Pawn(boolean isWhite){
    name="Pawn";
    value=1;
    jumpTwo=true; 
  }

  public boolean promote(Pawn piece, int initialX,int initialY, int finalX, int finalY, board, Piece newPiece){
    if (isWhite){
      if (initialY==7&&finalY==8&&initalX==finalX){
        if ((board[board.length-initialY][finalX-1]==Pawn)&&(board[board.length-initialY-1][finalX-1]!=Piece)){
            board[board.length-initialY-1][finalX-1]=newPiece;
            board[board.length-initialY][finalX-1]==" ";
        }
      }
    }
    if (!isWhite){
      if (initialY==2&&finalY==1&&initalX==finalX){
        if ((board[board.length-initialY][finalX-1]==Pawn)&&(board[board.length-initialY-1][finalX-1]!=Piece)){
            board[board.length-initialY-1][finalX-1]=newPiece;
            board[board.length-initialY][finalX-1]==" ";
            removedPieces.add(newPiece);
            currentPieces.remove(Pawn);
        }
      }
    }
  }

  public void enPassant(Pawn piece, int initialX,int initialY, int finalX, int finalY, board, Piece newPiece){
    if (isWhite){
      if (initialY==5&&board[board.length-initialY][initialX-1]==BLACKPawn&&board[board.length-initialY][initialX-1]==BLACKPawn){
        if(initialX==finalX-1||initialX==finalX+1){
          board[board.length-finalY][finalX-1]=" ";
          board[board.length-finalY-1][finalX-1]=Pawn;
        }
      }
    }
    if (!isWhite){
      if (initialY==4&&board[board.length-initialY][initialX-1]==WHITEPawn||board[board.length-initialY][initialX-1]==WHITEPawn){
        if(initialX==finalX-1||initialX==finalX+1){
          board[board.length-finalY][finalX-1]=" ";
          board[board.length-finalY+1][finalX-1]=Pawn;
        }
      }
    }
  }

  public String[][] validMove(String piece,String[][] board, int initialX,int initialY){
    String[][] board = new board[8][8]
    if (jumpTwo){
      if (board[board.length-initialY-2][initialX-1]!=Piece){
        board[board.length-initialY-2][initialX-1]="."
      }
      jumpTwo=false;
    }
    if (board[board.length-initialY-1][initialX-1]!=Piece){
      board[board.length-initialY-1][initialX-1]="."
    }
  }alidMove(piece, board, initialX, initialY);
  public boolean canJumpTwo(){
    }
  }
}
