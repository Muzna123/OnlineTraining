package PatternPrograms;

public class NumericAndStar {
	public static void main(String[] args) {

		int n = 7;
		int count = 1;
		int temp = 2;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				System.out.print(count++ + " ");
				if (col < n - 1)
					System.out.print("* ");
			}
			if (rows < n / 2)
				count = count + n;
			else
				count = count - ((temp++) * n);
			System.out.println();
		}
	}
}
