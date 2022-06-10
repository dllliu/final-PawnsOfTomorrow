import java.util.*;

public class HardPuzzles extends ChessPuzzle{
  public static void initHardPuzzles(){
    ArrayList<String> locationListHard = new ArrayList<String>();
    ArrayList<String> piecesList = new ArrayList<String>();
    ArrayList<String> colorListHard = new ArrayList<String>();
    ArrayList<String> solutionHard = new ArrayList<String>();

    locationListHard.add("25");
    colorListHard.add("white");
    piecesList.add("king");
    locationListHard.add("37");
    colorListHard.add("black");
    piecesList.add("king");
    locationListHard.add("74");
    colorListHard.add("white");
    piecesList.add("rook");
    solutionHard.add("h5 e5");
    solutionHard.add("d8 c8");
    solutionHard.add("e5 e8");

    ChessPuzzle boardHard=new ChessPuzzle();
    boardHard.solve("", locationListHard, piecesList,colorListHard,solutionHard,"white",false);

    solutionHard.clear();
    colorListHard.clear();
    piecesList.clear();
    locationListHard.clear();

    locationListHard.add("10");
    colorListHard.add("white");
    piecesList.add("rook");
    locationListHard.add("02");
    colorListHard.add("white");
    piecesList.add("queen");
    locationListHard.add("54");
    colorListHard.add("white");
    piecesList.add("knight");
    locationListHard.add("60");
    colorListHard.add("white");
    piecesList.add("king");
    locationListHard.add("31");
    colorListHard.add("black");
    piecesList.add("rook");
    locationListHard.add("72");
    colorListHard.add("black");
    piecesList.add("queen");
    locationListHard.add("57");
    colorListHard.add("black");
    piecesList.add("knight");
    locationListHard.add("56");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("76");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("67");
    colorListHard.add("black");
    piecesList.add("king");

    solutionHard.add("a3 f8");
    solutionHard.add("g8 f8");
    solutionHard.add("b1 b8");
    solutionHard.add("d2 d8");
    solutionHard.add("b8 d8");

    boardHard.solve("", locationListHard, piecesList,colorListHard,solutionHard,"white",false);

    solutionHard.clear();
    colorListHard.clear();
    piecesList.clear();
    locationListHard.clear();
//Uptohere
    locationListHard.add("05");
    colorListHard.add("white");
    piecesList.add("queen");
    locationListHard.add("06");
    colorListHard.add("black");
    piecesList.add("queen");
    locationListHard.add("07");
    colorListHard.add("black");
    piecesList.add("king");
    locationListHard.add("34");
    colorListHard.add("white");
    piecesList.add("knight");
    locationListHard.add("60");
    colorListHard.add("white");
    piecesList.add("king");

    solutionHard.add("d5 b6");
    solutionHard.add("a8 b8");
    solutionHard.add("a6 c8");

    boardHard.solve("", locationListHard, piecesList,colorListHard,solutionHard,"white",false);

    solutionHard.clear();
    colorListHard.clear();
    piecesList.clear();
    locationListHard.clear();

    locationListHard.add("01");
    colorListHard.add("white");
    piecesList.add("pawn");
    locationListHard.add("13");
    colorListHard.add("white");
    piecesList.add("pawn");
    locationListHard.add("24");
    colorListHard.add("white");
    piecesList.add("knight");
    locationListHard.add("21");
    colorListHard.add("white");
    piecesList.add("queen");
    locationListHard.add("50");
    colorListHard.add("white");
    piecesList.add("rook");
    locationListHard.add("61");
    colorListHard.add("white");
    piecesList.add("king");
    locationListHard.add("62");
    colorListHard.add("white");
    piecesList.add("pawn");
    locationListHard.add("71");
    colorListHard.add("white");
    piecesList.add("pawn");
    locationListHard.add("05");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("16");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("17");
    colorListHard.add("black");
    piecesList.add("queen");
    locationListHard.add("47");
    colorListHard.add("black");
    piecesList.add("rook");
    locationListHard.add("57");
    colorListHard.add("black");
    piecesList.add("king");
    locationListHard.add("56");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("66");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("76");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("55");
    colorListHard.add("black");
    piecesList.add("knight");


    solutionHard.add("f1 f6");
    solutionHard.add("g7 f6");
    solutionHard.add("c5 d7");
    solutionHard.add("f8 g8");
    solutionHard.add("d7 b8");

    boardHard.solve("", locationListHard, piecesList,colorListHard,solutionHard,"white",false);

    solutionHard.clear();
    colorListHard.clear();
    piecesList.clear();
    locationListHard.clear();

    locationListHard.add("11");
    colorListHard.add("black");
    piecesList.add("knight");
    locationListHard.add("14");
    colorListHard.add("black");
    piecesList.add("pawn");
    locationListHard.add("26");
    colorListHard.add("black");
    piecesList.add("king");
    locationListHard.add("35");
    colorListHard.add("black");
    piecesList.add("rook");
    locationListHard.add("47");
    colorListHard.add("white");
    piecesList.add("rook");
    locationListHard.add("55");
    colorListHard.add("white");
    piecesList.add("knight");
    locationListHard.add("53");
    colorListHard.add("white");
    piecesList.add("pawn");
    locationListHard.add("64");
    colorListHard.add("white");
    piecesList.add("king");
    locationListHard.add("65");
    colorListHard.add("black");
    piecesList.add("pawn");

    solutionHard.add("e8 e2");
    solutionHard.add("b2 c4");
    solutionHard.add("f6 e8");
    solutionHard.add("c7 d7");
    solutionHard.add("e8 d6");


    boardHard.solve("", locationListHard, piecesList,colorListHard,solutionHard,"white",false);

  }
}
