public class King extends Piece{
  public String color;
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

//need to code white king black king are 1 unit away from each other
//lichess puzzles
@Override
public boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY){
  Piece[][] board=cb.board;
  if(Math.abs(destX - initialX) > 1 || Math.abs(destY - initialY) > 1){
    if(hasMoved){
      return false;
    }
    if(destY - initialY == 2 && initialX == destX){
      //Castle king side

      if(board[destX][initialY + 1] != null || board[destX][initialY + 2] != null||board[destX][initialY+3].hasMoved){
        hasCastled = false;
        return false;
      }
      for(int i = 0; i<board.length; i++){
        for(int j = 0; j<board[0].length; j++){
          if(board[i][j] != null&&!board[i][j].getColor().equals(color)&&!(board[i][j].getClass().isInstance(new King((color))))){
            if(board[i][j].canMove(cb, i, j, initialX, initialY) || board[i][j].canMove(cb, i, j, initialX, initialY+1)||board[i][j].canMove(cb, i, j, initialX, initialY+2)){
              return false;
            }
          }
        }
      }
      //Castle Queen side
    }else if(initialY - destY == 2 && initialX == destX && (destY < initialY)){
      if(board[destX][initialY - 1] != null || board[destX][initialY - 2] != null || board[destX][initialY - 3] != null||board[destX][initialY-4].hasMoved){
        hasCastled = false;
        return false;
      }
      for(int i = 0; i<board.length; i++){
        for(int j = 0; j<board[0].length; j++){
          if(board[i][j] != null&&!board[i][j].getColor().equals(color)&&!(board[i][j].getClass().isInstance(new King((color))))){
            if((board[i][j].canMove(cb, i, j, initialX, initialY) || board[i][j].canMove(cb, i, j, initialX, initialY-1)||board[i][j].canMove(cb, i, j, initialX, initialY-2))){
              return false;
            }
          }
        }
      }
    }else{
      hasCastled = false;
      return false;
    }

    hasCastled = true;

  }

  return true;
}
}
