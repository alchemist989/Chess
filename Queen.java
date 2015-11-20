public class Queen extends Piece {

	
	public Queen(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("Queen", side, posX, posY, b);
	}
	
	public String picture() {
		if (side == 0) {
			return "img/white_queen.png";
		} else {
			return "img/black_queen.png";
		}
	}
	
	public boolean move(int desX, int desY) {
		boolean[][] allowMovement = new boolean[8][8];
		//Diagonals
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
		//Horizontal/Vertical
		for (int i = posX; i < 8; i++) {
			if (myBoard[i][posY] != null && myBoard[i][posY].side != side) {
				allowMovement[i][posY] = true;
				break;
			}
			allowMovement[i][posY] = true;
		}
		for (int i = posX; i >= 0; i--) {
			if (myBoard[i][posY] != null && myBoard[i][posY].side != side) {
				allowMovement[i][posY] = true;
				break;
			}
			allowMovement[i][posY] = true;
		}
		for (int i = posY; i < 8; i++) {
			if (myBoard[posX][i] != null && myBoard[posX][i].side != side) {
				allowMovement[posX][i] = true;
				break;
			}
			allowMovement[posX][i] = true;
		}
		for (int i = posY; i >= 0; i--) {
			if (myBoard[posX][i] != null && myBoard[posX][i].side != side) {
				allowMovement[posX][i] = true;
				break;
			}
			allowMovement[posX][i] = true;
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
