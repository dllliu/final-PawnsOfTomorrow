public class Rook extends Piece{
  public Rook(boolean isWhite){
    super(isWhite);
  }

@Override
   public String toString(){
       if(this.isWhite() == true) return "♖";
        return "♜";
   }

  @Override
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    if (dest.getPiece().isWhite() == this.isWhite()){
      return false;
    }if (initial.getX() != dest.getX() || initial.getY() != dest.getY()){
      return false;
    }
    int inc = 0;
    if(dest.getX() != initial.getX()){
      if(dest.getX() > initial.getX()){
        inc = 1;
      }else{
        inc = -1;
      }
    for (int x = initial.getX() + inc; x < dest.getX(); x+= inc){
      if (!(board[x][dest.getY()]).equals(" ")) { //check if its not blank class
        return false;
      }
    }
    }
    if(dest.getY() != initial.getY()){
      if(dest.getY() > initial.getY()){
        inc = 1;
      }else{
        inc = -1;
      }
    for (int y = initial.getY() + inc; y < dest.getY(); y+= inc){
      if(!(board[dest.getX()][y]).equals(" ")) { //check if its not blank class
        return false;
      }
    }
    }
    return true;
}
}
