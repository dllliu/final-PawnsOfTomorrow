import java.util.ArrayList;

public class ChessGame{
  private boolean isChecked;
  public boolean over = false;
  private List<Moves> scoresheet;
  private int current;
  private static ChessGame cGame = new ChessGame();


  public ChessGame(){
    board = new board();
    scoreSheet = new ArrayList();
    //make white the first player
    current = 0;
  }

  public static ChessGame getGame(){
    return cGame;
  }

  public boolean isGameEnded(){
    return over;
  }

  public static void saveGame(){

  }

  public static void loadGame(){

  }

  public static void makeMove(){

  }

  public static void undoMove(){

  }

  public static void setStartPositions(){

  }
    //called in ChessGame

  public static void showWinner(){

  }

  public static boolean isMated(){

  }

  public static boolean isTied(){

  }
}
