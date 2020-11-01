package forLoop;

public class SumOFDigits {
public static void main(String[] args) {
	int n=189;
	int sum=0;
	while(n>0) {
		int rem=n%10;//extract last digit
		sum=sum+rem;//store last digit in result var sum
		n=n/10;//eliminate last digit
		
	}//stop loop when num==0
	System.out.println("sum:  "+ sum);
}
}
