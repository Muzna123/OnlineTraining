package Array;

public class PrintArray {
	public static void printArray(Object[] ar)
	{
		for (int i = 0; i <ar.length ; i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) 
	{
		Integer[] ref1= {1,2,3};
		String [] ref2= {"Hello","world"};
		printArray(ref1);
		printArray(ref2);
	}
}
