public class Pawn extends Piece{
  public Pawn(boolean white){
    super(white);
  }

  private int value;
  private boolean jumpTwo;

  @Override
     public String toString(){
         if(this.isWhite() == true) return "♙";
        return "♟︎";
     }

  public Pawn(boolean isWhite){
    name="Pawn";
    value=1;
    jumpTwo=true;
  }

  public boolean canMove(ChessBoard board, Square initial, Square dest){
    //Not same color
    if (dest.getPiece().isWhite() == this.isWhite()){
      return false;
    }
    //Capture one
    if (dest.getX()==initial.getX()+1||dest.getX()==initial.getX()-1&&dest.getY()-initial.getY()==1&&dest.getPiece()!=Blank){
      return true;
    }
    //Enpassant
    if (scoreSheet.get(scoreSheet.size()-1).getDist()==2){
      if (dist.getY()==initial.getY()&&dist.getX()==initial.getX()+1||dist.getX()==initial.getX()-1){//make sure next square is not same pawn
        return true;
      }
    }
    //Empty
    if(dest.getPiece()) != Blank){
      return false;
    }
    //JumpTwo
    if(jumpTwo&&dest.getY()-initial.getY()==2){
      return true;
    }
    //jumpOne
    if(dest.getY()-initial.getY()==1){
      return true;
    }
  }

  public boolean promote(ChessBoard board, Square initial, Square dest){
    if (White){
      if (initial.getY()==7&&dest.getY()==8&&(dest.getY()==BLANK)){
        return true;
      }
    }
    if (!isWhite){
      if (initial.getY()==2&&dest.getY()==1&&dest.getY()==BLANK){
        return true;
      }
    }
    return false;
  }
}
