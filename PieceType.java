public enum PieceType{
  PAWN(1),
  BISHOP(3),
  KNIGHT(3),
  ROOK(5),
  QUEEN(9),
  KING(25),
  CAPTURED(0);

  private int value;

  private PieceType(int val){
    val = value;
  }

  private int getVal(){
    return this.value;
  }


}
