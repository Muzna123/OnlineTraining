package forLoop;

public class PrimeNumber {
	public static void primeNumber(int num) {
		int count = 2;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 2 && num >= 2)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");
	}

	public static void main(String[] args) {
		primeNumber(2);

	}
}
