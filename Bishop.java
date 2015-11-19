
public class Bishop extends Piece {
	
	
	public Bishop(int side, int posX, int posY) {
		creatingPiece("Bishop", side, posX, posY);
	}
	
	
	public String picture() {
		if (side == 0) {
			return "img/white_bishop.png";
		} else {
			return "img/black_bishop.png";
		}
	}
}
