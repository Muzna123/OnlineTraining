package TrianglePatterns;

public class P1 {
	public static void main(String[] args) {
		int n=4;
		int count=1;
		int count2=1;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; col <=rows; col++) {
				if(rows%2==0)
				{
				System.out.print(count++ +" ");
				count2--;
				}
				else
				{
				System.out.print(count2-- +" ");
				count++;
				}
			}
			count2=count2+(2*rows)+3;
			System.out.println();
		}
	}
}
