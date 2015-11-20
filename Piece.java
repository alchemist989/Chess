
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
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			return false;
		}
		return true;
	}
	
	public void movingCapturing(int desX, int desY, Piece selected) {
		myBoard[desX][desY] = selected;
		myBoard[posX][posY] = null;
		selected.posX = desX;
		selected.posY = desY;
	}
	
	public abstract String picture();
	//true if the piece is clicked, false if the piece is move
	public abstract boolean move(int desX, int desY);
	
	
	
	public class Pair {
		int x;
		int y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}

