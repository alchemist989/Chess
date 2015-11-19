public class Board {
	
	Piece[][] myBoard;
	
	
	
	
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
	
	public static void drawBoard() {
		
	}
	public static void main(String[] args) {
		Board b = new Board();
		StdDrawPlus.setScale(0, 8);
		drawBoard();
	}
}
