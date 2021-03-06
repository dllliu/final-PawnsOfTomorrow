
public class Knight extends Piece{
  public Knight(String color){
    this.hasMoved=false;
    this.color = color;
  }

@Override
   public String toString(){
       if (getColor().equals("white")) return Color.colorize("♞",Color.WHITE+Color.BRIGHT);
       return Color.colorize("♞",Color.BLACK);
   }

  @Override
  public boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY){
    Piece[][] board=cb.board;
          if(Math.abs(destX - initialX) == 2 && Math.abs(destY - initialY) == 1) {
			return true;
		}
		if(Math.abs(destX - initialX) == 1 && Math.abs(destY - initialY) == 2){
			return true;
		}
		return false;
    }

    public String getColor(){
		return this.color;
	}

}
