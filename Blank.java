public class Blank extends Piece{
  public Blank(boolean isWhite){
    super(isWhite);
  }

  @Override
     public String toString(){
         return " ";
     }

  @Override
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    return false;
}
}
