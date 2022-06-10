import java.util.*;

public class EasyPuzzles extends ChessPuzzle{
  public static void main(String[] args) {
    ArrayList<String> locationList = new ArrayList<String>();
    ArrayList<String> piecesList = new ArrayList<String>();
    ArrayList<String> colorList = new ArrayList<String>();
    ArrayList<String> solution = new ArrayList<String>();

    locationList.add("60");
    colorList.add("white");
    piecesList.add("bishop");
    locationList.add("50");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("56");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("76");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("77");
    colorList.add("black");
    piecesList.add("king");
    solution.add("g1 d4");

    ChessPuzzle board=new ChessPuzzle();
    board.solve("", locationList, piecesList,colorList,solution,"white",false);

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();

    locationList.add("01");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("21");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("32");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("24");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("34");
    colorList.add("white");
    piecesList.add("bishop");
    locationList.add("35");
    colorList.add("white");
    piecesList.add("bishop");
    locationList.add("46");
    colorList.add("white");
    piecesList.add("rook");
    locationList.add("60");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("61");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("71");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("33");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("24");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("44");
    colorList.add("black");
    piecesList.add("bishop");
    locationList.add("06");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("16");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("07");
    colorList.add("black");
    piecesList.add("rook");
    locationList.add("27");
    colorList.add("black");
    piecesList.add("bishop");
    locationList.add("37");
    colorList.add("black");
    piecesList.add("queen");
    locationList.add("77");
    colorList.add("black");
    piecesList.add("king");
    locationList.add("76");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("65");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("54");
    colorList.add("black");
    piecesList.add("pawn");

    solution.add("d6 e5");
    board.solve("", locationList, piecesList,colorList,solution,"white",false);

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();

    locationList.add("11");
    colorList.add("white");
    piecesList.add("bishop");
    locationList.add("34");
    colorList.add("white");
    piecesList.add("knight");
    locationList.add("70");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("56");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("76");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("67");
    colorList.add("black");
    piecesList.add("king");
    locationList.add("57");
    colorList.add("black");
    piecesList.add("rook");

    solution.add("d5 e7");
    board.solve("", locationList, piecesList,colorList,solution,"white",false);

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();

    locationList.add("30");
    colorList.add("white");
    piecesList.add("rook");
    locationList.add("64");
    colorList.add("white");
    piecesList.add("bishop");
    locationList.add("60");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("47");
    colorList.add("black");
    piecesList.add("king");
    locationList.add("56");
    colorList.add("black");
    piecesList.add("pawn");

    solution.add("d1 d8");
    board.solve("", locationList, piecesList,colorList,solution,"white",false);

    solution.clear();
    colorList.clear();
    piecesList.clear();
    locationList.clear();

    locationList.add("13");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("60");
    colorList.add("white");
    piecesList.add("king");
    locationList.add("23");
    colorList.add("white");
    piecesList.add("pawn");
    locationList.add("76");
    colorList.add("white");
    piecesList.add("rook");
    locationList.add("15");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("24");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("25");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("35");
    colorList.add("black");
    piecesList.add("pawn");
    locationList.add("25");
    colorList.add("black");
    piecesList.add("king");

    solution.add("b4 b5");
    board.solve("", locationList, piecesList,colorList,solution,"white",false);

  }
}
