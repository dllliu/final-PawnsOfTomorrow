import java.util.*;
public class RandomPlayer{
  public static void play(){
    ArrayList<String> locationList = new ArrayList<String>();
    ArrayList<String> piecesList = new ArrayList<String>();
    ArrayList<String> colorList = new ArrayList<String>();

    locationList.add("00");
    locationList.add("10");
    locationList.add("20");
    locationList.add("30");
    locationList.add("40");
    locationList.add("50");
    locationList.add("60");
    locationList.add("70");
    locationList.add("01");
    locationList.add("11");
    locationList.add("21");
    locationList.add("31");
    locationList.add("41");
    locationList.add("51");
    locationList.add("61");
    locationList.add("71");
    locationList.add("07");
    locationList.add("17");
    locationList.add("27");
    locationList.add("37");
    locationList.add("47");
    locationList.add("57");
    locationList.add("67");
    locationList.add("77");
    locationList.add("06");
    locationList.add("16");
    locationList.add("26");
    locationList.add("36");
    locationList.add("46");
    locationList.add("56");
    locationList.add("66");
    locationList.add("76");

    piecesList.add("rook");
    piecesList.add("knight");
    piecesList.add("bishop");
    piecesList.add("queen");
    piecesList.add("king");
    piecesList.add("bishop");
    piecesList.add("knight");
    piecesList.add("rook");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("rook");
    piecesList.add("knight");
    piecesList.add("bishop");
    piecesList.add("queen");
    piecesList.add("king");
    piecesList.add("bishop");
    piecesList.add("knight");
    piecesList.add("rook");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");
    piecesList.add("pawn");

    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");
    colorList.add("white");

    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");
    colorList.add("black");

    ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);

    String yourColor;
    if (Math.random()>0.5){
      yourColor = "white";
    }
    else{
      yourColor="black";
    }
   String color = "white";
   System.out.println(newBoard.toString(otherColor(color)));
   int count=0;
   String move;
   while(true){
     System.out.println("You are playing as " + yourColor);
     System.out.println (newBoard.scoreSheet.toString());
     if (color.equals(yourColor)){
       System.out.println(color + " enter your move");
       Scanner in = new Scanner(System.in);
        move = in.nextLine();
       if (move.contains("resign")){
         System.out.println(color + " resigns");
         System.out.println(otherColor(color) + " wins");
         return;
       }
     }
     else{
       ArrayList<String> allMovesList=newBoard.allPossibleMoves(color);
        move = allMovesList.get((int)(Math.random()*allMovesList.size()));
    }

     System.out.print("\033[H\033[2J");
     System.out.flush();
     try{
       newBoard.makeMove(move, color, true);
       System.out.println(newBoard.toString(color));
     }catch(IllegalArgumentException e){
       e.printStackTrace();
       System.out.println("Invalid move: Enter Moves in following format: Character + number + space + Character + number");
       System.out.println(newBoard.toString(color));
       continue;
     }
     if(!newBoard.canAnyMove(otherColor(color))){
       if(newBoard.isChecked(otherColor(color))){
         System.out.println(color + " checkmated " + otherColor(color));
       }
     else{
       System.out.println("Game has ended in a stalemate");
     }
     return;
   }
    if(newBoard.isChecked(otherColor(color))) {
       System.out.println(otherColor(color) + " is in check.");
     }
     color = otherColor(color);
     if (newBoard.count50==100){
       System.out.println("Game has ended in a draw due to the 50 move rule");
       return;
     }
   }
 }
 public static String otherColor(String color){
   if (color.equals("white")){
     return "black";
   }
   return "white";
 }
  }
