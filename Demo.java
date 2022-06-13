import java.util.*;
public class Demo {
  public static void initDemo(){

      ArrayList<String> locationListDemo = new ArrayList<String>();
      ArrayList<String> piecesListDemo = new ArrayList<String>();
      ArrayList<String> colorListDemo = new ArrayList<String>();
      ArrayList<String> solutionDemo = new ArrayList<String>();

      solutionDemo.add("h2 h4");
      solutionDemo.add("a8 b8");
      solutionDemo.add("h4 h5");
      solutionDemo.add("g7 g5");
      solutionDemo.add("h5 g6");

      locationListDemo.add("66");
      colorListDemo.add("black");
      piecesListDemo.add("pawn");
      locationListDemo.add("71");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("07");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("enpassant, which is when a pawn can capture an opponent pawn if that pawn has moved immediately two squares and is directly adjacent to your pawn",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h7 h8 N");
      locationListDemo.add("76");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("promote with specificed piece",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("f5 f7");
      locationListDemo.add("54");
      colorListDemo.add("white");
      piecesListDemo.add("queen");
      locationListDemo.add("77");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("stalemate",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h7 h8");
      locationListDemo.add("76");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("default promote",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("e1 g1");
      locationListDemo.add("40");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("13");
      colorListDemo.add("black");
      piecesListDemo.add("bishop");
      locationListDemo.add("01");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("70");
      colorListDemo.add("white");
      piecesListDemo.add("rook");
      locationListDemo.add("16");
      colorListDemo.add("black");
      piecesListDemo.add("king");

      ChessPuzzle.solve("castle through check, which is not legal",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h3 h4");
      locationListDemo.add("71");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("invalid move due to invalid start square",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h2 h5");
      locationListDemo.add("71");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("invalid move due to invalid destination square",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h3 h4");
      locationListDemo.add("71");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("invalid move due to invalid start and destination square",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();
 }
}
