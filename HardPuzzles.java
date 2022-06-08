import java.util.*;

public class HardPuzzles extends ChessPuzzle{
  public static void main(String[] args) {
    ArrayList<String> locationList = new ArrayList<String>();
    ArrayList<String> piecesList = new ArrayList<String>();
    ArrayList<String> colorList = new ArrayList<String>();
    ArrayList<String> solution = new ArrayList<String>();

    locationList.add("25");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("37");
    colorList.add("black");
    piecesList.add("king");
    locationList.add("74");
    colorList.add("white");
    piecesList.add("rook");
    solution.add("h5 e5");
    solution.add("d8 c8");
    solution.add("e5 e8");

    ChessPuzzle board=new ChessPuzzle();
    board.solve( locationList, piecesList,colorList,solution,"white");

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();

    locationList.add("10");
    colorList.add("white");
    piecesList.add("rook");
    locationList.add("02");
    colorList.add("white");
    piecesList.add("queen");
    locationList.add("54");
    colorList.add("white");
    piecesList.add("knight");
    locationList.add("60");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("31");
    colorList.add("black");
    piecesList.add("rook");
    locationList.add("72");
    colorList.add("black");
    piecesList.add("queen");
    locationList.add("57");
    colorList.add("black");
    piecesList.add("knight");
    locationList.add("56");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("76");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("67");
    colorList.add("black");
    piecesList.add("king");

    solution.add("a3 f8");
    solution.add("g8 f8");
    solution.add("b1 b8");
    solution.add("d2 d8");
    solution.add("b8 d8");

    board.solve( locationList, piecesList,colorList,solution,"white");

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();
//Uptohere
    locationList.add("05");
    colorList.add("white");
    piecesList.add("queen");
    locationList.add("06");
    colorList.add("black");
    piecesList.add("queen");
    locationList.add("07");
    colorList.add("black");
    piecesList.add("king");
    locationList.add("34");
    colorList.add("white");
    piecesList.add("knight");
    locationList.add("60");
    colorList.add("white");
    piecesList.add("king");

    solution.add("d5 b6");
    solution.add("a8 b8");
    solution.add("a6 c8");

    board.solve( locationList, piecesList,colorList,solution,"white");

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();

    locationList.add("01");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("13");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("24");
    colorList.add("white");
    piecesList.add("knight");
    locationList.add("21");
    colorList.add("white");
    piecesList.add("queen");
    locationList.add("50");
    colorList.add("white");
    piecesList.add("rook");
    locationList.add("61");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("62");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("71");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("05");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("16");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("17");
    colorList.add("black");
    piecesList.add("queen");
    locationList.add("47");
    colorList.add("black");
    piecesList.add("rook");
    locationList.add("57");
    colorList.add("black");
    piecesList.add("king");
    locationList.add("56");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("66");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("76");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("55");
    colorList.add("black");
    piecesList.add("knight");


    solution.add("f1 f6");
    solution.add("g7 f6");
    solution.add("c5 d7");

    board.solve( locationList, piecesList,colorList,solution,"white");

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();

    locationList.add("11");
    colorList.add("white");
    piecesList.add("knight");
    locationList.add("14");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("26");
    colorList.add("black");
    piecesList.add("king");
    locationList.add("35");
    colorList.add("black");
    piecesList.add("rook");
    locationList.add("47");
    colorList.add("white");
    piecesList.add("rook");
    locationList.add("55");
    colorList.add("white");
    piecesList.add("knight");
    locationList.add("53");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("64");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("65");
    colorList.add("black");
    piecesList.add("pawn");

    solution.add("e8 e2");
    solution.add("b2 c4");
    solution.add("e6 d8");

    board.solve( locationList, piecesList,colorList,solution,"white");

  }
}
