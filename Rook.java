public class Rook extends Piece{

  public Rook(String color){
    this.color = color;
  }

@Override
   public String toString(){
       if (getColor().equals("white")) return "♖";
        return "♜";
   }

  @Override
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
    if (initialX != destX || initialY != initialX){
      return false;
    }

    int inc = 0;
    if (initialX != destX){
      if(initialX < destX){
        inc = 1;
      }else{
        inc = -1;
      }
    for (int x = initialX + inc; x < destX; x+= inc){

      if (board[x][destY] == null) { //check if its not blank class
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
    for (int y = initialY + inc; y < destY; y+= inc){
      if(board[destX][y] == null) {
        return false;
      }
    }
  }
    hasMoved = true;
    return true;
}

public String getColor(){
		return this.color;
	}
}
