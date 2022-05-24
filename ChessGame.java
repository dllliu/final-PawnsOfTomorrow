import java.util.ArrayList;

public class ChessGame{
  private boolean isChecked;
  public boolean over = false;
  private List<Moves> scoresheet;
  private int current;
  private boolean isWhiteTurn;
  private static ChessGame cGame = new ChessGame();


  public ChessGame(){
    board = new board();
    scoreSheet = new ArrayList();
    isWhiteTurn = true;
    current = 0;

  public static ChessGame getGame(){
    return cGame;
  }

  public boolean isGameEnded(){
    return over;
  }

  public static void saveGame(){
    for(int i=0; i<copy.length; i++){
      for(int j=0; j<copy[i].length; j++){
        copy[i][j] = 0;
      }
    }
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board.length; j++){
        copy[i][j] = board[i][j];
      }
    }
  }

  public static void loadGame(){
    return copy;
  }

  public static void makeMove(){

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
