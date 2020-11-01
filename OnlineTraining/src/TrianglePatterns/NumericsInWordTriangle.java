package TrianglePatterns;

public class NumericsInWordTriangle {
	 static  String[]ar= {"one","two","three","four","five","six",
				"seven","eight","nine","ten"};
	public static void main(String[] args) {
		int n=4;
		int a=0;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col <=rows; col++) {
				System.out.print(ar[a++]+"  ");
			}
			System.out.println();
		}
	}
}
