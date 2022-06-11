# final-PawnsOfTomorrow
Link To Prototype: https://docs.google.com/document/d/1bDvRKP7p-PgfG3VMVllPY6koIaWTCoqLTFEoWPa82vM/edit?usp=sharing

Daniel Liu (5/23): Made skeleton of Chess. Made instance variables like boolean isChecked, made Piece Class as well. Instance Variables in Piece like color and type, which will be useful for later methods and individual Piece subclasses.

Eugene Yoo (5/23):
Created ChessBoard class, which is zero indexed and converts commands like “a1 a2” into moving the piece on a1 to a2. I created a constructor and getPiece() methods, and I also started filling in the methods we had planned ChessBoard to contain in our UML diagram. Color was helpful to make moves depending on whose turn it was.

Daniel Liu (5/24): Made all Piece subclasses: Bishop, King, Knight, and Pawn. Pieces have canMove method that is based on the rules for the movement of that piece in normal chess, toString, and getColor. Made PieceType Class, which holds values for individual pieces(extra feature that may be scrapped). Made saveGame() function that copies the board.

Eugene Yoo (5/24):
Made good progress on ChessBoard. I created a constructor that sets up the initial board with Strings, an updateMove() that makes a move given a piece and the initial and destination coordinates, and a toString() that displays the board based on the viewpoint of the player (the colors are reversed, and the coordinates to the side and bottom are flipped.)

Daniel Liu (5/25): Implemented canMove method for Knight and all other pieces. Made new Square class that holds information about the board's occupants. Made new move class that takes in squares as parameters. Board now holds objects for pieces, initialized every piece, constructor already in piece subclasses. Fixed bugs in overriding methods in subclasses of Piece.

Eugene Yoo (5/25):
Tested ChessBoard and helped modify piece classes such as Knight next to Daniel. Had some problems with branching and merge conflicts so I wasn’t able to push my changes.

Daniel Liu (5/26): Fixed bugs in boolean canMove for rook, knight, and bishop. Made new blank class because board cannot hold null values(null pointer exception). Need better solution for null values, maybe delete square class and reference positions on 2d array of board directly. ChessBoard toString fully outputs.

Eugene Yoo (5/26):
Modified Pawn commands. Specifically looked into the canMove() method to ensure that capture and move forward 1 worked. Need to make sure that capture works only if there is a piece directly adjacent to the pawn that is capturable, and that it can move forward one if there is no piece in front of the pawn.

Daniel Liu (5/27): Removed square class to allow for null values for empty squares/spaces. Fixed bugs in Pawn and Queen, made instance variable booleans in piece class
public to allow for easier access from other classes. Merged Code into Main to show toString.

Eugene Yoo (5/27):
Worked more on pawn subclass, and developed ChessBoard. I helped build promote, which requires two cases based on the color of the pawn. If the pawn is white, then the index for Y that has to be checked is 7. If the pawn is black, then the index for Y that has to be checked is 0. Daniel also removed the square class, so I had to adjust ChessBoard more to accommodate 2D boards.

Daniel Liu (5/28): Updated canMove for King and Rook. Added new feature for castling and appropriate instance variables for the pawn and king subclass. Merged changes into main.

Daniel Liu (5/30): Tested makeMove and deleted instance variables that were not used, deleted placeholder test for toString for Chess Board. Worked on parsing commands entered by the user with helper methods for converting characters and added getColor method for every piece subclass.

Daniel Liu (5/31): Added prototype Doc in ReadMe. Worked on debugging using stackTrace, fixed toString so that it outputs a baord with the correct pieces and format. Deleted Move class, added tests for resign, stalemate, check, and checkmate. Merged into main.

Eugene Yoo (5/31):
Made en passant function. The way en passant works is that if the opponent has just moved a pawn 2 squares forward, if my pawn is right next to that pawn, then I can capture it. This was a bit of a challenge because you cannot check just destX and destY or adjacency. You also need to make sure the last move was a jump of two squares. In order to accomplish this, I had to create an instance variable called scoreSheet which is of type ArrayList<String> that looks at the previous move and makes sure it bounced two. Also changed inputs of makeMove() to take in a ChessBoard rather than a 2D piece board because I need to call instance variables and other ChessBoard methods.

Daniel Liu (6/1): Fixed bug where pawn hasMoved was not updated when it moved, allowing it to move 2 squares multiple times. Tried to fix castle for king and rook, but does not work queen side. Tested and made sure capture and resign work properly, verified movement of all other pieces.

Eugene Yoo (6/1):
Looked over code, and helped with alignment to make sure that the pieces were all correct and printed out properly in the toString() method in ChessBoard. Verified knight and king movement, and helped debug rook and bishop subclasses.

Daniel Liu (6/2): Reverted back to a previous version, features pushed to main broke essential chess features like moving. Worked further on debugging castle and king moves, plan to finish tomorrow and begin on different modes/animation.

Eugene Yoo (6/2):
Made a fix of changing “white” to color, so that the methods would be applicable to white and black pieces. Further developed en passant by allowing emPassanAble to work under check and counter a move.

Daniel Liu (6/3): Fixed bug in rook where it only will move one square horizontally or vertically at a time. Added better error messages for players to understand why the move is invalid, like moving while in check.

Daniel Liu (6/4): Debugged king and pawn moves, fixed pawn entirely. King castle queen side modifies king position correctly, but not rook. Fixed Bishop movement, improved readibility of code for en passant.

Eugene Yoo (6/4):
Made long castles and short castles work. The king can move two spaces to the right and left if both it and the rook have not yet moved. It is difficult to implement because the rook needs to be able to go to a new square and it isn’t related to destY or destX. However, you can check this with another instance variable called hasMoved which moves the rook if the king and rook have not moved yet.

Eugene Yoo (6/5): Made isChecked() work. This is an important method because it can be used in makeMove() and can determine whether a move is valid. If after a move a king is still in check, then that move is invalid. I also increased consistency related to inheritance by implementing constructors and instance variables in the subclasses and helped check for possible errors with piece movement. Additionally, I made sure that you can’t castle away when the king is in check or castling through or over a square that is checked, which I had to do by implementing my own isChecked() inside the King subclass. Created oldBoard which resets board in canAnyMove after each move is tested, and got rid of unnecessary code.

Daniel Liu (6/6): Verified promote, check, and checkmate. Full Game of Chess Works. Finished parsing args for new modes when running the file using integers. Made another version of toString in which diagonal paths are easier to see due to chess board pattern. Finished 3-Check.

Eugene Yoo (6/6):
Updated ChessBoard implementation and I also used clearBoard. Also made ChessBoard take in 4 arraylists as inputs. These are very useful because I want to create different variants of chess that don’t all contain the traditional initial setup of black and white pieces. Furthermore, for tactics, I can now set up initial coordinates and final coordinates. Removed draw instance variable because it was overly complicated as it would mean that the opponent would have to accept or decline. Also made sure that all locations were in bounds (not over 7 or less than 0).

Eugene Yoo (6/7):
I worked on expanding the Chess Puzzles. Created three more tactics, and I am planning to have two modes to choose from (hard, and easy). I also created draw50, which is a conditional in ChessGame that ends the game of chess once 50 black and white consecutive moves (100 total) have occurred without a capture or pawn push.

Daniel Liu (6/7): Added support for draw50 across all modes that are appropriate, added support for parsing to go to the relevant chess tutorial(so far only chessPuzzle1). Worked on colorize.
 
Eugene Yoo (6/8):
I created two full classes of HardPuzzles and EasyPuzzles. Both classes contain 5 tactics each, and they extend ChessPuzzle. The goal is to include these classes in ChessGame as an additional mode to call. To create HardPuzzles and EazyPuzzles, I needed to create a solve method, which essentially is similar to makeMove but with additional features such as the fact that the input move has to be equal to the solution and the game will automatically play the opponent's move based on the solution arraylist.
 
Daniel Liu(6/9): Made a new color scheme for board. Started King of The Hill. Parsing for all available chess tutorials, like the easy and hard chess tutorials, with printing of the mode currently selected. Updated instructions to be more clear, string arguements when running file instead of integer arguements.

 Eugene Yoo (6/10):
 Built a new solve method in ChessPuzzle that is applicable to HardPuzzles and EasyPuzzles but also to Demo, a new class I made. The difference between Demo and HardPuzzles is that Demo will explicitly give you the solution for you to type in, whereas for HardPuzzles or EasyPuzzles you have to type in the word help or find the correct move by yourself. This functionality will help Mr. K run our program, and it also allows for concise code. Daniel and I also determined that to make our ChessGame main not too clogged up, we could call methods in other classes like a Demo method for example.
