public class King extends Piece {
	
	
	public King(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("King", side, posX, posY, b);
	}
	
	
	public String picture() {
		if (side == 0) {
			return "img/white_king.png";
		} else {
			return "img/black_king.png";
		}
	}
	
	public void move(int desX, int desY) {
		for (int i = posX - 1; i < posX + 2; i++) {
			for (int j = posY - 1; j < posY + 2; j++) {
				if (checkBounds(i, j)) {
					if (checkBounds(i, j) && i == desX && j == desY) {
						movingCapturing(desX, desY, myBoard[posX][posY]);
					}
				}
			}
		}
	}
}
