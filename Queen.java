public class Queen extends Piece{
  public Queen(boolean isWhite){
    super(isWhite);
  }

@Override
   public String toString(){
       if(this.isWhite() == true) return "♕";
        return "♛";
   }

  @Override
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    if (dest.getPiece().isWhite() == this.isWhite()){
      return false;
    }
      if(Math.abs(initial.getY() - dest.getY()) == Math.abs(initial.getX() - dest.getX())){
        return true;
    }
    return (Math.abs(initial.getY() - dest.getY())) == 0 || (Math.abs(initial.getX() - dest.getX())) == 0;
}
}
