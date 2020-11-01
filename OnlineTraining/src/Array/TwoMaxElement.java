package Array;

import java.util.Scanner;

public class TwoMaxElement {
	public static void twoMax(int [] ar)
	{
		int max1=ar[0];
		int index1=0;
		int max2=ar[1];	
		int index2=1;
		for (int i = 1; i < ar.length; i++) {
			if(max1<ar[i])
			{
				max2=max1;
				index2=index1;
				max1=ar[i];
				index1=i;
				
			}
			else if(max2<ar[i])
			{
				max2=ar[i];
				index2=i;
			}
		}
		System.out.println
		("first maximum element is="+max1+"at index "+index1);
		System.out.println
		("second maximum element is="+max2+"at index "+index2);
	}
	public static void max(int [] ar)
	{
		int max=ar[0];
		int index=0;
		for (int i = 1; i < ar.length; i++) {
			if(max<ar[i])
			{
				max=ar[i];
				index=i;
			}
		}
		System.out.println
		("maximum element is="+max+" is present at "+index);
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
	//max(ar);
	twoMax(ar);
	
}

}
