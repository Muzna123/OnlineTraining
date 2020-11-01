package TrianglePatterns;

public class ReverseNumericTriangle {
	public static void main(String[] args) {
		int n=5;
		int count=1;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; col <=rows; col++) {
				System.out.print(count-- +" ");
			}
			count=count+(2*rows)+3;
			System.out.println();
		}
	}
}
