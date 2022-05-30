
public abstract class Piece{

  private boolean captured = false;
  public boolean hasMoved;
  public boolean emPassanAble;
  private ChessBoard board;
  public String color;


  public Piece(String color){
    this.setColor(color);
  }

  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
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
