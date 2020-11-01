package forLoop;

public class Consecutive8 {
	public static void main(String[] args) {
        int count = 0;
		int num = 881888178;
		while (num > 0) {
			int rem = num % 10;
			if (rem == 8) {
				count++;
				if(((num/10)%10)==8)
					count++;	
			}
			num = num / 10;
		
		}
		System.out.println("No of occurance of 8 =" + count);
	}
}
