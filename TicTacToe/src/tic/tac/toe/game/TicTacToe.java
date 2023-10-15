package tic.tac.toe.game;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) throws InterruptedException {
		
		char[][] board = { 
				{ ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' } };

		GameBoard gameBoard = new GameBoard();
		ChoosePosition choosePosition = new ChoosePosition();		
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("-----------------");
		System.out.println("Game of TicTacToe");
		System.out.println("-----------------\n");
		gameBoard.printGameBoard(board);	
		
		while(true) {	
			System.out.println();
			choosePosition.position(board, sc, "Human");		
			System.out.println();
			choosePosition.position(board, sc, "CPU");				
		}
	}	
}
