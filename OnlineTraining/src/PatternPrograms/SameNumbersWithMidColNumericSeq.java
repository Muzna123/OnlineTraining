package PatternPrograms;

public class SameNumbersWithMidColNumericSeq {
	public static void main(String[] args) {
		int n = 4;
		int temp = n;
		if (n % 2 == 0)
			temp = n + 1;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < temp; col++) {
				if (col == temp / 2) {
					System.out.print(rows + 1 + " ");
				} else {
					System.out.print(n + " ");
				}
			}
			System.out.println();
		}
	}
}
