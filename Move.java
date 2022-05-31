public class Move{
  private Player player;
  private Square start;
  private Square end;
  private Piece pieceMoved;
  private Piece pieceCaptured;
  private boolean castled = false;

  public Move(Player p, Square start, Square dest){
    p = player;
    start = start;
    dest = end;
    this.pieceMoved = start.getPiece();
  }

  public boolean isCastlingMove(){
    return castled;
  }

  public void setCastlingMove(boolean castle){
    castle = castled;
  }
}
