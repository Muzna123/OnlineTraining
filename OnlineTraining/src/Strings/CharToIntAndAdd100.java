package Strings;

public class CharToIntAndAdd100 {
	public static int sumOf(String s1) {
		char[] ch = s1.toCharArray();
		int out = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				out = out * 10 + (ch[i]-48);
			}
			
		}
		return out + 100;
	}

	public static void main(String[] args) {
		int a = sumOf("karnataka@123");
		System.out.println(a);

	}
}
