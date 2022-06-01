
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
         if(getColor().equals("white")) return "♙";
        return "♟︎";
     }

   @Override
     public boolean canMove(Piece[][] board, int initialX, int initialY, int destX, int destY){
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

           //En passante
           if(destY + 1 < 8){
             if(board[destX][destY + 1] != null){
               if(board[destX][destY + 1].getClass().isInstance(new Pawn("white"))){
                 emPassanAble = true;
               }
             }
           }else if(destY - 1 > 0){
             if(board[destX][destY - 1] != null){
               if(board[destX][destY - 1].getClass().isInstance(new Pawn("white"))){
                 emPassanAble = true;
               }
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
       hasMoved = true;
       return true;
     }

     public String getColor(){
        return this.color;
    }

   }
