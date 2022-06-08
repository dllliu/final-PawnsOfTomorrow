import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class ChessGame{

public static void main(String[] args) {
  boolean possibleStalemate = false;
  String color = "white";
  System.out.println("Enter which mode you want to play. 1 is 3-Check, 2 is King of the Hill, 3 is Atomic Chess, 4 is Chess 960. \n Just run the file if you want to play normal chess.");
  System.out.println("If you want to solve chess tactics, enter in puzzle1 and so on...");
 //String tutorialMode = args[1];
 if(args.length == 0){

   ArrayList<String> locationList = new ArrayList<String>();
   ArrayList<String> piecesList = new ArrayList<String>();
   ArrayList<String> colorList = new ArrayList<String>();

   locationList.add("00");
   locationList.add("10");
   locationList.add("20");
   locationList.add("30");
   locationList.add("40");
   locationList.add("50");
   locationList.add("60");
   locationList.add("70");
   locationList.add("01");
   locationList.add("11");
   locationList.add("21");
   locationList.add("31");
   locationList.add("41");
   locationList.add("51");
   locationList.add("61");
   locationList.add("71");
   locationList.add("07");
   locationList.add("17");
   locationList.add("27");
   locationList.add("37");
   locationList.add("47");
   locationList.add("57");
   locationList.add("67");
   locationList.add("77");
   locationList.add("06");
   locationList.add("16");
   locationList.add("26");
   locationList.add("36");
   locationList.add("46");
   locationList.add("56");
   locationList.add("66");
   locationList.add("76");

   piecesList.add("rook");
   piecesList.add("knight");
   piecesList.add("bishop");
   piecesList.add("queen");
   piecesList.add("king");
   piecesList.add("bishop");
   piecesList.add("knight");
   piecesList.add("rook");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("rook");
   piecesList.add("knight");
   piecesList.add("bishop");
   piecesList.add("queen");
   piecesList.add("king");
   piecesList.add("bishop");
   piecesList.add("knight");
   piecesList.add("rook");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");
   piecesList.add("pawn");

   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");
   colorList.add("white");

   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");
   colorList.add("black");

   ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);

  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println(newBoard);
  int count=0;

  while(true){
    System.out.println (newBoard.scoreSheet.toString());
    System.out.println(color + " enter your move");
    Scanner in = new Scanner(System.in);
    String move = in.nextLine();
    if (move.contains("resign")){
      System.out.println(color + " resigns");
      System.out.println(otherColor(color) + " wins");
      return;
    }
    System.out.print("\033[H\033[2J");
    System.out.flush();
    try{
      newBoard.makeMove(move, color, true);
      System.out.println(newBoard);
    }catch(IllegalArgumentException e){
      e.printStackTrace();
      System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
      System.out.println(newBoard);
      continue;
    }
    if(!newBoard.canAnyMove(otherColor(color))){
      if(newBoard.isChecked(otherColor(color))){
        System.out.println(color + " checkmated " + otherColor(color));
      }
    else{
      System.out.println("Game has ended in a stalemate");
    }
    return;
  }
   if(newBoard.isChecked(otherColor(color))) {
      System.out.println(otherColor(color) + " is in check.");
    }
    color = otherColor(color);
    if (newBoard.count50==100){
      System.out.println("Game has ended in a draw due to the 50 move rule");
      return;
    }
  }
} else if (args.length == 1){
  int chessMode = Integer.parseInt(args[0]);
  ArrayList<String> locationList = new ArrayList<String>();
  ArrayList<String> piecesList = new ArrayList<String>();
  ArrayList<String> colorList = new ArrayList<String>();

  locationList.add("00");
  locationList.add("10");
  locationList.add("20");
  locationList.add("30");
  locationList.add("40");
  locationList.add("50");
  locationList.add("60");
  locationList.add("70");
  locationList.add("01");
  locationList.add("11");
  locationList.add("21");
  locationList.add("31");
  locationList.add("41");
  locationList.add("51");
  locationList.add("61");
  locationList.add("71");
  locationList.add("07");
  locationList.add("17");
  locationList.add("27");
  locationList.add("37");
  locationList.add("47");
  locationList.add("57");
  locationList.add("67");
  locationList.add("77");
  locationList.add("06");
  locationList.add("16");
  locationList.add("26");
  locationList.add("36");
  locationList.add("46");
  locationList.add("56");
  locationList.add("66");
  locationList.add("76");

  piecesList.add("rook");
  piecesList.add("knight");
  piecesList.add("bishop");
  piecesList.add("queen");
  piecesList.add("king");
  piecesList.add("bishop");
  piecesList.add("knight");
  piecesList.add("rook");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("rook");
  piecesList.add("knight");
  piecesList.add("bishop");
  piecesList.add("queen");
  piecesList.add("king");
  piecesList.add("bishop");
  piecesList.add("knight");
  piecesList.add("rook");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");
  piecesList.add("pawn");

  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");
  colorList.add("white");

  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");
  colorList.add("black");

  ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);
  if(chessMode == 1){
    int whiteCheckCount = 0;
    int blackCheckCount = 0;
    while(true){
    System.out.println("Chess Mode is: " + chessMode);
    System.out.println("White Check Counter is: " + whiteCheckCount);
    System.out.println("Black Check Counter is: " + blackCheckCount);
    System.out.println (newBoard.scoreSheet.toString());
    System.out.println(newBoard);
    System.out.println(color + " enter your move");
    Scanner in = new Scanner(System.in);
    String move = in.nextLine();
    if (move.contains("resign")){
      System.out.println(color + " reigns");
      System.out.println(otherColor(color) + " wins");
      return;
    }if(possibleStalemate){
      if(move.toLowerCase().contains("draw") || move.toLowerCase().contains("stalemate")){
        System.out.println("The game has ended in a draw");
        return;
      }else{
        possibleStalemate = false;
      }
    } try{
      newBoard.makeMove(move, color, true);
    }catch(IllegalArgumentException e){
      //e.printStackTrace();
      System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
      continue;
    }

    Piece[][] oldBoard = newBoard.board.clone();
  if(!newBoard.canAnyMove(otherColor(color))){
      if(!newBoard.canAnyMove(otherColor(color))){
      System.out.println(color + " checkmated " + otherColor(color));
    }else{
      System.out.println("Game has ended in a stalemate");
    }
    return;
}
    newBoard.board = oldBoard;
   if(newBoard.isChecked(otherColor(color))) {
     if(color == "white"){
       blackCheckCount ++;
    }else{
      whiteCheckCount ++;
    }
      System.out.println(otherColor(color) + " is in check.");
    }
    if(whiteCheckCount >= 3){
      System.out.println("black has won the game of 3-check");
      return ;
    }else if (blackCheckCount >= 3){
      System.out.println("white has won the game of 3-check");
      return ;
    }
     if(move.contains("draw")){
        possibleStalemate = true;
    }
      color = otherColor(color);
      if (newBoard.count50==100){
        System.out.println("Game has ended in a draw due to the 50 move rule");
        return;
      }
  }
} //if chess Mode == 2 inside if args.length == 1
}
else if (args.length == 2){
  int tutorialMode = Integer.parseInt(args[1]);
  if(tutorialMode == 1){
    ArrayList<String> locationList1 = new ArrayList<String>();
    ArrayList<String> piecesList1 = new ArrayList<String>();
    ArrayList<String> colorList1 = new ArrayList<String>();
    ArrayList<String> solution = new ArrayList<String>();

    locationList1.add("60");
    colorList1.add("white");
    piecesList1.add("bishop");
    locationList1.add("50");
    colorList1.add("white");
    piecesList1.add("king");
    locationList1.add("56");
    colorList1.add("white");
    piecesList1.add("pawn");
    locationList1.add("76");
    colorList1.add("black");
    piecesList1.add("pawn");
    locationList1.add("77");
    colorList1.add("black");
    piecesList1.add("rook");
    locationList1.add("27");
    colorList1.add("black");
    piecesList1.add("king");
    solution.add("g1 d4");
    solution.add("h8 g8");
    solution.add("d4 a1");

    ChessPuzzle puzzleboard = new ChessPuzzle();
    System.out.println("\n Tutoral Mode is Chess Puzzle 1");
    puzzleboard.solve(locationList1, piecesList1,colorList1,solution,"white");
  }
}
/*
 else if ((args.length == 1) && (Integer.parseInt(args[0]) == 2)) {
  while(true){
    System.out.println (newBoard.scoreSheet.toString());
    System.out.println(newBoard);
    System.out.println(color + " enter your move");
    Scanner in = new Scanner(System.in);
    String move = in.nextLine();
    if (move.contains("resign")){
      System.out.println(color + " reigns");
      System.out.println(otherColor(color) + " wins");
      return;
    }if(possibleStalemate){
      //Draw?
      if(move.toLowerCase().contains("draw") || move.toLowerCase().contains("stalemate")){
        System.out.println("The game has ended in a draw");
        return;
      }else{
        possibleStalemate = false;
      }
    } try{
      newBoard.makeMove(move, color, true);
    }catch(IllegalArgumentException e){
      e.printStackTrace();
      System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
      continue;
    }

    Piece[][] oldBoard = newBoard.board.clone();
  if(!newBoard.canAnyMove(otherColor(color))){
    //difference?
      if(!newBoard.canAnyMove(otherColor(color))){
      System.out.println(color + " checkmated " + otherColor(color));
    }else{
      System.out.println("Game has ended in a stalemate");
    }
    return;
}
    newBoard.board = oldBoard;
    //point?
   if(newBoard.isChecked(otherColor(color))) {
      System.out.println(otherColor(color) + " is in check.");
    } if(move.contains("draw")){
        possibleStalemate = true;
    }
      color = otherColor(color);
      if (newBoard.count50==100){
        System.out.println("Game has ended in a draw due to the 50 move rule");
        return;
      }
  }
}
*/
}

  public static String otherColor(String color){
    if (color.equals("white")){
      return "black";
    }
    return "white";
  }
}
