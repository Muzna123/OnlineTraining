package Array;

import java.util.Scanner;

public class BiggestConsecutiveSum {
	public static void bigConsecutive(int [] ar)
	{
		int bigsum=ar[0]+ar[1];
		int index=0;
		for (int i = 1; i < ar.length-1; i++) {
			if(bigsum<(ar[i]+ar[i+1]))
			{
				bigsum=ar[i]+ar[i+1];
				index=i;
			}//end of if
		}//end of for loop
			System.out.println("biggest consecutive sum="+bigsum);
			System.out.println
			("it is present in between "+index+" and "+(index+1) );	
	}	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();//take value of size from user
		int [] ar=new int[size];//create an array with size
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println("enter the value at "+ i +" index");
			ar[i]=sc.nextInt();
		}
		bigConsecutive(ar);
	}

}
