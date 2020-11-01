package TrianglePatterns;

public class UpperCaseLowerCaseAlphabetTriangle {
	public static void main(String[] args) {
		int n = 4;
		// int count=1;
		char count = 'A';
		char count2 = 'a';
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col <= rows; col++) {
				System.out.print(count++ + "" + count2++ + " ");
			}
			System.out.println();
		}
	}

}
