
public class Knight extends Piece {
	
	public Knight(int side, int posX, int posY) {
		creatingPiece("Knight", side, posX, posY);
	}
	
	public String picture() {
		if (side == 0) {
			return "img/white_knight.png";
		} else {
			return "img/black_knight.png";
		}
	}
}
