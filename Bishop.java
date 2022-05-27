public class Bishop extends Piece{
  public Bishop(boolean isWhite){
    super(isWhite);
  }

  @Override
     public String toString(){
         if(this.isWhite() == true) return "♗";
         return "♝";
     }

  @Override
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    if (Math.abs(initial.getY() == dest.getY()) && Math.abs(initial.getX() == dest.getX())){
      return false;
    }else if (Math.abs(initial.getY() - dest.getY()) != Math.abs(initial.getX() - dest.getX())){
      return false;
    }
    int rowInc = 0;
    int colInc = 0;
    if (initial.getX() < dest.getX()){
      rowInc = 1;
    }else{
      rowInc = -1;
    }
    if (initial.getY() < dest.getY()){
      colInc = 1;
    }else{
      colInc = -1;
    }
    int totalInc = rowInc + colInc;
    for(int x= initial.getX() + rowInc; x<dest.getX(); x+= rowInc){
      if(!(board[x][y]).equals(" ")) { //check if its not blank class
        return false;
      }
      totInc += colInc;
    }
    return true;
}
}
