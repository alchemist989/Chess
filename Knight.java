
public class Knight extends Piece {
	
	public Knight(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("Knight", side, posX, posY, b);
	}
	
	public String picture() {
		if (side == 0) {
			return "img/white_knight.png";
		} else {
			return "img/black_knight.png";
		}
	}
	public void move(int desX, int desY) {
		
	}
}
