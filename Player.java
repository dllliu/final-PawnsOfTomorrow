public class Player{
  private int color;

  public Player(){
    int color = 0;
  }

  public String getColor(){
    return color;
  }

  public void switchColor(){
    color=(color+1)%2;
  }

  public boolean canMove(String piece, int initialX, int initialY, int finalX, int finalY, String[][] board){
    String[][] val = board.validMove(piece, board, initialX, initialY);
    if (val[board.length-finalY][finalX-1]=="."){
      return true;
    }
    return false;
  }
}
