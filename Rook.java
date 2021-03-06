public class Rook extends Piece{
  public boolean hasMoved;

  public Rook(String color){
    this.color = color;
    this.hasMoved=false;
  }

@Override
   public String toString(){
       if (getColor().equals("white")) return Color.colorize("♜",Color.WHITE+Color.BRIGHT);
        return Color.colorize("♜",Color.BLACK);
   }

  @Override
  public boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY){
    Piece[][] board=cb.board;
      if ((initialX != destX) && (initialY != destY)){
      return false;
    }

    int inc = 0;
    if (initialX != destX){
      if(initialX < destX){
        inc = 1;
      }else{
        inc = -1;
      }
    for (int x = initialX + inc; x != destX; x+= inc){
      if (board[x][destY] != null) { //check if its not blank class
        return false;
      }
    }
    }

    if (destY != initialY) {
      if(destY > initialY){
        inc = 1;
      }else{
        inc = -1;
      }
    for (int y = initialY + inc; y != destY; y+= inc){
      if(board[destX][y] != null) {
        return false;
      }
    }
    }
    return true;
}

public String getColor(){
		return this.color;
	}
}
