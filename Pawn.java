public class Pawn extends Piece{
  public Pawn(String color){
    super(color);
  }

  @Override
     public String toString(){
         if(getColor().equals("white")) return "♙";
        return "♟︎";
     }

   @Override
     public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
       if (getColor().equals("white")) {
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
        }
       else if (Math.abs(destX - initialX) == 2){
         if (hasMoved){
           return false;
         }if (getColor().equals("white")) {
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
       if (Math.abs(destX-initialX)==1&&Math.abs(destY-destX)==1){
         if (board[initialX-2][initialY]!=board[initialX-1][initialY]||board[initialX][initialY]!= board[initialX-1][initialY]){
           return true;
         }
       }
       return true;
     }

     public String getColor(){
		return this.color;

	}

   }
