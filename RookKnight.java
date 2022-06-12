public class RookKnight extends Piece{
  public boolean hasMoved;

  public RookKnight(String color){
    this.color = color;
    this.hasMoved=false;
  }

@Override
   public String toString(){
       if (getColor().equals("white")) return Color.colorize("♜",Color.WHITE);
        return Color.colorize("♜",Color.BLACK);
   }

  @Override
  public boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY){
    Piece[][] board=cb.board;
    return new Rook(getColor()).canMove(cb, initialX, initialY, destX, destY) || new Knight(getColor()).canMove(cb, initialX, initialY, destX, destY);
}

public String getColor(){
		return this.color;
	}
}
