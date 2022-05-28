public class Queen extends Piece{
  public Queen(boolean isWhite){
    super(isWhite);
  }

@Override
   public String toString(){
       if(this.isWhite() == true) return "♕";
        return "♛";
   }

  @Override
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
    return new Rook(isWhite).canMove(board, initialX, initialY, destX, destY) || new Bishop(isWhite).canMove(board, initialX, initialY, destX, destY);
}
}
