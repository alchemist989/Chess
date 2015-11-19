
public class Rook extends Piece {
	
	public Rook(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("Rook", side, posX, posY, b);
	}
	
	public String picture() {
		if (side == 0) {
			return "img/white_rook.png";
		} else {
			return "img/black_rook.png";
		}
	}
	
	public void move(int desX, int desY) {
		for (int i = 0; i < 8; i++) {
			
			if (checkBounds(desX, i)) {
				if (posX == desX && i == desY) {
					myBoard[desX][desY] = myBoard[posX][posY];
					myBoard[posX][posY] = null;
					posX = desX;
					posY = desY;
				}
			}
			if (checkBounds(i, desY)) {
				if (posY == desY && i == desX) {
					myBoard[desX][desY] = myBoard[posX][posY];
					myBoard[posX][posY] = null;
					posX = desX;
					posY = desY;
				}
			}
		}
	}
}
