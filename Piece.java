
public abstract class Piece{

  private boolean white = false;
  private boolean captured = false;


  public Piece(boolean isWhite){
    this.setWhite(white);
  }

  public boolean isWhite(){
    return this.white;
  }

  public void setWhite(boolean white){
    this.white = white;
  }

  public boolean isCaptured(){
    return this.captured;
  }

  public void setCaptured(boolean killed){
     this.captured = captured;
  }

  public abstract boolean canMove(ChessBoard board, int initialX, int initialY);
}
