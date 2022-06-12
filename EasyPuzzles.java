import java.util.*;

public class EasyPuzzles{
  public static void initEasyPuzzles(){
    ArrayList<String> locationListEasy = new ArrayList<String>();
    ArrayList<String> piecesListEasy = new ArrayList<String>();
    ArrayList<String> colorListEasy = new ArrayList<String>();
    ArrayList<String> solutionEasy = new ArrayList<String>();

    locationListEasy.add("60");
    colorListEasy.add("white");
    piecesListEasy.add("bishop");
    locationListEasy.add("50");
    colorListEasy.add("white");
    piecesListEasy.add("king");
    locationListEasy.add("56");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("76");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("77");
    colorListEasy.add("black");
    piecesListEasy.add("king");
    solutionEasy.add("g1 d4");

    ChessPuzzle boardEasy=new ChessPuzzle();
    System.out.println("The Chess Mode is Easy Puzzles, this is Puzzle Number 1");
    boardEasy.solve("", locationListEasy, piecesListEasy,colorListEasy,solutionEasy,"white",false);

    solutionEasy.clear();
    colorListEasy.clear();
    piecesListEasy.clear();
    locationListEasy.clear();

    locationListEasy.add("01");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("21");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("32");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("24");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("34");
    colorListEasy.add("white");
    piecesListEasy.add("bishop");
    locationListEasy.add("35");
    colorListEasy.add("white");
    piecesListEasy.add("bishop");
    locationListEasy.add("46");
    colorListEasy.add("white");
    piecesListEasy.add("rook");
    locationListEasy.add("60");
    colorListEasy.add("white");
    piecesListEasy.add("king");
    locationListEasy.add("61");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("71");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("33");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("24");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("44");
    colorListEasy.add("black");
    piecesListEasy.add("bishop");
    locationListEasy.add("06");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("16");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("07");
    colorListEasy.add("black");
    piecesListEasy.add("rook");
    locationListEasy.add("27");
    colorListEasy.add("black");
    piecesListEasy.add("bishop");
    locationListEasy.add("37");
    colorListEasy.add("black");
    piecesListEasy.add("queen");
    locationListEasy.add("77");
    colorListEasy.add("black");
    piecesListEasy.add("king");
    locationListEasy.add("76");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("65");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("54");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");

    solutionEasy.add("d6 e5");
    System.out.println("The Chess Mode is Easy Puzzles, this is Puzzle Number 2");
    boardEasy.solve("", locationListEasy, piecesListEasy,colorListEasy,solutionEasy,"white",false);

    solutionEasy.clear();
    colorListEasy.clear();
    piecesListEasy.clear();
    locationListEasy.clear();

    locationListEasy.add("11");
    colorListEasy.add("white");
    piecesListEasy.add("bishop");
    locationListEasy.add("34");
    colorListEasy.add("white");
    piecesListEasy.add("knight");
    locationListEasy.add("70");
    colorListEasy.add("white");
    piecesListEasy.add("king");
    locationListEasy.add("56");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("76");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("67");
    colorListEasy.add("black");
    piecesListEasy.add("king");
    locationListEasy.add("57");
    colorListEasy.add("black");
    piecesListEasy.add("rook");

    solutionEasy.add("d5 e7");
    System.out.println("The Chess Mode is Easy Puzzles, this is Puzzle Number 3");
    boardEasy.solve("", locationListEasy, piecesListEasy,colorListEasy,solutionEasy,"white",false);

    solutionEasy.clear();
    colorListEasy.clear();
    piecesListEasy.clear();
    locationListEasy.clear();

    locationListEasy.add("30");
    colorListEasy.add("white");
    piecesListEasy.add("rook");
    locationListEasy.add("64");
    colorListEasy.add("white");
    piecesListEasy.add("bishop");
    locationListEasy.add("60");
    colorListEasy.add("white");
    piecesListEasy.add("king");
    locationListEasy.add("47");
    colorListEasy.add("black");
    piecesListEasy.add("king");
    locationListEasy.add("56");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");

    solutionEasy.add("d1 d8");
    System.out.println("The Chess Mode is Easy Puzzles, this is Puzzle Number 4");
    boardEasy.solve("", locationListEasy, piecesListEasy,colorListEasy,solutionEasy,"white",false);

    solutionEasy.clear();
    colorListEasy.clear();
    piecesListEasy.clear();
    locationListEasy.clear();

    locationListEasy.add("13");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("60");
    colorListEasy.add("white");
    piecesListEasy.add("king");
    locationListEasy.add("23");
    colorListEasy.add("white");
    piecesListEasy.add("pawn");
    locationListEasy.add("76");
    colorListEasy.add("white");
    piecesListEasy.add("rook");
    locationListEasy.add("15");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("24");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("25");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("35");
    colorListEasy.add("black");
    piecesListEasy.add("pawn");
    locationListEasy.add("25");
    colorListEasy.add("black");
    piecesListEasy.add("king");

    solutionEasy.add("b4 b5");
    System.out.println("The Chess Mode is Easy Puzzles, this is Puzzle Number 5");
    boardEasy.solve("", locationListEasy, piecesListEasy,colorListEasy,solutionEasy,"white",false);

  }
}
