package Strings;

public class ReverseAlternateWords {
	public static String alternaterev(String s1) {
		char[] ch = s1.toCharArray();
		String out = "";
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i < ch.length && ch[i] != ' ') {
				if (count % 2 != 0) {
					res = res + ch[i];
				} else {
					res = ch[i] + res;
				}
				i++;
			}
			out = out + res + " ";
			count++;
		}
		return out;
	}

	public static void main(String[] args) {
		String res = alternaterev("this is a String");
		System.out.println(res);
	}
}
