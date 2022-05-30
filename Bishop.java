public class Bishop extends Piece{
  public Bishop(String color){
    super(color);
  }

  @Override
     public String toString(){
         if (getColor().equals("white")) return "♗";
          return "blackBishop";
     }

  @Override
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
    if ((initialY == destY && initialX == destX)) {
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
    int totalInc = rowInc + colInc;
    for(int x= initialX + rowInc; x<destX; x+= rowInc){
      if(board[x][totalInc] == null) {
        return false;
      }
      totalInc += colInc;
    }
    return true;
}
}
