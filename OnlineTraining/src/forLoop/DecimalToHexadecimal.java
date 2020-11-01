package forLoop;

public class DecimalToHexadecimal {
	public static void convert(int num, int ns) {
		String out="";
		String s1="0123456789ABCDEF";
		while(num>=1) {
			int rem=num%ns;
			out=s1.charAt(rem)+out;
			num=num/ns;
		}
		System.out.println(out);
		
	}
	public static void main(String[] args) {
		convert(44125,16);
		//OR
		int num=44125;
		String out="";
		while(num>=1) {
			int rem=num%16;
			switch(rem) {
			case 10:out="A"+out;
				break;
			case 11:out="B"+out;
			break;
			case 12:out="C"+out;
			break;
			case 13:out="D"+out;
			break;
			case 14:out="E"+out;
			break;
			case 15:out="F"+out;
			break;
			default:out=rem+out;
			}
			num=num/16;
		}
		System.out.println(out);
	}
}
