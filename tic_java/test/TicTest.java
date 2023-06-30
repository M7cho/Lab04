
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void testEquals() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
	}
}
	@Test
	void testPlayX() {
		Tic board = new Tic(3, 3);
		board.playX(1,1);
		assertEquals(board.board[1][1], "X");
	} 
	