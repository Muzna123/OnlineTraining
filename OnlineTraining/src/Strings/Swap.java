package Strings;

public class Swap {
	public static String swap(String s1) {
		char[] ch = s1.toCharArray();
		String out = "";
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i < ch.length && ch[i] != ' ') {
				res = res + ch[i];
				i++;
			}
			char[] c2 = res.toCharArray();
			c2[0] = (char) (c2[0] - 32);
			c2[c2.length - 1] = (char) (c2[c2.length - 1] - 32);
			/*
			 * char temp=c2[0]; c2[0]=c2[c2.length-1]; c2[c2.length-1]=temp;
			 */
			res = new String(c2);
			out = out + res + " ";
		}
		return out;
	}

	public static void main(String[] args) {
		String s1 = "this is java program";
		String out = swap(s1);
		System.out.println(s1);
		System.out.println(out);
	}
}
