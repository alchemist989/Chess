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
		
	}
}
