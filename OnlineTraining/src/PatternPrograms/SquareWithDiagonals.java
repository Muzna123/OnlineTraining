package PatternPrograms;

public class SquareWithDiagonals {
	public static void main(String[] args) {
		int n = 7;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if (col == rows || (rows + col) == n - 1 || rows == 0 || rows == n - 1 || col == 0 || col == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
