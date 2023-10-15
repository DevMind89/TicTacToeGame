
public class GameBoard {

	public void printGameBoard(char[][] board) {

		for (char[] row : board) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
