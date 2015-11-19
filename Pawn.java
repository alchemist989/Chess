public class Pawn extends Piece {
	
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
	public void capture(int desX, int desY) {
		int upperRightX = posX + 1;
		int upperRightY = posY + 1;
		int upperLeftX = posX - 1;
		int upperLeftY = posY + 1;
		System.out.println("POSITIONS");
		if (checkBounds(upperRightX, upperRightY)) {
			if (desX == upperRightX && desY == upperRightY) {
				//Move Piece
				myBoard[desX][desY] = myBoard[posX][posY];
				myBoard[posX][posY] = null;
			}
		System.out.println(checkBounds(upperLeftX, upperLeftY));
		} if (checkBounds(upperLeftX, upperLeftY)) {
			System.out.println("Checked");
			if (desX == upperLeftX && desY == upperLeftY) {
				//Move Piece
				System.out.print("upperLeft");
				myBoard[desX][desY] = myBoard[posX][posY];
				myBoard[posX][posY] = null;
			}
		}
	}
	public void move(int desX, int desY) {
		//Capture
		if (myBoard[desX][desY].side != side) {
			capture(desX, desY);
		}
		//Moving
		
//		int upperRightX = posX + 1;
//		int upperRightY = posY + 1;
//		int upperLeftX = posX - 1;
//		int upperLeftY = posY + 1;
//		System.out.println("POSITIONS");
//		if (checkBounds(upperRightX, upperRightY)) {
//			if (desX == upperRightX && desY == upperRightY) {
//				//Move Piece
//				myBoard[desX][desY] = myBoard[posX][posY];
//				myBoard[posX][posY] = null;
//			}
//		System.out.println(checkBounds(upperLeftX, upperLeftY));
//		} if (checkBounds(upperLeftX, upperLeftY)) {
//			System.out.println("Checked");
//			if (desX == upperLeftX && desY == upperLeftY) {
//				//Move Piece
//				System.out.print("upperLeft");
//				myBoard[desX][desY] = myBoard[posX][posY];
//				myBoard[posX][posY] = null;
//			}
//		}
//	}
	}
}
