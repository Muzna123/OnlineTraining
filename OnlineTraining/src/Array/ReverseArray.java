package Array;

import java.util.Scanner;

public class ReverseArray {
	public static int[] reverse (int [] ar)
	{
		int [] ar2=new int[ar.length];
		int j=0;
		for (int i = ar.length-1; i>=0; i--)
		{
			ar2[j++]=ar[i];
		}
		return ar2;		
	}
	public static int[] reverse2 (int [] ar)
	{
	for (int i = 0,j=ar.length-1; i < ar.length/2; i++,j--) 
	{
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;	
	}	
	return ar;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=sc.nextInt();//take value of size from user
	int [] ar=new int[size];//create an array with size
	for (int i = 0; i < ar.length; i++)
	{
		System.out.println("enter the value at "+ i +" index");
		ar[i]=sc.nextInt();
	}
	System.out.println("array before reverse");
	for (int i:ar) {
		System.out.print(i+" ");
	}
	int [] ar2=reverse2(ar);
	System.out.println();
	System.out.println("array after reverse");
	for (int i:ar2) {
		System.out.print(i+" ");
	}
	
}
}
