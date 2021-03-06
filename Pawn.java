
public class Pawn extends Piece{
  public String color;
  public boolean hasMoved;
  public boolean emPassanAble;

  public Pawn(String color){
    this.color = color;
    this.hasMoved = false;
  }

  @Override
     public String toString(){
         if(getColor().equals("white")) return Color.colorize("♟︎",Color.WHITE+Color.BRIGHT);
        return Color.colorize("♟︎",Color.BLACK);
     }

   @Override
     public boolean canMove(ChessBoard cb, int initialX, int initialY, int destX, int destY){
       Piece[][] board=cb.board;
       if (cb.scoreSheet.size()!=0){
       if (Math.abs(Integer.parseInt(cb.scoreSheet.get(cb.scoreSheet.size()-1).substring(4,5))-Integer.parseInt(cb.scoreSheet.get(cb.scoreSheet.size()-1).substring(1,2)))
       ==2){
        int[] prevMove= cb.parseScanner(cb.scoreSheet.get(cb.scoreSheet.size()-1));
        if (board[prevMove[2]][prevMove[3]].getClass().isInstance(new Pawn(color))&&board[destX][destY]==null){
          if (color=="white"){
            if (initialX==4 && destX==5 && Math.abs(initialY-destY)==1 && Math.abs(prevMove[3]-initialY)==1 &&prevMove[3]==destY){
              emPassanAble=true;
              return true;
            }
          }
          if (color=="black"){
            if (initialX==3 && destX==2 && Math.abs(initialY-destY)==1 &&Math.abs(prevMove[3]-initialY)==1 &&prevMove[3]==destY){
              emPassanAble=true;
              return true;
            }
          }
        }
        }
       }
       if(color.equals("white")){
         if(initialX > destX){
           return false;
         }
       }else{
         if(destX > initialX){
           return false;
         }
       }

       if(initialY == destY){
         //Not taking a piece
         if(color.equals("white")){
           if(board[initialX + 1][initialY] != null){
             return false;
           }
         }else{
           if(board[initialX - 1][initialY] != null){
             return false;
           }
         }
         if(Math.abs(destX - initialX) > 2){
           return false;
         }else if(Math.abs(destX - initialX) == 2){
           //jump Two
           if(hasMoved){
             return false;
           }

           if(color.equals("white")){
             if(board[initialX + 2][initialY] != null){
               return false;
             }
           }else{
             if(board[initialX - 2][initialY] != null){
               return false;
             }
           }

}

       }else{
         //Capturing
         if(Math.abs(destY - initialY) != 1 || Math.abs(destX - initialX) != 1){
           return false;
         }

         if(board[destX][destY] == null){
           return false;
         }
       }
       return true;
     }

     public String getColor(){
        return this.color;
    }

   }
