import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class ChessPuzzle{

  public void solve(ArrayList<String> locationList,ArrayList<String> piecesList,ArrayList<String> colorList, ArrayList<String> solution, String color) {
    ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    while(true){
      System.out.println(newBoard);
      System.out.println (newBoard.scoreSheet.toString());
      System.out.println(color + " enter your move");
      Scanner in = new Scanner(System.in);
      String move = in.nextLine();
      if (move.contains("help")){
        if (solution.size()==1){
          newBoard.makeMove(solution.get(0), (color), true);
          solution.remove(0);
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("solved");
          System.out.println(newBoard);
                    return;
        }
        else if (solution.size()>1){
          newBoard.makeMove(solution.get(0),color, true);
          solution.remove(0);
          newBoard.makeMove(solution.get(0), ChessGame.otherColor(color), true);
          solution.remove(0);
          System.out.print("\033[H\033[2J");
          System.out.flush();
                    continue;
        }
      }
      if(!move.equals(solution.get(0))){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Wrong move. Try again");
        continue;
      }
      else{
        newBoard.makeMove(move, color, true);
        solution.remove(0);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(solution.size()==0){
          System.out.println(newBoard);
          System.out.println("Success!");
          return;
        }
        newBoard.makeMove(solution.get(0), ChessGame.otherColor(color), true);
        solution.remove(0);
      }
    }
  }
}
