package forLoop;

import java.util.Scanner;

public class TriangleBlocks {
	public static void main(String[] args) {

		int noOfblocks = 0;
		System.out.println("Enter the number of rows");
		Scanner scan=new Scanner(System.in);
		int noOfRows=scan.nextInt();
		for (int i = 1; i <= noOfRows; i++) {
			noOfblocks = noOfblocks + i;
		}
		System.out.println("No of blocks:  "+noOfblocks);
	}

}
