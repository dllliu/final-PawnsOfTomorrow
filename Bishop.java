public class Bishop extends Piece{
  public Bishop(boolean isWhite){
    super(isWhite);
  }

  @Override
     public String toString(){
         if(this.isWhite() == true) return "♗";
         return "♝";
     }

  @Override
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    return Math.abs(initial.getY() - dest.getY()) == Math.abs(initial.getX() - dest.getX());
}
}
