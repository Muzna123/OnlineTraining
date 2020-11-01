package TrianglePatterns;

public class BinaryTriangle {
	public static void main(String[] args) {
		int n=5;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; col <=rows; col++) {
				if((rows+col)%2==0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
