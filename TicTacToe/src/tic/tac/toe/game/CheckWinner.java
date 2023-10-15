package tic.tac.toe.game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckWinner {

	public void checkWinner(ArrayList<Integer> humanPositions, ArrayList<Integer> cpuPositions) {

		List<Integer> topRow = Arrays.asList(1, 2, 3);
		List<Integer> middleRow = Arrays.asList(4, 5, 6);
		List<Integer> bottomRow = Arrays.asList(7, 8, 9);

		List<Integer> leftCol = Arrays.asList(1, 4, 7);
		List<Integer> middleCol = Arrays.asList(2, 5, 8);
		List<Integer> rightCol = Arrays.asList(3, 6, 9);

		List<Integer> cross1 = Arrays.asList(1, 5, 9);
		List<Integer> cross2 = Arrays.asList(3, 5, 7);

		List<List<Integer>> winning = new ArrayList<List<Integer>>();

		winning.add(topRow);
		winning.add(middleRow);
		winning.add(bottomRow);

		winning.add(leftCol);
		winning.add(middleCol);
		winning.add(rightCol);

		winning.add(cross1);
		winning.add(cross2);

		for (List<Integer> positions : winning) {
			if (humanPositions.containsAll(positions)) {
				System.out.println("\nHuman won!");
				System.exit(0);
			} else if (cpuPositions.containsAll(positions)) {
				System.out.println("\nCPU wins!");
				System.exit(0);
			} else if (humanPositions.size() + cpuPositions.size() == 9) {
				System.out.println("\nBoard full... Draw!");
				System.exit(0);
			}
		}
	}
}