package TrianglePatterns;

public class P3 {
	public static void Pyramid()
	{
		int n=7;
		//loop to decide no of rows
		for (int rows = 0; rows <n; rows++) {
			//loop to decide no of spaces 
			for(int space=0;space<n-1-rows;space++)
			{
				System.out.print("  ");
			}
			//loop to decide no of stars
			for (int stars = 0; (2*rows)>=stars; stars++) {
				if(stars==0 ||stars==2*rows)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void inversePyramid()
	{
		int n=7;
		//loop to decide no of rows
		for (int rows = n-2; rows >=0; rows--) {
			//loop to decide no of spaces 
			for(int space=0;space<n-1-rows;space++)
			{
				System.out.print("  ");
			}
			//loop to decide no of stars
			for (int stars = 0; (2*rows)>=stars; stars++) {
				if(stars==0 ||stars==2*rows)
					System.out.print("* ");
					else
						System.out.print("  ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Pyramid();
	inversePyramid();
}
}
