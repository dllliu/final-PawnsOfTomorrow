public class Pawn extends Piece{
  public Pawn(boolean white){
    super(white);
  }

  @Override
     public String toString(){
         if(this.isWhite() == true) return "♙";
        return "♟︎";
     }

   @Override
     public boolean canMove(ChessBoard board, Square initial, Square dest){
       return true;
     }
}
