
public abstract class Piece{

  public boolean isWhite;
  private boolean captured = false;
  public boolean hasMoved;
  private boolean emPassanAble;
  private ChessBoard board;


  public Piece(boolean isWhite){
    this.setWhite(isWhite);
  }

  public boolean isWhite(){
    return this.isWhite;
  }

  public void setWhite(boolean white){
    this.isWhite = white;
  }

  public boolean isCaptured(){
    return this.captured;
  }

  public void setCaptured(boolean killed){
     this.captured = captured;
  }

  public abstract boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY);

  public abstract String toString();

}
