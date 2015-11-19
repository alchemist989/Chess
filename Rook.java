
public class Rook extends Piece {
	
	public Rook(int side, int posX, int posY) {
		creatingPiece("Rook", side, posX, posY);
	}
	
	public String picture() {
		if (side == 0) {
			return "img/white_rook.png";
		} else {
			return "img/black_rook.png";
		}
	}
}
