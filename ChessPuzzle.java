import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class ChessPuzzle{

  public static void solve(String checkType,ArrayList<String> locationList,ArrayList<String> piecesList,ArrayList<String> colorList, ArrayList<String> solution, String color, boolean yes) {
    //xy
    ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    while(true){
      System.out.println(newBoard);
      System.out.println (newBoard.scoreSheet.toString());
      System.out.println(color + " enter your move");
      if (yes){
        System.out.println("This checks "+checkType);
        System.out.println("Hint: make the move "+solution.get(0));
      }
      Scanner in = new Scanner(System.in);
      String move = in.nextLine();
      if (move.contains("resign")){
        System.out.println(color + " resigns");
        System.out.println(otherColor(color) + " wins");
        return;
      }
      if(!move.equals(solution.get(0))){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        try{
          Piece[][] oldBoard=new Piece[newBoard.board.length][newBoard.board.length];
          for (int i=0;i<newBoard.board.length;i++){
            for (int k=0;k<newBoard.board.length;k++){
              oldBoard[i][k]=newBoard.board[i][k];
            }
          }
          newBoard.makeMove(move, color, false);
          for (int m=0;m<newBoard.board.length;m++){
            for (int n=0;n<newBoard.board.length;n++){
              newBoard.board[m][n]=oldBoard[m][n];
            }
          }
         System.out.println("Wrong move. Try again");
       }
        catch(IllegalArgumentException e){
          e.printStackTrace();
          System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
          continue;
        }
        continue;
      }
      else{
        newBoard.makeMove(move, color, true);
        solution.remove(0);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(!newBoard.canAnyMove(otherColor(color))){
          if(newBoard.isChecked(otherColor(color))){
            System.out.println(color + " checkmated " + otherColor(color));
          }
        else{
          System.out.println("Game has ended in a stalemate");
        }
      }
       if(newBoard.isChecked(otherColor(color))) {
          System.out.println(otherColor(color) + " is in check.");
        }
        if (newBoard.count50==100){
          System.out.println("Game has ended in a draw due to the 50 move rule");
        }
        if(solution.size()==0){
          System.out.println(newBoard);
          System.out.println("Success!");
          System.out.println("Press enter to continue");
          try{System.in.read();}
          catch(Exception e){}
          return;
        }
        newBoard.makeMove(solution.get(0), ChessGame.otherColor(color), true);
        solution.remove(0);
      }
    }
  }

  public static String otherColor(String color){
    if (color.equals("white")){
      return "black";
    }
    return "white";
  }
}
