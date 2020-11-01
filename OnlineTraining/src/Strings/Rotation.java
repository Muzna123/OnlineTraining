package Strings;

public class Rotation {
	public static String rotate(String s1, int times) {
		char[] c1 = s1.toCharArray();
		for (int j = 0; j < times; j++) {
			char temp = c1[c1.length - 1];
			for (int i = c1.length - 1; i >= 1; i--) {
				c1[i] = c1[i - 1];
			}
			c1[0] = temp;
		}
		return new String(c1);
	}

	public static void main(String[] args) {
		String s1 = "programing";
		System.out.println("input=" + s1);
		String res = rotate(s1, 5);
		System.out.println("input after rotation  " + res);

	}
}
