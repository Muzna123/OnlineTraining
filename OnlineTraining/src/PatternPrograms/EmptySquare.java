package PatternPrograms;

public class EmptySquare {
	public static void main(String[] args) {
		for (int rows = 0; rows < 4; rows++) {
			for (int col = 0; col < 4; col++) {
				if (rows == 0 || rows == 3 || col == 0 || col == 3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
