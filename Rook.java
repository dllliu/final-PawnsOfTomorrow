public class Rook extends Piece{
  public Rook(boolean isWhite){
    super(isWhite);
  }

@Override
   public String toString(){
       if(this.isWhite() == true) return "♖";
        return "♜";
   }

  @Override
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    if (dest.getPiece().isWhite() == this.isWhite()){
      return false;
    }else{
      return initial.getX()==dest.getX() || initial.getY()==dest.getY();
      }
}
}
