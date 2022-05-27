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
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    if (dest.getPiece().isWhite() == this.isWhite()){
      return false;
    }else{
      if(Math.abs(dest.getX() - initial.getX()) == 2 && (dest.getY() - initial.getY() == 1)){
			return true;
		}
		if(Math.abs(dest.getX() - initial.getX()) == 1 && Math.abs(dest.getY() - initial.getY()) == 2){
			return true;
		}
		return false;
    }
}
}
