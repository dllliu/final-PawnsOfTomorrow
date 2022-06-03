
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
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
    return new Rook(color).canMove(board, initialX, initialY, destX, destY) || new Bishop(color).canMove(board, initialX, initialY, destX, destY);
}

public String getColor(){
		return this.color;
	}
}
