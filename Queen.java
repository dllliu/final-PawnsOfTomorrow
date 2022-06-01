
public class Queen extends Piece{
  public Queen(String color){
    this.color = color;
  }

@Override
   public String toString(){
       if (getColor().equals("white")) return "♕";
        return "♛";
   }

  @Override
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
    return new Rook(getColor()).canMove(board, initialX, initialY, destX, destY) || new Bishop(getColor()).canMove(board, initialX, initialY, destX, destY);
}

public String getColor(){
		return this.color;
	}
}
