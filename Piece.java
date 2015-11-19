
public abstract class Piece {
	String name;
	int side;
	int posX;
	int posY;
	Piece[][] myBoard;
	
	public void creatingPiece(String name, int side, int posX, int posY, Piece[][] myBoard) {
		this.name = name;
		this.side = side;
		this.posX = posX;
		this.posY = posY;
		this.myBoard = myBoard;
	}
	
	public boolean checkBounds(int x, int y) {
		System.out.println(x);
		System.out.println(y);
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			System.out.println("don't go in");
			return false;
		}
		System.out.println("go in");
		return true;
	}
	
	
	
	public abstract String picture();
	//true if the piece is clicked, false if the piece is move
	public abstract void move(int desX, int desY);
}

