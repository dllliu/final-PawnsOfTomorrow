
public class Queen extends Piece{
  public String color;

  public Queen(String color){
    this.color = color;
  }

@Override
   public String toString(){
       if (getColor().equals("white")) return "♕";
        return "♛";
   }

  @Override
  public boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY){
    Piece[][] board=cb.board;
        return new Rook(getColor()).canMove(cb, initialX, initialY, destX, destY) || new Bishop(getColor()).canMove(cb, initialX, initialY, destX, destY);
}

public String getColor(){
		return this.color;
	}
}
