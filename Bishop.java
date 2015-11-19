
public class Bishop extends Piece {
	
	
	public Bishop(int side, int posX, int posY, Piece[][] b) {
		creatingPiece("Bishop", side, posX, posY, b);
	}
	
	
	public String picture() {
		if (side == 0) {
			return "img/white_bishop.png";
		} else {
			return "img/black_bishop.png";
		}
	}
	
	public void move(int desX, int desY) {
		
	}
}
