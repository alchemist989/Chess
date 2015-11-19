public class Pawn extends Piece {
	
	public Pawn(int side, int posX, int posY) {
		creatingPiece("Pawn", side, posX, posY);
	}
	
	
	public String picture() {
		if (side == 0) {
			return "img/white_pawn.png";
		} else {
			return "img/black_pawn.png";
		}
	}
}
