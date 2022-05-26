public class King extends Piece{

  private boolean hasCastled = false;

  public King(boolean white){
    super(white);
  }

  @Override
     public String toString(){
         if(this.isWhite() == true) return "♔";
        return "♚";
     }


  public boolean isCastleDone(){
    return this.hasCastled;
  }

  public void setCastle(){
    this.hasCastled = hasCastled;
  }

@Override
  public boolean canMove(ChessBoard board, Square initial, Square dest){
    if (dest.getPiece().isWhite() == this.isWhite()){
      return false;
    }
      int x = Math.abs(initial.getX() - dest.getX()); //horizontal distance from initial to destination
      int y = Math.abs(initial.getY() - dest.getY()); //vertical distance from initial to destination
      if(x+y == 1){ //check if move is safe for king
        return true;
      }
      return this.isValidCastle(board, initial, dest);
    }

    private boolean isValidCastle(ChessBoard board, Square start, Square end){
      if(this.isCastleDone()){
        return false;
      }
      //code for returning true or false for castle
      return true;
}
}
