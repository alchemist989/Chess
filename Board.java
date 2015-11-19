public class Board {
	
	static Piece[][] myBoard;
	static boolean gameEnd;
	static boolean colorSelectPiece;
	static Piece choosen;
	static int turn;
	
	public Board() {
		myBoard = new Piece[8][8];
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				//Blank Spaces 
				if (y > 1 && y < 6) {
					myBoard[x][y] = null;
					
				//(WHITE) Creating Board Pieces
				} else if (y == 1) {
					myBoard[x][y] = new Pawn(0, x, y);
				} else if (y == 6) {
					myBoard[x][y] = new Pawn(1, x, y);
				} else if (y == 0) {
					if (x == 0 || x == 7) {
						myBoard[x][y] = new Rook(0, x, y);
					} else if (x == 1 || x == 6) {
						myBoard[x][y] = new Knight(0, x, y); 
					} else if (x == 2 || x == 5) {
						myBoard[x][y] = new Bishop(0, x, y);
					} else if (x == 3) {
						myBoard[x][y] = new Queen(0, x, y);
					} else {
						myBoard[x][y] = new King(0, x, y);
					} 
				} else if (y == 7) {
					if (x == 0 || x == 7) {
						myBoard[x][y] = new Rook(1, x, y);
					} else if (x == 1 || x == 6) {
						myBoard[x][y] = new Knight(1, x, y); 
					} else if (x == 2 || x == 5) {
						myBoard[x][y] = new Bishop(1, x, y);
					} else if (x == 4) {
						myBoard[x][y] = new Queen(1, x, y);
					} else {
						myBoard[x][y] = new King(1, x, y);
					}
				}
			}
		}
	}
	
	
	private void endTurn() {
		turn = 1-turn;
	}
	
	public static void drawBoard() {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				//Black and White Spaces on Board
				if ((y + x) % 2 == 0) {
					StdDrawPlus.setPenColor(StdDrawPlus.DARK_GRAY);
				} else {
					StdDrawPlus.setPenColor(StdDrawPlus.WHITE);
				}
				StdDrawPlus.filledSquare(x + .5, y + .5, .5);
				//Draw Pieces in Board
				if (myBoard[x][y] != null) {
	  	  			StdDrawPlus.picture(x + .5, y + .5, myBoard[x][y].picture(), 1, 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Board b = new Board();
		StdDrawPlus.setScale(0, 8);
		drawBoard();
		while (!gameEnd) {
			int x, y;
			if (StdDrawPlus.mousePressed()) {
				x = (int) StdDrawPlus.mouseX();
				y = (int) StdDrawPlus.mouseY();
				//null case
				if (myBoard[x][y] == null && choosen == null) {
					continue;
				} else if (myBoard[x][y] == null && choosen != null) {
					//Move to empty space
				}
				Piece p = myBoard[x][y];
				if (p.side == turn && choosen == null) {
					choosen = p;
					colorSelectPiece = true;
				} else if (p.side == turn && choosen != null) {
					choosen = p;
					colorSelectPiece = true;
				} else if (p.side != turn && choosen != null) {
					//Move to Capture
				}
				//Color the selected Piece
				if (colorSelectPiece) {
					StdDrawPlus.setPenColor(StdDrawPlus.MAGENTA);
					StdDrawPlus.filledSquare(x + .5, y + .5, .5);
				} else {
					drawBoard();
				}
			}
			if (StdDrawPlus.isSpacePressed()) {
				b.endTurn();
				drawBoard();
			}
		}
	}
}
	
