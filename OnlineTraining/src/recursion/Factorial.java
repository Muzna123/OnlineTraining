package recursion;

public class Factorial {
	public static int fact(int n)
	{
		if(n>1) 
		return n*fact(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		int res=fact(4);
		System.out.println("Fact: "+res);
	}

}
