package forLoop;

public class DecimalToOctal {
	public static void decimalToOctal(int num) {
		String out="";
		while(num>=1) {
			int rem=num%8;
			out=rem+out;
			num=num/8;
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		decimalToOctal(138);
	}
}
