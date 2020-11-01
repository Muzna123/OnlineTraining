package forLoop;

public class StrongNumber {

	public static int isFact(int num) {
		int out = 1;
		for (int i = num; i > 1; i--)
			out = out * i;
		return out;
	}

	public static boolean isStrong(int num) {
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + isFact(rem);
			num = num / 10;
		}
		return (sum == temp);
	}

	public static void rangeOfStrong(int max) {
		for (int i = 1; i <= max; i++) {
			boolean strong = isStrong(i);
			if (strong == true)
				System.out.print(i + " ");
		}
		System.out.println();

	}


	public static void sumOfRange(int maxCount) {
		int counter=1;
		int sum=0;
		for(int i=1;counter<=maxCount;i++) {
			boolean res=isStrong(i);
			if(res==true) {
				counter++;
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int num=145;
		boolean res=isStrong(num);
		if(res==true)
			System.out.println(num+" is a strong number");
		else
			System.out.println(num+" is a not strong number");
		
		System.out.println("Range of Strong numbers");
		rangeOfStrong(50000);
		System.out.println("Sum");
		sumOfRange(3);
		
	}
}
