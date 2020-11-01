package TrianglePatterns;

public class NumericTriangle {
	public static void main(String[] args) {
		int n=6;
		int count=1;
		for (int i = 0; i < n; i++) {
			count=i+1;
			for (int j = 0; j <=i; j++) {
				System.out.print(count+ " ");
				count=count+(n-1)-j;
			}
			System.out.println();
		}
	}
}
