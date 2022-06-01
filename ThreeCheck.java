public class ThreeCheck extends ChessBoard{
  private int threeCheckWhiteCount;
  private int threeCheckBlackCount;

  // This code assumes isChecked runs once per move
  public boolean isChecked(String color){
    int[] kingPos = getKingPos(color);
    int r = kingPos[0];
    int c = kingPos[1];

    for(int i =0; i<board.length; i++){
      for(int j=0; j<board[0].length; j++){
        if(board[i][j] != null){
          if (board[i][j].canMove(board, i, j, r, c) && !board[i][j].getColor().equals(color)){

            //This code needs to stay
            if (color=="black"){
              threeCheckBlackCount++;
            }
            else threeCheckWhiteCount++;
            return true;
          }
        }
      }
    }
    return false;
  }

  public boolean canAnyMove(String color){
    //This code assumes the rest of canAnyMove works
    if (color=="white"){
      if (threeCheckWhiteCount>=3)
        return false;
    }
    else if (threeCheckBlackCount>=3)
      return false;
      
     Piece[][] oldBoard = board.clone();
     for(int i =0; i<board.length; i++){
       for(int j=0; j<board[0].length; j++){
         for(int x =0; x<board.length; x++){
           for(int y=0; y<board[0].length; y++){
             try{
               if (board[i][j] != null){
                  if(board[i][j].getColor().equals(color)){
                     makeMove(convertMoveString(i, j, x, y), board[x][y].getColor(), false);
                      board = oldBoard;
                      return true;
               }
             }
             board = oldBoard;
           } catch (Exception e){
             board = oldBoard;
           }
         }
       }
     }
  }
  board = oldBoard;
  return false;
}
}
