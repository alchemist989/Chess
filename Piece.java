
public abstract class Piece {
	String name;
	int side;
	int posX;
	int posY;
	
	public void creatingPiece(String name, int side, int posX, int posY) {
		this.name = name;
		this.side = side;
		this.posX = posX;
		this.posY = posY;
	}
}

