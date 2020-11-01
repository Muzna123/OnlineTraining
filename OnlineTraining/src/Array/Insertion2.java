package Array;

import java.util.Scanner;

public class Insertion2 {
	public static int[] insert(int[] ar, int index, int ele) {
		if (index > ar.length) {
			System.out.println("cannot insert the element");
			return ar;
		}
		int nar[] = new int[ar.length + 1];
		nar[index] = ele;
		for (int i = 0; i < index; i++) {
			nar[i] = ar[i];
		}
		for (int i = index + 1; i < nar.length; i++) {
			nar[i] = ar[i - 1];
		}
		return nar;
	}

	public static int[] delete(int[] ar, int index) {
		if (index >= ar.length) {
			System.out.println("cannot delete the element");
			return ar;
		}
		int[] nar = new int[ar.length - 1];
		for (int i = 0; i < index; i++) {
			nar[i] = ar[i];
		}
		for (int i = index; i < nar.length; i++) {
			nar[i] = ar[i + 1];
		}
		return nar;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int N = sc.nextInt();// take value of size from user
		int[] L = new int[N];// create an array with size
		for (int i = 0; i < L.length; i++) {
			System.out.println("enter the value at " + i + " index");
			L[i] = sc.nextInt();
		}
		System.out.println("array  elemnts are ");
		for (int i:L) {
			System.out.print(i+" ");
		}
		System.out.println("enter the no queries");
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("enter the operation to perform");
			String op = sc.next();
			if (op.equals("insert")) {
				System.out.println("enter the index");
				int x = sc.nextInt();
				System.out.println("enter the element");
				int y = sc.nextInt();
				L = insert(L, x, y);
			} else if (op.equals("delete")) {
				System.out.println("enter the index");
				int x = sc.nextInt();
				L = delete(L, x);
			} else {
				System.out.println("invalid opertion");
			}
		} // end of q loop
		System.out.println("final array ouput");
		for (int i = 0; i < L.length; i++) {
			System.out.print(L[i] + ",");
		}
	}
}
