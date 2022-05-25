public class Move{
  private Player player;
  private Square start;
  private Square end;
  private Piece pieceMoved;
  private Piece pieceCaptured;
  private boolean castled = false;

  public Move(Player p, Square start, Square dest){
    this.p = player;
    this.start = start;
    this.dest = end;
    this.pieceMoved = start.getPiece();
  }

  public boolean isCastlingMove(){
    return this.castled();
  }

  public void setCastlingMove(boolean move){
    this.move = castled;
  }
}
