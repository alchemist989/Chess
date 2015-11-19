
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
	
	public void move(int desX, int desY) {
		
	}
}
