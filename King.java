
public class King extends Piece{

  public boolean hasCastled;
  public boolean hasMoved;

  public King(String color){
    this.color = color;
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

  public String getColor(){
		return this.color;
	}

@Override
  public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){

    if(Math.abs(destX - initialX) > 1 || Math.abs(destY - initialY) > 1){
      if(hasMoved){
        return false;
      }

      if(destY - initialY == 2 && initialX == destX){
        //Castle king side
        if(board[destX][initialY + 1] != null || board[destX][initialY + 2] != null){
          hasCastled = false;
          return false;
        }
        //castle queen side
      }else if(initialY - destY == 2 && initialX == destX){
        if(board[destX][initialY - 1] != null || board[destX][initialY - 2] != null){
          hasCastled = false;
          return false;
        }

      }else{
        hasCastled = false;
        return false;
      }
      hasCastled = true;
    }

    hasMoved = true;
    return true;
  }
}
