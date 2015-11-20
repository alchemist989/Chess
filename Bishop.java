
public class Bishop extends Piece {
	
	
	public Bishop(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("Bishop", side, posX, posY, b);
	}
	
	
	public String picture() {
		if (side == 0) {
			return "img/white_bishop.png";
		} else {
			return "img/black_bishop.png";
		}
	}
	
	public boolean move(int desX, int desY) {
		boolean[][] allowMovement = new boolean[8][8];
		for (int x = posX, y = posY; x < 8 && y < 8; x++, y++) {
			if (myBoard[x][y] != null && myBoard[x][y].side != side) {
				allowMovement[x][y] = true;
				break;
			}
			allowMovement[x][y] = true;
		}
		for (int x = posX, y = posY; x >= 0 && y < 8; x--, y++) {
			if (myBoard[x][y] != null && myBoard[x][y].side != side) {
				allowMovement[x][y] = true;
				break;
			}
			allowMovement[x][y] = true;
		}
		for (int x = posX, y = posY; x < 8 && y >= 0; x++, y--) {
			if (myBoard[x][y] != null && myBoard[x][y].side != side) {
				allowMovement[x][y] = true;
				break;
			}
			allowMovement[x][y] = true;
		}
		for (int x = posX, y = posY; x >=0 && y >= 0; x--, y--) {
			if (myBoard[x][y] != null && myBoard[x][y].side != side) {
				allowMovement[x][y] = true;
				break;
			}
			allowMovement[x][y] = true;
		}
		if (checkBounds(desX, desY)) {
			if (allowMovement[desX][desY]) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		return false;
	}
}
 