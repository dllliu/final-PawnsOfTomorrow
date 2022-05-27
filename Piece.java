
public abstract class Piece{

  private boolean white = false;
  private boolean captured = false;
  private boolean hasMoved;
  private boolean emPassanAble;
  private ChessBoard board;


  public Piece(boolean isWhite){
    this.setWhite(isWhite);
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

  public abstract boolean canMove(ChessBoard board, Square initial, Square dest);

  public abstract String toString();

}
