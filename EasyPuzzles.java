import java.util.*;

public class EasyPuzzles extends ChessPuzzle{
  public static void main(String[] args) {
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
    board.solve( locationList2, piecesList2,colorList2,solution2,"white");

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
    board.solve( locationList2, piecesList2,colorList2,solution2,"white");

  }
}
