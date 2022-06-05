public abstract class Piece{

  public boolean hasMoved;
  public String color;


  public String getColor(){
    return this.color;
  }

  public abstract boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY);
  public abstract String toString();

}
