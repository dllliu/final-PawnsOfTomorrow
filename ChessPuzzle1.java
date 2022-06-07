import java.util.*;

public class ChessPuzzle1 extends ChessPuzzle{
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
    piecesList.add("rook");
    locationList.add("27");
    colorList.add("black");
    piecesList.add("king");
    solution.add("g1 d4");
    solution.add("h8 g8");
    solution.add("d4 a1");

    ChessPuzzle board=new ChessPuzzle();
    board.solve( locationList, piecesList,colorList,solution,"white");
  }
}
