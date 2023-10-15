package tic.tac.toe.game;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ChoosePosition {

	private ArrayList<Integer> humanPositions = new ArrayList<Integer>();
	private ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

	public void position(char[][] board, Scanner sc, String user) throws InterruptedException {

		GameBoard gameBoard = new GameBoard();
		CheckWinner checkWinner = new CheckWinner();

		int position = 0;
		char symbol = ' ';

		if (user.equals("Human")) {
			System.out.print("Human: ");
			position = sc.nextInt();
			symbol = 'X';
			while (humanPositions.contains(position) || cpuPositions.contains(position)) {
				System.out.println("Position taken! Choose another place, Human: ");
				position = sc.nextInt();
			}
			humanPositions.add(position);
			System.out.println();
		} else {
			System.out.println("CPU");
			Random rand = new Random();
			position = rand.nextInt(9) + 1;
			symbol = 'O';
			while (cpuPositions.contains(position) || humanPositions.contains(position)) {
				position = rand.nextInt(9) + 1;
			}
			cpuPositions.add(position);
			System.out.println();
			int thinking = rand.nextInt(1000) + 1000;
			Thread.sleep(thinking);
		}

		switch (position) {
		case 1:
			board[0][0] = symbol;
			break;
		case 2:
			board[0][2] = symbol;
			break;
		case 3:
			board[0][4] = symbol;
			break;
		case 4:
			board[2][0] = symbol;
			break;
		case 5:
			board[2][2] = symbol;
			break;
		case 6:
			board[2][4] = symbol;
			break;
		case 7:
			board[4][0] = symbol;
			break;
		case 8:
			board[4][2] = symbol;
			break;
		case 9:
			board[4][4] = symbol;
			break;
		default:
			break;
		}
		gameBoard.printGameBoard(board);
		checkWinner.checkWinner(humanPositions, cpuPositions);
	}
}
