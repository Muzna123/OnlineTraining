package PatternPrograms;

public class PartialiyEmptySquare {
	public static void main(String[] args) {
		for (int rows = 0; rows < 5; rows++) {
			for (int col = 0; col < 5; col++) {
				if (rows == 0 || rows == 2 || rows == 4 || col == 0 || col == 2 || col == 4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
