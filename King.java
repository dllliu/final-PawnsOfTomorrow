public class King extends Piece{

  public boolean hasCastled;
  public boolean hasMoved;

  public King(String color){
    super(color);
    this.hasMoved = false;
    this.hasCastled = false;
  }

  @Override
     public String toString(){
         if (getColor().equals("white")) return "♔";
        return "♚";
     }


  public boolean isCastleDone(){
    return this.hasCastled;
  }

  public void setCastle(boolean hasCastled){
    this.hasCastled = hasCastled;
  }


@Override
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
    if (Math.abs(initialX - initialY) > 1 || Math.abs(destY - destX) > 1){
      if(hasMoved == true){
        return false;
      }
      if(Math.abs(destY - initialY) == 2 && initialX == destX){
        if (board[destX][destY + 1] != null || board[destX][destY + 2] != null){ //if Pieces between
          hasCastled = false;
          return false;
        }
      } else if (Math.abs(destY - initialY) == 3 && destX == initialX){
        if (board[destX][destY - 1] != null || board[destX][destY - 2] != null ||  board[destX][destY - 3] != null){
          hasCastled = false;
          return false;
        }
      }else{
        hasCastled = false;
        return false;
      }
    }
    return true;
  }
}
