public class Pawn extends Piece{
  public Pawn(boolean white){
    super(white);
  }

  @Override
     public String toString(){
         if(this.isWhite() == true) return "♙";
        return "♟︎";
     }

   @Override
     public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
       if (isWhite){
         if(initialX > destX){ //cant go to left or right
           return false;
         }
       }else{
         if (destX > initialX){
           return false;
         }
       }
       if (Math.abs(destX - initialX) > 2){
         return false;
       }else if (Math.abs(destX - initialX) == 2){
         if (hasMoved){
           return false;
         }if (isWhite){
           if(board[initialX + 2][initialY] != null){
            return false;
          }else if (board[initialX - 2][initialY] != null){
            return false;
          }
         }
       }else{
         if (Math.abs(destY - initialY) != 1 || Math.abs(destX - initialX) != 1){
           return false;
         } if (board[destX][destY] == null){
           return false;
         }
       }
       return true;
     }
}
