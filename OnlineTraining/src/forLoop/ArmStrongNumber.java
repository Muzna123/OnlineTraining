package forLoop;

public class ArmStrongNumber {
	public static int countOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
   public static int power(int num, int pwr) {
		int out = 1;
		for (int i = 1; i <= pwr; i++)
			out = out * num;
		return out;
	}
   public static boolean isArmStrong(int num) {
		int sum = 0;
		int temp=num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + power(rem, countOfDigits(temp));
            num=num/10;
		}
		return(sum==temp);
	}
    public static void main(String[] args) {
		int num = 153;
		boolean res=isArmStrong(num);
		if(res==true)
			System.out.println(num+" is ArmStrong Number");
		else
		     System.out.println(num+" is not ArmStrong Number");

	}

}
