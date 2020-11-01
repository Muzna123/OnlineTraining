package Strings;

public class Replace {
	public static String replace(String s1, String s2, String s3) {
		char ch[] = s1.toCharArray();
		String out = "";
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i < ch.length && ch[i] != ' ') {
				res = res + ch[i];
				i++;
			}
			if (res.equals(s2))
				out = out + s3 + " ";
			else if (res.equals(s3))
				out = out + s2 + " ";
			else
				out = out + res + " ";
		}
		return out;
	}

	public static void main(String[] args) {
		String s1 = "amit works in accolite and accolite is good";
		String s2 = "works";
		String s3 = "accolite";
		String out = replace(s1, s2, s3);
		System.out.println("s1=" + s1);
		System.out.println("out=" + out);
	}
}
