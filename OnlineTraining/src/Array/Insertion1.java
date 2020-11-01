package Array;

import java.util.Scanner;

public class Insertion1 {
	public static int[] insert(int[] ar, int index, int ele) {
		if(index>ar.length) {
			System.out.println("cannot insert element");
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
	public static void delete(int ar[],int index) {
		if(index>=ar.length)
			System.out.println("cannot perform delete operation");
		int []nar=new int[ar.length-1];
		for(int i=0;i<index;i++)
			nar[i]=ar[i];
		for(int i=index;i<nar.length;i++)
		    nar[i]=ar[i+1];
		for(int i:nar)
			System.out.print(i+" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();// take value of size from user
		int[] ar = new int[size];// create an array with size
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value at " + i + " index");
			ar[i] = sc.nextInt();
		}
		System.out.println("array  elemnts are ");
		for (int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println("Enter the number of queries");
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
            System.out.println("Enter the operation");
			String op = sc.next();
			if(op.equals("insert")) {
				System.out.println("enter the index");
				int x=sc.nextInt();
				System.out.println("enter the element");
				int y=sc.nextInt();
				int []nar=insert(ar,x,y);
			System.out.println("array  elements after modifing ");
			for (int j:nar) 
				System.out.println(j);
			}
			else if(op.equals("delete")) {
				System.out.println("enter the index");
				int x=sc.nextInt();
				delete(ar,x);
				
			}
			else
				System.out.println("Invalid Operation");
		}
	}
}
