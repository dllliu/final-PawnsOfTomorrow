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

      solve("stalemate",locationList,piecesList,colorList,solution,"white");

      solution.clear();
      colorList.clear();
      piecesList.clear();
      locationList.clear();
 }

 public static void solve(String checkType,ArrayList<String> locationList,ArrayList<String> piecesList,ArrayList<String> colorList, ArrayList<String> solution, String color) {
   //xy
   ChessBoard newBoard = new ChessBoard(locationList,piecesList,colorList);
   System.out.print("\033[H\033[2J");
   System.out.flush();
   while(true){
     System.out.println(newBoard);
     System.out.println (newBoard.scoreSheet.toString());
     System.out.println(color + " enter your move");
     System.out.println("This checks "+checkType);
     System.out.println("Hint: make the move "+solution.get(0));
     Scanner in = new Scanner(System.in);
     String move = in.nextLine();
     if (move.contains("resign")){
       System.out.println(color + " resigns");
       System.out.println(otherColor(color) + " wins");
       return;
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
     if (newBoard.count50==100){
       System.out.println("Game has ended in a draw due to the 50 move rule");
       return;
     }
     if(!move.equals(solution.get(0))){
       System.out.print("\033[H\033[2J");
       System.out.flush();
        System.out.println("Wrong move. Try again");
       continue;
     }
     else{
       newBoard.makeMove(move, color, true);
       solution.remove(0);
       System.out.print("\033[H\033[2J");
       System.out.flush();
       if(solution.size()==0){
         System.out.println(newBoard);
         System.out.println("Success!");
         System.out.println("Press enter to continue");
         try{System.in.read();}
         catch(Exception e){}
         return;
       }
       newBoard.makeMove(solution.get(0), ChessGame.otherColor(color), true);
       solution.remove(0);
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
