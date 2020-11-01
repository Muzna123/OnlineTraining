package Array;

public class Program42 {
	public static void main(String[] args) {
		int a = 14;// normal variable decleartion
		// declearation of an array
		int[] ar;
		// memory allocation
		ar = new int[3];
		ar[0] = 12;
		ar[1] = 14;
		ar[2] = 52;
		// System.out.println("size="+ar.length);

		// 2D Array
		// initialize 2D array
		// datatype [][] name;
		int[][] ar2;
		// memoryallocation
		// name=new datatype[size1][size2];
		ar2 = new int[3][2];
		ar2[0][1] = 15;
		ar2[2][0] = 4;
		int[][] st = new int[2][4];
		st[1][3] = 1456;
		System.out.println("size of outer array=" + st.length);
		System.out.println("size of first inner array=" + st[0].length);
		System.out.println("size of second inner array=" + st[1].length);

		for (int i = 0; i < st.length; i++) {
			for (int j = 0; j < st[i].length; j++) {
				System.out.println("i=" + i);
				System.out.println("j=" + j);
				System.out.println(st[i][j]);
			}
		}

	}
}
