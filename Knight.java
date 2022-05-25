public class Knight extends Piece{
  public Knight(boolean isWhite){
    super(isWhite);
  }

  public boolean canMove(ChessBoard board, Square initial, Square dest){
    if (dest.getPiece().isWhite() == this.isWhite()){
      return false;
    }else{
      int x = Math.abs(initial.getX() - dest.getX()); //horizontal distance from initial to destination
      int y = Math.abs(initial.getY() - dest.getY()); //vertical distance from initial to destination
      return (x*y) == 2;
    }
}
}
