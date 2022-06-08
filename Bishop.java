public class Bishop extends Piece{
  public Bishop(String color){
    this.color = color;
  }

  @Override
     public String toString(){
         if (getColor().equals("white")) return Color.colorize("♝",Color.WHITE);
          return Color.colorize("♝",Color.BLACK);
     }

  @Override
  public boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY){
    Piece[][] board=cb.board;
      if ((initialY == destY || initialX == destX)) {
      return false;
    }else if (Math.abs(initialY - destY) != (Math.abs(initialX - destX))) {
      return false;
    }
    int rowInc = 0;
    int colInc = 0;
    if (initialX < destX){
      rowInc = 1;
    }else{
      rowInc = -1;
    }
    if (initialY < destY) {
      colInc = 1;
    }else{
      colInc = -1;
    }
    int totalInc = initialY + colInc;
    for(int x= initialX + rowInc; x != destX; x+= rowInc){
      if(board[x][totalInc] != null) {
        return false;
      }
      totalInc += colInc;
    }
    return true;
}

public String getColor(){
		return this.color;
	}
}
