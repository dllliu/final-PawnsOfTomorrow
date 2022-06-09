import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class ChessGame{

public static void main(String[] args) {
  boolean possibleStalemate = false;
  String color = "white";
  System.out.println("Enter which mode you want to play. 1 is 3-Check, 2 is King of the Hill, 3 is Atomic Chess, 4 is Chess 960. Just run the file with java ChessGame if you want to play normal chess. \n");
  System.out.println("Set Terminal Color to A Good Color Where You Can See Black and White. If you want to solve chess tactics, enter in EasyPuzzles for easy chess tactics or HardPuzzles for hard chess tactics \n If the input is invalid, you will see the instructions again!");


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
  System.out.println("\n The Chess Mode is Regular Chess \n");
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
}

/////////////////////////////////////////////////////

else if (args.length == 1){
  String chessMode = args[0].toLowerCase();
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

    if(chessMode.equals("threecheck")){
    ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);
    int whiteCheckCount = 0;
    int blackCheckCount = 0;
    while(true){
    System.out.println("\nChess Mode is: Three-Check");
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
      if (newBoard.count50 == 100){
        System.out.println("Game has ended in a draw due to the 50 move rule");
        return;
      }
  }
} else if (chessMode.equals("kingofthehill")) {
  ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);
  while(true){
  System.out.println("\n Chess Mode is: King Of The Hill");
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
    System.out.println(otherColor(color) + " is in check.");
  }
   if(move.contains("draw")){
      possibleStalemate = true;
  }
    color = otherColor(color);
    if (newBoard.count50 == 100){
      System.out.println("Game has ended in a draw due to the 50 move rule");
      return;
    }
}
} //if chess Mode == 2 inside if args.length == 1
//end of 3 check


}
else if (args.length == 2){
  String tutorialMode = args[1].toLowerCase();
  if(tutorialMode.equals("test")){
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

    System.out.println("\n Tutorial Mode is Chess Puzzle 1 \n");
    ChessPuzzle puzzleboard = new ChessPuzzle();
    puzzleboard.solve(locationList1, piecesList1,colorList1,solution,"white");
  } else if (tutorialMode.equals("easypuzzles")) {
    ArrayList<String> locationList2 = new ArrayList<String>();
    ArrayList<String> piecesList2 = new ArrayList<String>();
    ArrayList<String> colorList2 = new ArrayList<String>();
    ArrayList<String> solution2 = new ArrayList<String>();

    locationList2.add("60");
    colorList2.add("white");
    piecesList2.add("bishop");
    locationList2.add("50");
    colorList2.add("white");
    piecesList2.add("king");
    locationList2.add("56");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("76");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("77");
    colorList2.add("black");
    piecesList2.add("king");
    solution2.add("g1 d4");

    ChessPuzzle board=new ChessPuzzle();
    System.out.println("\n Tutorial Mode is Chess Puzzle Easy, Puzzle Number 1 \n");
    board.solve(locationList2, piecesList2,colorList2,solution2,"white");

    solution2.clear();
    colorList2.clear();
    piecesList2.clear();
    locationList2.clear();

    locationList2.add("01");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("21");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("32");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("24");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("34");
    colorList2.add("white");
    piecesList2.add("bishop");
    locationList2.add("35");
    colorList2.add("white");
    piecesList2.add("bishop");
    locationList2.add("46");
    colorList2.add("white");
    piecesList2.add("rook");
    locationList2.add("60");
    colorList2.add("white");
    piecesList2.add("king");
    locationList2.add("61");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("71");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("33");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("24");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("44");
    colorList2.add("black");
    piecesList2.add("bishop");
    locationList2.add("06");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("16");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("07");
    colorList2.add("black");
    piecesList2.add("rook");
    locationList2.add("27");
    colorList2.add("black");
    piecesList2.add("bishop");
    locationList2.add("37");
    colorList2.add("black");
    piecesList2.add("queen");
    locationList2.add("77");
    colorList2.add("black");
    piecesList2.add("king");
    locationList2.add("76");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("65");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("54");
    colorList2.add("black");
    piecesList2.add("pawn");

    solution2.add("d6 e5");

    System.out.println("\n Tutorial Mode is Chess Puzzle Easy, Puzzle Number 2 \n");
    board.solve(locationList2, piecesList2,colorList2,solution2,"white");

    solution2.clear();
    colorList2.clear();
    piecesList2.clear();
    locationList2.clear();

    locationList2.add("11");
    colorList2.add("white");
    piecesList2.add("bishop");
    locationList2.add("34");
    colorList2.add("white");
    piecesList2.add("knight");
    locationList2.add("70");
    colorList2.add("white");
    piecesList2.add("king");
    locationList2.add("56");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("76");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("67");
    colorList2.add("black");
    piecesList2.add("king");
    locationList2.add("57");
    colorList2.add("black");
    piecesList2.add("rook");

    solution2.add("d5 e7");

    System.out.println("\n Tutorial Mode is Chess Puzzle Easy, Puzzle Number 3 \n");
    board.solve( locationList2, piecesList2,colorList2,solution2,"white");

    solution2.clear();
    colorList2.clear();
    piecesList2.clear();
    locationList2.clear();

    locationList2.add("30");
    colorList2.add("white");
    piecesList2.add("rook");
    locationList2.add("64");
    colorList2.add("white");
    piecesList2.add("bishop");
    locationList2.add("60");
    colorList2.add("white");
    piecesList2.add("king");
    locationList2.add("47");
    colorList2.add("black");
    piecesList2.add("king");
    locationList2.add("56");
    colorList2.add("black");
    piecesList2.add("pawn");

    solution2.add("d1 d8");
    board.solve( locationList2, piecesList2,colorList2,solution2,"white");

    solution2.clear();
    colorList2.clear();
    piecesList2.clear();
    locationList2.clear();

    locationList2.add("13");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("60");
    colorList2.add("white");
    piecesList2.add("king");
    locationList2.add("23");
    colorList2.add("white");
    piecesList2.add("pawn");
    locationList2.add("76");
    colorList2.add("white");
    piecesList2.add("rook");
    locationList2.add("15");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("24");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("25");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("35");
    colorList2.add("black");
    piecesList2.add("pawn");
    locationList2.add("25");
    colorList2.add("black");
    piecesList2.add("king");
    solution2.add("b4 b5");

    System.out.println("\n Tutorial Mode is Chess Puzzle Easy, Puzzle Number 4 \n");
    board.solve(locationList2, piecesList2,colorList2,solution2,"white");
  } else if (tutorialMode.equals("hardpuzzles")) {
    ArrayList<String> locationListHard = new ArrayList<String>();
    ArrayList<String> piecesListHard = new ArrayList<String>();
    ArrayList<String> colorListHard = new ArrayList<String>();
    ArrayList<String> solutionHard = new ArrayList<String>();

    locationListHard.add("25");
    colorListHard.add("white");
    piecesListHard.add("king");
    locationListHard.add("37");
    colorListHard.add("black");
    piecesListHard.add("king");
    locationListHard.add("74");
    colorListHard.add("white");
    piecesListHard.add("rook");
    solutionHard.add("h5 e5");
    solutionHard.add("d8 c8");
    solutionHard.add("e5 e8");

    ChessPuzzle board=new ChessPuzzle();
    System.out.println("\n Tutorial Mode is Chess Puzzle Hard, Puzzle Number 1 \n");
    board.solve(locationListHard, piecesListHard,colorListHard,solutionHard,"white");

    solutionHard.clear();
    colorListHard.clear();
    piecesListHard.clear();
    locationListHard.clear();

    locationListHard.add("10");
    colorListHard.add("white");
    piecesListHard.add("rook");
    locationListHard.add("02");
    colorListHard.add("white");
    piecesListHard.add("queen");
    locationListHard.add("54");
    colorListHard.add("white");
    piecesListHard.add("knight");
    locationListHard.add("60");
    colorListHard.add("white");
    piecesListHard.add("king");
    locationListHard.add("31");
    colorListHard.add("black");
    piecesListHard.add("rook");
    locationListHard.add("72");
    colorListHard.add("black");
    piecesListHard.add("queen");
    locationListHard.add("57");
    colorListHard.add("black");
    piecesListHard.add("knight");
    locationListHard.add("56");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("76");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("67");
    colorListHard.add("black");
    piecesListHard.add("king");

    solutionHard.add("a3 f8");
    solutionHard.add("g8 f8");
    solutionHard.add("b1 b8");
    solutionHard.add("d2 d8");
    solutionHard.add("b8 d8");

    System.out.println("\n Tutorial Mode is Chess Puzzle Hard, Puzzle Number 2 \n");
    board.solve( locationListHard, piecesListHard,colorListHard,solutionHard,"white");

    solutionHard.clear();
    colorListHard.clear();
    piecesListHard.clear();
    locationListHard.clear();
//Uptohere
    locationListHard.add("05");
    colorListHard.add("white");
    piecesListHard.add("queen");
    locationListHard.add("06");
    colorListHard.add("black");
    piecesListHard.add("queen");
    locationListHard.add("07");
    colorListHard.add("black");
    piecesListHard.add("king");
    locationListHard.add("34");
    colorListHard.add("white");
    piecesListHard.add("knight");
    locationListHard.add("60");
    colorListHard.add("white");
    piecesListHard.add("king");

    solutionHard.add("d5 b6");
    solutionHard.add("a8 b8");
    solutionHard.add("a6 c8");

    System.out.println("\n Tutorial Mode is Chess Puzzle Hard, Puzzle Number 3 \n");
    board.solve( locationListHard, piecesListHard,colorListHard,solutionHard,"white");

    solutionHard.clear();
    colorListHard.clear();
    piecesListHard.clear();
    locationListHard.clear();

    locationListHard.add("01");
    colorListHard.add("white");
    piecesListHard.add("pawn");
    locationListHard.add("13");
    colorListHard.add("white");
    piecesListHard.add("pawn");
    locationListHard.add("24");
    colorListHard.add("white");
    piecesListHard.add("knight");
    locationListHard.add("21");
    colorListHard.add("white");
    piecesListHard.add("queen");
    locationListHard.add("50");
    colorListHard.add("white");
    piecesListHard.add("rook");
    locationListHard.add("61");
    colorListHard.add("white");
    piecesListHard.add("king");
    locationListHard.add("62");
    colorListHard.add("white");
    piecesListHard.add("pawn");
    locationListHard.add("71");
    colorListHard.add("white");
    piecesListHard.add("pawn");
    locationListHard.add("05");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("16");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("17");
    colorListHard.add("black");
    piecesListHard.add("queen");
    locationListHard.add("47");
    colorListHard.add("black");
    piecesListHard.add("rook");
    locationListHard.add("57");
    colorListHard.add("black");
    piecesListHard.add("king");
    locationListHard.add("56");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("66");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("76");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("55");
    colorListHard.add("black");
    piecesListHard.add("knight");


    solutionHard.add("f1 f6");
    solutionHard.add("g7 f6");
    solutionHard.add("c5 d7");
    solutionHard.add("f8 g8");
    solutionHard.add("d7 b8");

    System.out.println("\n Tutorial Mode is Chess Puzzle Hard, Puzzle Number 4 \n");
    board.solve(locationListHard, piecesListHard,colorListHard,solutionHard,"white");

    solutionHard.clear();
    colorListHard.clear();
    piecesListHard.clear();
    locationListHard.clear();

    locationListHard.add("11");
    colorListHard.add("black");
    piecesListHard.add("knight");
    locationListHard.add("14");
    colorListHard.add("black");
    piecesListHard.add("pawn");
    locationListHard.add("26");
    colorListHard.add("black");
    piecesListHard.add("king");
    locationListHard.add("35");
    colorListHard.add("black");
    piecesListHard.add("rook");
    locationListHard.add("47");
    colorListHard.add("white");
    piecesListHard.add("rook");
    locationListHard.add("55");
    colorListHard.add("white");
    piecesListHard.add("knight");
    locationListHard.add("53");
    colorListHard.add("white");
    piecesListHard.add("pawn");
    locationListHard.add("64");
    colorListHard.add("white");
    piecesListHard.add("king");
    locationListHard.add("65");
    colorListHard.add("black");
    piecesListHard.add("pawn");

    solutionHard.add("e8 e2");
    solutionHard.add("b2 c4");
    solutionHard.add("f6 e8");
    solutionHard.add("c7 d7");
    solutionHard.add("e8 d6");

    System.out.println("\n Tutorial Mode is Chess Puzzle Hard, Puzzle Number 5 \n");
    board.solve(locationListHard, piecesListHard,colorListHard,solutionHard,"white");
  }
}
/*
 else if ((args.length == 1) && (Integer.parseInt(args[0]) == 2)) {
=======
  boolean possibleStalemate = false;
  String color = "white";
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
    }if(possibleStalemate){
      //Draw?
      if(move.toLowerCase().contains("draw") || move.toLowerCase().contains("stalemate")){
        System.out.println("The game has ended in a draw");
        return;
      }else{
        possibleStalemate = false;
      }
    } try{
=======
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

    Piece[][] oldBoard = newBoard.board.clone();
  if(!newBoard.canAnyMove(otherColor(color))){
      if(!newBoard.canAnyMove(otherColor(color))){
      System.out.println(color + " checkmated " + otherColor(color));
    }else{
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
