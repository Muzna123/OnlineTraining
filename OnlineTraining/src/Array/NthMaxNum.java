package Array;

import java.util.Scanner;

public class NthMaxNum {
	public static int[] sort(int [] ar)
	{
		//comparision
		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j])//swapping
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	public static void nmax(int [] ar,int n)
	{
		ar=sort(ar);
		System.out.println(n +"th max num=");
		System.out.println( ar[ar.length-n]);
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int N=sc.nextInt();//take value of size from user
	int [] L=new int[N];//create an array with size
	for (int i = 0; i <L.length; i++)
	{
		System.out.println("enter the value at "+ i +" index");
		L[i]=sc.nextInt();
	}
	System.out.println("array  elemnts are ");
	for (int i = 0; i < L.length; i++) {
		System.out.println(L[i]);
	}
	System.out.println("enter which max");
	int n=sc.nextInt();
	if(n<=L.length)
	{
	nmax(L,n);
	}
	else
	{
		System.out.println("index not present");
	}
	
}

}
