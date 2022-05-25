public class Square{
  private Piece piece;
  private int initialX;
  private int initialY;

  public Square(int initialX, int initialY, Piece piece){
    this.setX(initialX);
    this.setY(initialY);
    this.setPiece(piece);
  }

  public Piece getPiece(){
    return this.piece;
  }

  public void setPiece(Piece Piece){
    this.piece = Piece;
  }

  public int getX(){
    return this.initialX;
  }

  public void setX(int x){
    x = initialX;
  }

  public int getY(){
    return this.initialY;
  }

  public void setY(int y){
    y = initialY;
  }
}
