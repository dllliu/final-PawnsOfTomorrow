import java.util.*;
public class Demo {
  public static void main(String[] args){
      ArrayList<String> locationList = new ArrayList<String>();
      ArrayList<String> piecesList = new ArrayList<String>();
      ArrayList<String> colorList = new ArrayList<String>();
      ArrayList<String> solution= new ArrayList<String>();
      solution.add("f5 f3");
      solution.add("h8 g8");
      solution.add("f3 f5");
      solution.add("g8 h8");
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
 }


}
