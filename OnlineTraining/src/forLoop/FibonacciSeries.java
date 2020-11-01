package forLoop;

public class FibonacciSeries {
	public static void fibonacciSeries(int a,int b,int count) {
		
	      while(count>0){
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
			count--;
		}
	}
	public static void main(String[] args) {
		fibonacciSeries(0,1,10);
	}

}
