import java.util.ArrayList;

public class ChessGame{
  private Player[] players;
  private Board board;
  private Player currentTurn;
  private boolean status;
  private ArrayList<Move> scoreSheet;
  private ArrayList<String> removedPieces;
 private ArrayList<String> currentPieces;


private void newGame(Player p0, Player p1){
  status = false;
  players[0] = p0;
  players[1] = p1;
  board.reset();
  if(p0.isWhiteSide()){
    this.currentTurn = p0;
  }else{
    this.currentTurn = p1;
  }
  scoreSheet.clear();
}

  public boolean isGameEnded(){
    return this.getStatus() != true;
  }

  public boolean getStatus(){
    return this.status;
  }

  public boolean makeMove(Player player, int startX, int startY, int destX, int destY){
    Square start = board.getSquare(startX, startY);
    Square end = board.getSquare(destX, destY);
    Move move = new Move(player, start, end);
    return this.makeMove(move,player);
  }

  private boolean makeMove(Move move, Player player){
    Piece pc = move.getStart().getPiece();
    if(pc == null || player = currentTurn){
      return false;
    }
    if(pc.isWhite() != player.isWhiteSide()){
      return false;
    }if(!pc.canMove(board, move.getStart(), move.getEnd())){
      return false;
    }
    Piece destPiece = move.getStart().getPiece();
    if(destPiece != null){
      destPiece.setPieceCaptured(true);
      removedPieces.add(destPiece);
      //move.setPieceCaptured(destPiece);
    }scoreSheet.add(move);
    move.getEnd().setPiece(move.getStart().getPiece());
    move.getStart.setPiece(null);

    if(this.currentTurn = players[0]){
      this.currentTurn = players[1];
    }else{
      this.currentTurn = players[0];
    }
    return true;
  }

  public static void undoMove(){

  }

  public static void showWinner(){

  }

  public static boolean isMated(){

  }

  public static boolean isTied(){

  }
}
