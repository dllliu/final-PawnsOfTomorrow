import java.util.*;
public class Demo {
  public static void main(String[] args){
      ArrayList<String> locationList = new ArrayList<String>();
      ArrayList<String> piecesList = new ArrayList<String>();
      ArrayList<String> colorList = new ArrayList<String>();
      ArrayList<String> solution= new ArrayList<String>();

      solution.add("h7 h8 N");
      locationList.add("76");
      colorList.add("white");
      piecesList.add("pawn");
      locationList.add("54");
      colorList.add("black");
      piecesList.add("king");
      locationList.add("00");
      colorList.add("white");
      piecesList.add("king");
      ChessPuzzle.solve("promote with specificed piece",locationList,piecesList,colorList,solution,"white",true);
      solution.clear();
      colorList.clear();
      piecesList.clear();
      locationList.clear();

      solution.add("f5 f7");
      locationList.add("54");
      colorList.add("white");
      piecesList.add("queen");
      locationList.add("77");
      colorList.add("black");
      piecesList.add("king");
      locationList.add("00");
      colorList.add("white");
      piecesList.add("king");
      ChessPuzzle.solve("stalemate",locationList,piecesList,colorList,solution,"white",true);
      solution.clear();
      colorList.clear();
      piecesList.clear();
      locationList.clear();

      solution.add("h7 h8");
      locationList.add("76");
      colorList.add("white");
      piecesList.add("pawn");
      locationList.add("54");
      colorList.add("black");
      piecesList.add("king");
      locationList.add("00");
      colorList.add("white");
      piecesList.add("king");
      ChessPuzzle.solve("default promote",locationList,piecesList,colorList,solution,"white",true);
      solution.clear();
      colorList.clear();
      piecesList.clear();
      locationList.clear();

      solution.add("e1 g1");
      locationList.add("40");
      colorList.add("white");
      piecesList.add("king");
      locationList.add("13");
      colorList.add("black");
      piecesList.add("bishop");
      locationList.add("01");
      colorList.add("white");
      piecesList.add("pawn");
      locationList.add("70");
      colorList.add("white");
      piecesList.add("rook");
      locationList.add("16");
      colorList.add("black");
      piecesList.add("king");

      ChessPuzzle.solve("castle through check, which is not legal",locationList,piecesList,colorList,solution,"white",true);
      solution.clear();
      colorList.clear();
      piecesList.clear();
      locationList.clear();
 }
}
