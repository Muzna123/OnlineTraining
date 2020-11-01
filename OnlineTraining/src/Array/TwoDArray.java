package Array;

public class TwoDArray {
	public static void main(String[] args) {
		int [] ar= {1,2,3,5};
		//
		int[][] nar= {{12,14,13},{1,2,45},{15,36,21}};
		System.out.println("size of outer array="+nar.length);
		System.out.println("size of first inner array="+nar[0].length);
		System.out.println("size of second inner array="+nar[1].length);
		System.out.println("size of Third inner array="+nar[2].length);
		
		for (int i = 0; i < nar.length; i++) {
			for (int j = 0; j < nar[i].length; j++) {
				System.out.print(nar[i][j]+"("+i+","+j+")"+" ");
			}
			System.out.println();
		}
		
		int [][] narr=new int[5][3];
		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr[i].length; j++) {
				System.out.print(narr[i][j]+"("+i+","+j+")"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
