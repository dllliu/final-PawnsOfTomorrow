import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class ChessPuzzle{

  public  void solve(ArrayList<String> locationList,ArrayList<String> piecesList,ArrayList<String> colorList, ArrayList<String> solution) {
    //xy
    ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);

    String color = "white";
    while(true){
      System.out.println (newBoard.scoreSheet.toString());
      System.out.println(newBoard);
      System.out.println(color + " enter your move");
      Scanner in = new Scanner(System.in);
      String move = in.nextLine();
      if (move.contains("help")){
        if (solution.size()==1){
          newBoard.makeMove(solution.get(0), (color), true);
          solution.remove(0);
          return;
        }
        else if (solution.size()>1){
          newBoard.makeMove(solution.get(0), (color), true);
          solution.remove(0);
          newBoard.makeMove(solution.get(0), ChessGame.otherColor(color), true);
          continue;
        }
      }
      if(!move.equals(solution.get(0))){
        System.out.println("Wrong move. Try again");
        continue;
      }
      try{
        newBoard.makeMove(move, color, true);
        solution.remove(0);
        if(solution.size()==0){
          System.out.println("Success!");
          return;
        }
        newBoard.makeMove(solution.get(0), ChessGame.otherColor(color), true);
        solution.remove(0);
      }
      catch(IllegalArgumentException e){
        e.printStackTrace();
        System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
        continue;
      }
    }
  }
}
