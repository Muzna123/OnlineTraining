package forLoop;

public class DecimalToBinary {
	public static void decimalToBinary(int num) {
		String out="";
		while(num>0) {
			int rem=num%2;
			out=rem+out;
			num=num/2;
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		decimalToBinary(25);
	}

}

