package Array;

import java.util.Scanner;

public class Palandrome {
	public static boolean isPalindrome(int [] ar)
	{
		int []rev=ReverseArray.reverse(ar);	
		for (int i = 0; i < rev.length; i++) 
		{
			if(ar[i]!=rev[i])
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome2(int [] ar)
	{	
		for (int i = 0,j=ar.length-1; i < ar.length/2; i++,j--) 
		{
			if(ar[i]!=ar[j])
			{
				return false;
			}
		}
		return true;
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
		System.out.println("the array elements are ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		boolean res=isPalindrome2(ar);
		System.out.println();
		if(res)
		{
			System.out.println("array elements are palindrome");
		}
		else
		{
			System.out.println("array elements are not palindrome");
		}
	}

}
