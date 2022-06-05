# final-PawnsOfTomorrow 
Link To Prototype: https://docs.google.com/document/d/1bDvRKP7p-PgfG3VMVllPY6koIaWTCoqLTFEoWPa82vM/edit?usp=sharing

Daniel Liu (5/23): Made skeleton of Chess. Made instance variables like boolean isChecked, made Piece Class as well. Instance Variables in Piece like color and type, which will be useful for later methods and individual Piece subclasses.

Daniel Liu (5/24): Made all Piece subclasses: Bishop, King, Knight, and Pawn. Pieces have canMove method that is based on the rules for the movement of that piece in normal chess, toString, and getColor. Made PieceType Class, which holds values for individual pieces(extra feature that may be scrapped). Made saveGame() function that copies the board. 

Daniel Liu (5/25): Implemented canMove method for Knight and all other pieces. Made new Square class that holds information about the board's occupants. Made new move class that takes in squares as parameters. Board now holds objects for pieces, initialized every piece, constructor already in piece subclasses. Fixed bugs in overriding methods in subclasses of Piece.

Daniel Liu (5/26): Fixed bugs in boolean canMove for rook, knight, and bishop. Made new blank class because board cannot hold null values(null pointer exception). Need better solution for null values, maybe delete square class and reference positions on 2d array of board directly. ChessBoard toString fully outputs.

Daniel Liu (5/27): Removed square class to allow for null values for empty squares/spaces. Fixed bugs in Pawn and Queen, made instance variable booleans in piece class
public to allow for easier access from other classes. Merged Code into Main to show toString.

Daniel Liu (5/28): Updated canMove for King and Rook. Added new feature for castling and appropriate instance variables for the pawn and king subclass. Merged changes into main.

Daniel Liu (5/30): Tested makeMove and deleted instance variables that were not used, deleted placeholder test for toString for Chess Board. Worked on parsing commands entered by the user with helper methods for converting characters and added getColor method for every piece subclass.

Daniel Liu (5/31): Added prototype Doc in ReadMe. Worked on debugging using stackTrace, fixed toString so that it outputs a baord with the correct pieces and format. Deleted Move class, added tests for resign, stalemate, check, and checkmate. Merged into main.

Daniel Liu (6/1): Fixed big where pawn hasMoved was not updated when it moved, allowing it to move 2 squares multiple times. Tried to fix castle for king and rook, but does not work queen side. Tested and made sure capture and resign work properly, verified movement of all other pieces.

Daniel Liu (6/2): Reverted back to a previous version, features pushed to main broke essential chess features like moving. Worked further on debugging castle and king moves, plan to finish tomorrow and begin on different modes/animation.

Daniel Liu (6/4): Debugged king and pawn moves, fixed pawn entirely. King castle queen side modifies king position correctly, but not rook. Fixed Bishop movement, improved readibility of code for en passant. 
