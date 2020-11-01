package TrianglePatterns;

public class MultiplesOf3AndStarTriangle {
	public static void main(String[] args) {
		int n=4;
		int a=0;
		int count=3;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; col <=rows; col++) {
				if(a%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(count+" ");
					count=count+6;
				}
				a++;
			}
			System.out.println();
		}
	}
}
