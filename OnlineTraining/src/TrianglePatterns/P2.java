package TrianglePatterns;

public class P2 {
	public static void main(String[] args) {
		int n=3;
		char count1='A';
		int count2=1;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; (col+rows)<=n-1; col++) {
				System.out.print(count1++ +""+ count2++ + " ");
			}
			System.out.println();
		}
	}
}
