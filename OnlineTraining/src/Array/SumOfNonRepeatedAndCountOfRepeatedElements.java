package Array;

import java.util.Scanner;

public class SumOfNonRepeatedAndCountOfRepeatedElements {
	public static void sumofNon(int [] ar)
	{
		int sum=0;
		int n=ar.length;
		//loops for comaprision
		for (int i = 0; i <n; i++) {
			int count=0;
			for (int j = i+1; j <n; j++) {
				if(ar[i]==ar[j])//logic for repeated
				{
					count++;
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
			if(count==0)
				sum=sum+ar[i];
		}//end of i loop
		System.out.println("sum ="+sum);
	}
	public static void countRepeated(int [] ar)
	{	
		int n=ar.length;
		//loops for comaprision
		for (int i = 0; i <n; i++) {
			int count=0;
			for (int j = i+1; j <n; j++) {
				if(ar[i]==ar[j])//logic for repeated
				{
					count++;
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
			System.out.println(ar[i]+" is repeated "+count+" times");
		}//end of i loop
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
		/*int nar[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<nar.length;j++) {
				nar[j]=ar[i];
			}
		}*/
		//sumofNon(ar);
		countRepeated(ar);
}	

}
