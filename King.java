public class King extends Piece {
	
	
	public King(int side, int posX, int posY) {
		creatingPiece("King", side, posX, posY);
	}
	
	
	public String picture() {
		if (side == 0) {
			return "img/white_king.png";
		} else {
			return "img/black_king.png";
		}
	}
	
	public boolean action(int desX, int desY) {
		return false;
	}
}
