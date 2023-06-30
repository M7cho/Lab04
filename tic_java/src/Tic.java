public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return false;
		}
	
		final Tic equalsboard = (Tic) obj;
	
		if (equalsboard.rows != this.rows || equalsboard.cols != this.cols) {
			return false;
		}
	
		for (int i=0; i < this.rows; i++) {
			for (int j=0; j < this.cols; j++) {
				if(this.board[i][j] != equalsboard.board[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	public void playX(int row, int col) {
		if (row > this.rows || col > this.cols) {
			return;
		}
		this.board[row][col] = "X";
	}

} 