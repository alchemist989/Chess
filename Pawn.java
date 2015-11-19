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
	
	public boolean action(int desX, int desY) {
		//clicking the piece
		if (!choosen) {
			choosen = true;
			return true;
		//moving the piece (requires being first clicked)
		} else {
			return false;
		}
	}
}
