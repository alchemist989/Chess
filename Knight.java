
public class Knight extends Piece {
	
	public Knight(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("Knight", side, posX, posY, b);
	}
	
	public String picture() {
		if (side == 0) {
			return "img/white_knight.png";
		} else {
			return "img/black_knight.png";
		}
	}
	public boolean move(int desX, int desY) {
		int knJump1X = posX - 1;
		int knJump1Y = posY - 2;
		int knJump2X = posX + 1;
		int knJump2Y = posY - 2;
		int knJump3X = posX - 2;
		int knJump3Y = posY - 1;
		int knJump4X = posX + 2;
		int knJump4Y = posY - 1;
		int knJump5X = posX - 2;
		int knJump5Y = posY + 1;
		int knJump6X = posX + 2;
		int knJump6Y = posY + 1;
		int knJump7X = posX - 1;
		int knJump7Y = posY + 2;
		int knJump8X = posX + 1;
		int knJump8Y = posY + 2;
		
		//Case1
		if (checkBounds(knJump1X, knJump1Y)) {
			if (desX == knJump1X && desY == knJump1Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		//Case2
		if (checkBounds(knJump2X, knJump2Y)) {
			if (desX == knJump2X && desY == knJump2Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		//Case3
		if (checkBounds(knJump3X, knJump3Y)) {
			if (desX == knJump3X && desY == knJump3Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		//Case4
		if (checkBounds(knJump4X, knJump4Y)) {
			if (desX == knJump4X && desY == knJump4Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		//Case5
		if (checkBounds(knJump5X, knJump5Y)) {
			if (desX == knJump5X && desY == knJump5Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		//Case6
		if (checkBounds(knJump6X, knJump6Y)) {
			if (desX == knJump6X && desY == knJump6Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		//Case7
		if (checkBounds(knJump7X, knJump7Y)) {
			if (desX == knJump7X && desY == knJump7Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);
				return true;
			}
		}
		//Case8
		if (checkBounds(knJump8X, knJump8Y)) {
			if (desX == knJump8X && desY == knJump8Y) {
				movingCapturing(desX, desY, myBoard[posX][posY]);return true;
				
			}
		}
		return false;
	}
}
