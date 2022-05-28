public class Knight extends Piece{
  public Knight(boolean isWhite){
    super(isWhite);
  }

@Override
   public String toString(){
       if(this.isWhite() == true) return "♘";
       return "♞";
   }

  @Override
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
      if(Math.abs(destX - initialX) == 2 && Math.abs(destY - initialY) == 1) {
			return true;
		}
		if(Math.abs(destX - initialX) == 1 && Math.abs(destY - initialY) == 2){
			return true;
		}
		return false;
    }
}
