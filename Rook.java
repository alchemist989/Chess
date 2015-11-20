import java.util.HashMap;

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
	public boolean move(int desX, int desY) {
		boolean[][] allowMovement = new boolean[8][8];
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
