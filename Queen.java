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
	
	public void move(int desX, int desY) {
		
	}
}
