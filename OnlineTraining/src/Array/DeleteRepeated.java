package Array;

import java.util.Scanner;

public class DeleteRepeated {
	public static int[] deleteRepeated(int [] ar)
	{
		int n=ar.length;
		//loops for comparision
		for (int i = 0; i <n; i++) {
			for (int j = i+1; j <n; j++) {
				if(ar[i]==ar[j])//logic for repeated
				{
				//logic for delete
					int k=j;
					while(k<n-1)//shifting logic
					{
						ar[k]=ar[k+1];//shift the next element
						k++;
					}//end of while loop
					n--;//ignore last shifted character
					j--;//compare the same shifted character
				}//end of if 
			}//end of j loop
		}//end of i loop
		int nar[]=new int[n];
		for (int i = 0; i < nar.length; i++) {
			nar[i]=ar[i];
		}
		return nar;
	}//end of method
	public static String deleteRepeated2(String s1)
	{
		char [] ar=s1.toCharArray();
		int n=ar.length;
		//loops for comaprision
		for (int i = 0; i <n; i++) {
			for (int j = i+1; j <n; j++) {
				if(ar[i]==ar[j])//logic for repeated
				{
				//logic for delete
					int k=j;
					while(k<n-1)//shifting logic
					{
						ar[k]=ar[k+1];//shift the next element
						k++;
					}//end of while loop
					n--;//ignore last shifted character
					j--;//compare the same shifted character
				}//end of if 
			}//end of j loop
		}//end of i loop
		String out="";
		for (int i = 0; i <n; i++) 
		{
			out=out+ar[i];
		}
		return out;
	}//end of method
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
		System.out.println("array  elements are");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		int nar[]=deleteRepeated(ar);
		System.out.println("array  elements after modification");
		for (int i = 0; i < nar.length; i++) {
			System.out.println(nar[i]);
		}
		System.out.println("enter a string");
		String s1=sc.next();
		String out=deleteRepeated2(s1);
		System.out.println(out);
		
}

}
