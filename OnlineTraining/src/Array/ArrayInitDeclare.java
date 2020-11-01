package Array;

public class ArrayInitDeclare {
	public static void main(String[] args) {
		int id1 = 12;
		int id2 = 41;
		int id3 = 14;
		System.out.println();
		// declaration of an array
		// Datatype [] arrayname;
		int[] ar;
		// memory allocation
		// arryname=new datatype[int size];
		ar = new int[3];
		// initialization of an array
		// arname[index]=value;
		ar[1] = 41;
		ar[0] = 12;
		ar[2] = 14;
		// display
		// for loop
		System.out.println("size=" + ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		// forEach loop
		System.out.println("for each loop output");
		for (int a : ar) {
			System.out.println(a);
		}
		int[] ar2 = { 411, 47, 2, 36, 78, 5 };// single line
		System.out.println("size=" + ar2.length);
		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
		}
		System.out.println("for each loop output");
		for (int i : ar2) {
			System.out.println(i);
		}

	}
}
