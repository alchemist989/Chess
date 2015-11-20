public class Pawn extends Piece {
	
	boolean pawnMoved;
	
	
	
	public Pawn(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("Pawn", side, posX, posY, b);
	}
	
	
	public String picture() {
		if (side == 0) {
			return "img/white_pawn.png";
		} else {
			return "img/black_pawn.png";
		}
	}
	public boolean capture(int desX, int desY) {
		//White Capture
		if (side == 0) {
			int upperRightX = posX + 1;
			int upperRightY = posY + 1;
			int upperLeftX = posX - 1;
			int upperLeftY = posY + 1;
			if (checkBounds(upperRightX, upperRightY)) {
				if (desX == upperRightX && desY == upperRightY) {
					movingCapturing(desX, desY, myBoard[posX][posY]);
					return true;
				}
			System.out.println(checkBounds(upperLeftX, upperLeftY));
			} if (checkBounds(upperLeftX, upperLeftY)) {
				if (desX == upperLeftX && desY == upperLeftY) {
					System.out.print("capturing#2");
					movingCapturing(desX, desY, myBoard[posX][posY]);
					return true;
				}
			}
		}
		//Black Capture
		else if (side == 1) {
			int lowerRightX = posX + 1;
			int lowerRightY = posY - 1;
			int lowerLeftX = posX - 1;
			int lowerLeftY = posY - 1;
			if (checkBounds(lowerRightX, lowerRightY)) {
				if (desX == lowerRightX && desY == lowerRightY) {
					movingCapturing(desX, desY, myBoard[posX][posY]);
					return true;
				}
			} if (checkBounds(lowerLeftX, lowerLeftY)) {
				if (desX == lowerLeftX && desY == lowerLeftY) {
					movingCapturing(desX, desY, myBoard[posX][posY]);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean move(int desX, int desY) {
		if (myBoard[desX][desY] == null) {
			if (side == 0) {
				int frontX = posX;
				int frontY = posY + 1;
				int doubleFrontX = posX;
				int doubleFrontY = posY + 2;
				if (checkBounds(frontX, frontY)) {
					if (desX == frontX && desY == frontY) {
						if (myBoard[desX][frontY] == null) {
							pawnMoved = true;
							movingCapturing(desX, desY, myBoard[posX][posY]);
							return true;
						}
					}
				} if (checkBounds(doubleFrontX, doubleFrontY)) {
					if (desX == doubleFrontX && desY == doubleFrontY && !pawnMoved) {
						if (myBoard[desX][frontY] == null && myBoard[desX][doubleFrontY] == null) {
							pawnMoved = true;
							movingCapturing(desX, desY, myBoard[posX][posY]);
							return true;
						}
					}
				}
			} else if (side == 1) {
				int frontX = posX;
				int frontY = posY - 1;
				int doubleFrontX = posX;
				int doubleFrontY = posY - 2;
				if (checkBounds(frontX, frontY)) {
					if (desX == frontX && desY == frontY) {
						if (myBoard[desX][frontY] == null) {
							pawnMoved = true;
							movingCapturing(desX, desY, myBoard[posX][posY]);
							return true;
						}
					}
				} if (checkBounds(doubleFrontX, doubleFrontY)) {
					if (desX == doubleFrontX && desY == doubleFrontY && !pawnMoved) {
						if (myBoard[desX][frontY] == null && myBoard[desX][doubleFrontY] == null) {
							pawnMoved = true;
							movingCapturing(desX, desY, myBoard[posX][posY]);
							return true;
						}
					}
				}
			}
		//Capture
		} else if (myBoard[desX][desY].side != side) {
			return capture(desX, desY);
		}
		return false;
	}
}
