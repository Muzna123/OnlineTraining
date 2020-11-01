package TrianglePatterns;

public class DifferentTrianglePatterns {
	public static void triangle1() {
		int n = 5;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; rows >= col; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void triangle2() {
		int n = 5;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; (rows + col) <= n - 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void triangle3() {
		int n = 5;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if (rows <= col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void triangle4() {
		int n = 5;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if ((rows + col) >= n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		triangle1();
		System.out.println();
		triangle2();
		System.out.println();
		triangle3();
		System.out.println();
		triangle4();
		System.out.println();
	
	}

}
