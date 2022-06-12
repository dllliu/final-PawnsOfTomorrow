import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.util.Arrays;

public class ChessGame{


public static void main(String[] args) {
  System.out.print("\033[H\033[2J");
  System.out.flush();
  boolean possibleStalemate = false;
  String color = "white";
  System.out.println("Enter which mode you want to play. 1 is 3-Check, 2 is King of the Hill, 3 is Atomic Chess, 4 is Chess 960. Just run the file with java ChessGame if you want to play normal chess. \n");
  System.out.println("Set Terminal Color to A Good Color Where You Can See Black and White. If you want to solve chess tactics, enter in EasyPuzzles for easy chess tactics or HardPuzzles for hard chess tactics \n If the input is invalid, you will see the instructions again!");
  System.out.println("To see functionality type in demo, and to play single-player type in solo");

  Scanner scan = new Scanner(System.in);
  String answer = scan.nextLine();
while(!answer.equals("regular")){
   scan = new Scanner(System.in);
   System.out.println("Invalid mode: type again");
   answer = scan.nextLine();
}
System.out.print("\033[H\033[2J");
System.out.flush();
 if(answer.equals("regular")){

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


  System.out.println("\n The Chess Mode is Regular Chess \n");
  System.out.println(newBoard.toString(otherColor(color)));
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
      System.out.println(newBoard.toString(color));
    }catch(IllegalArgumentException e){
      e.printStackTrace();
      System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
      System.out.println(newBoard.toString(color));
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
    System.out.println(newBoard.toString(color));
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
}
else if (chessMode.equals("solo")) {
  RandomPlayer.play();
}
else if (chessMode.equals("kingofthehill")) {
  ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);
  while(true){
  System.out.println("\n Chess Mode is: King Of The Hill");
  System.out.println (newBoard.scoreSheet.toString());
  System.out.println(newBoard.toString(color));
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
int[] arr1 =  {3,3};
int[] arr2 = {3,4};
int [] arr3 = {4,3};
int[] arr4 = {4,4};
int[][] goodSquares = {arr1,arr2,arr3,arr4};

int[] kingArr = newBoard.getKingPosition(color);

for(int[] arr: goodSquares) {
  if(Arrays.equals(kingArr,arr)){
    System.out.println(color + " has won the game because their king has moved to the center four squares");
    return;
  }
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
}else if (chessMode.equals("demo")){
  Demo.initDemo();
} else if(chessMode.equals("horde")){
  ArrayList<String> locationListHorde = new ArrayList<String>();
  ArrayList<String> piecesListHorde = new ArrayList<String>();
  ArrayList<String> colorListHorde = new ArrayList<String>();

  //whjte setup
  for(int i=0; i<=7; i++){
    locationListHorde.add("" + i + "" + 0);
    locationListHorde.add("" + i + "" + 1);
    locationListHorde.add("" + i + "" + 2);
    locationListHorde.add("" + i + "" + 3);
  }

  //extra pawns
  locationListHorde.add("14");
  locationListHorde.add("24");
  locationListHorde.add("54");
  locationListHorde.add("64");


  for(int i=0; i<=35; i++){
    piecesListHorde.add("pawn");
    colorListHorde.add("white");
  }

  //start of black setup
  for(int i=0; i<=7; i++){
    locationListHorde.add("" + i + "" + 7);
    colorListHorde.add("black");
  }

  piecesListHorde.add("rook");
  piecesListHorde.add("knight");
  piecesListHorde.add("bishop");
  piecesListHorde.add("queen");
  piecesListHorde.add("king");
  piecesListHorde.add("bishop");
  piecesListHorde.add("knight");
  piecesListHorde.add("rook");

  for(int i=0; i<=7; i++){
    locationListHorde.add("" + i + "" + 6);
    colorListHorde.add("black");
  }

  piecesListHorde.add("pawn");
  piecesListHorde.add("pawn");
  piecesListHorde.add("pawn");
  piecesListHorde.add("pawn");
  piecesListHorde.add("pawn");
  piecesListHorde.add("pawn");
  piecesListHorde.add("pawn");
  piecesListHorde.add("pawn");

  ChessBoard hordeBoard = new ChessBoard(locationListHorde,piecesListHorde,colorListHorde);
  while(true){
  System.out.println("\nChess Mode is: Horde");
  System.out.println (hordeBoard.scoreSheet.toString());
  System.out.println(hordeBoard);
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
    hordeBoard.makeMove(move, color, true);
  }catch(IllegalArgumentException e){
    //e.printStackTrace();
    System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
    continue;
  }

  Piece[][] oldBoard = hordeBoard.board.clone();
if(!hordeBoard.canAnyMove(otherColor(color))){
    if(!hordeBoard.canAnyMove(otherColor(color))){
    System.out.println(color + " checkmated " + otherColor(color));
  }else{
    System.out.println("Game has ended in a stalemate");
  }
  return;
}
  hordeBoard.board = oldBoard;
 if(hordeBoard.isChecked(otherColor(color))) {
    System.out.println(otherColor(color) + " is in check.");
  }
   if(move.contains("draw")){
      possibleStalemate = true;
  }
    color = otherColor(color);
    if (hordeBoard.count50 == 100){
      System.out.println("Game has ended in a draw due to the 50 move rule");
      return;
    }
    if(hordeBoard.getPawns(color) == false){
      System.out.println("black has has won the game by capturing all white pawns");
      return;
    }
}
}
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

    System.out.println("\n Tutorial Mode is Test \n");
    ChessPuzzle puzzleboard = new ChessPuzzle();
    System.out.println("\n Tutoral Mode is Test");
    puzzleboard.solve("",locationList1, piecesList1,colorList1,solution,"white",false);
  } else if (tutorialMode.equals("easypuzzles")){
    EasyPuzzles.initEasyPuzzles();
  } else if (tutorialMode.equals("hardpuzzles")){
    HardPuzzles.initHardPuzzles();
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
