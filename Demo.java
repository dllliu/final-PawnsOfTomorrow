import java.util.*;
public class Demo {
  public static void initDemo(){

      ArrayList<String> locationListDemo = new ArrayList<String>();
      ArrayList<String> piecesListDemo = new ArrayList<String>();
      ArrayList<String> colorListDemo = new ArrayList<String>();
      ArrayList<String> solutionDemo = new ArrayList<String>();

      solutionDemo.add("b1 c2");
      solutionDemo.add("b3 c2");
      solutionDemo.add("b2 c2");
      solutionDemo.add("a7 b8");
      solutionDemo.add("c2 b1");
      solutionDemo.add("h8 g8");
      solutionDemo.add("b1 a1");
      solutionDemo.add("g7 a1");
      solutionDemo.add("h1 g1");
      locationListDemo.add("10");
      colorListDemo.add("white");
      piecesListDemo.add("bishop");
      locationListDemo.add("11");
      colorListDemo.add("white");
      piecesListDemo.add("queen");
      locationListDemo.add("12");
      colorListDemo.add("black");
      piecesListDemo.add("bishop");
      locationListDemo.add("66");
      colorListDemo.add("black");
      piecesListDemo.add("bishop");
      locationListDemo.add("70");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("06");
      colorListDemo.add("black");
      piecesListDemo.add("queen");
      locationListDemo.add("77");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      ChessPuzzle.solve("queen and bishop",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();


      solutionDemo.add("a1 a5");
      solutionDemo.add("a8 b8");
      solutionDemo.add("a5 a8");
      solutionDemo.add("b8 g8");
      solutionDemo.add("a8 g8");
      solutionDemo.add("h8 g8");
      solutionDemo.add("b1 c3");
      solutionDemo.add("e5 d7");
      solutionDemo.add("c3 d1");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("rook");
      locationListDemo.add("10");
      colorListDemo.add("white");
      piecesListDemo.add("knight");
      locationListDemo.add("44");
      colorListDemo.add("black");
      piecesListDemo.add("knight");
      locationListDemo.add("70");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("07");
      colorListDemo.add("black");
      piecesListDemo.add("rook");
      locationListDemo.add("77");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      ChessPuzzle.solve("rook and knight",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();


      solutionDemo.add("h2 h4");
      solutionDemo.add("a7 a5");
      solutionDemo.add("h4 h5");
      solutionDemo.add("a5 a4");
      solutionDemo.add("h5 h6");
      solutionDemo.add("a4 a3");
      solutionDemo.add("h6 h7");
      solutionDemo.add("a3 a2");
      solutionDemo.add("h7 h8");
      solutionDemo.add("a8 a7");
      solutionDemo.add("h8 h7");
      locationListDemo.add("06");
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
      ChessPuzzle.solve("pawn and king",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

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

      solutionDemo.add("h2 h4");
      solutionDemo.add("a8 b8");
      solutionDemo.add("h4 h5");
      solutionDemo.add("g7 g6");
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
      ChessPuzzle.solve("pawn capture, which is when a pawn can capture an opponent pawn if that pawn has moved immediately two squares and is directly adjacent to your pawn",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
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

      solutionDemo.add("a8 b6");
      solutionDemo.add("a1 b3");
      solutionDemo.add("b6 d5");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("knight");
      locationListDemo.add("07");
      colorListDemo.add("black");
      piecesListDemo.add("knight");
      locationListDemo.add("70");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("77");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      ChessPuzzle.fiftyMove("shows 50 move rule, which is a draw when both sides haven't pushed a pawn or made a capture in the past 50 moves. The move count is set to 48 moves as black's turn to speed up the process",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"black",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h1 g1");
      solutionDemo.add("a8 b6");
      solutionDemo.add("a2 a4");
      locationListDemo.add("01");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("07");
      colorListDemo.add("black");
      piecesListDemo.add("knight");
      locationListDemo.add("70");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("77");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      ChessPuzzle.fiftyMove("shows how 50 move rule resets after a pawn move or capture. The move count is set to 48 moves as black's turn to speed up the process",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("e2 e4");
      solutionDemo.add("e7 e5");
      solutionDemo.add("f1 c4");
      solutionDemo.add("g7 g5");
      solutionDemo.add("d1 f3");
      solutionDemo.add("g5 g4");
      solutionDemo.add("f3 f7");
      locationListDemo.add("00");
      locationListDemo.add("10");
      locationListDemo.add("20");
      locationListDemo.add("30");
      locationListDemo.add("40");
      locationListDemo.add("50");
      locationListDemo.add("60");
      locationListDemo.add("70");
      locationListDemo.add("01");
      locationListDemo.add("11");
      locationListDemo.add("21");
      locationListDemo.add("31");
      locationListDemo.add("41");
      locationListDemo.add("51");
      locationListDemo.add("61");
      locationListDemo.add("71");
      locationListDemo.add("07");
      locationListDemo.add("17");
      locationListDemo.add("27");
      locationListDemo.add("37");
      locationListDemo.add("47");
      locationListDemo.add("57");
      locationListDemo.add("67");
      locationListDemo.add("77");
      locationListDemo.add("06");
      locationListDemo.add("16");
      locationListDemo.add("26");
      locationListDemo.add("36");
      locationListDemo.add("46");
      locationListDemo.add("56");
      locationListDemo.add("66");
      locationListDemo.add("76");
      piecesListDemo.add("rook");
      piecesListDemo.add("knight");
      piecesListDemo.add("bishop");
      piecesListDemo.add("queen");
      piecesListDemo.add("king");
      piecesListDemo.add("bishop");
      piecesListDemo.add("knight");
      piecesListDemo.add("rook");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("rook");
      piecesListDemo.add("knight");
      piecesListDemo.add("bishop");
      piecesListDemo.add("queen");
      piecesListDemo.add("king");
      piecesListDemo.add("bishop");
      piecesListDemo.add("knight");
      piecesListDemo.add("rook");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      piecesListDemo.add("pawn");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("white");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      colorListDemo.add("black");
      ChessPuzzle.solve("4 move checkmate for white",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("e1 f1");
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
      ChessPuzzle.solve("castle through check, which is not legal. To test this error, try e1 g1",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("e1 f1");
      locationListDemo.add("40");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("74");
      colorListDemo.add("black");
      piecesListDemo.add("bishop");
      locationListDemo.add("01");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("rook");
      locationListDemo.add("16");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      ChessPuzzle.solve("castle through a checked square, which is not legal. To test this error, try e1 c1",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("e1 g1");
      locationListDemo.add("40");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("01");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("70");
      colorListDemo.add("white");
      piecesListDemo.add("rook");
      locationListDemo.add("16");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      ChessPuzzle.solve("castle kingside, which is legal",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("e1 c1");
      locationListDemo.add("40");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      locationListDemo.add("01");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("70");
      colorListDemo.add("white");
      piecesListDemo.add("rook");
      locationListDemo.add("16");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("rook");
      ChessPuzzle.solve("castle queenside, which is legal",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h2 h4");
      locationListDemo.add("71");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("invalid move due to invalid start square. To test this, try h3 h4.",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h2 h4");
      locationListDemo.add("71");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("invalid move due to invalid destination square. To test this, try h2 h5.",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();

      solutionDemo.add("h2 h4");
      locationListDemo.add("71");
      colorListDemo.add("white");
      piecesListDemo.add("pawn");
      locationListDemo.add("54");
      colorListDemo.add("black");
      piecesListDemo.add("king");
      locationListDemo.add("00");
      colorListDemo.add("white");
      piecesListDemo.add("king");
      ChessPuzzle.solve("invalid move due to invalid start and destination square. To test this try h3 h4.",locationListDemo,piecesListDemo,colorListDemo,solutionDemo,"white",true);
      solutionDemo.clear();
      colorListDemo.clear();
      piecesListDemo.clear();
      locationListDemo.clear();
 }
}
