package Strings;

public class PercentageOfUpperCaseLowerCaseNumericsSpecialChars {
	public static void main(String[] args) {
		String s1 = "KARnataka@234^";
		double up = 0, lc = 0, sp = 0, nc = 0;
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				up++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				lc++;
			} else if (ch[i] >= '0' && ch[i] <= '9') {
				nc++;
			} else {
				sp++;
			}
		}
		double upper = (up / s1.length()) * 100;
		System.out.println(upper);
		double lower = (lc / s1.length()) * 100;
		System.out.println(lower);
		double numeric = (nc / s1.length()) * 100;
		System.out.println(numeric);
		double spl = (sp / s1.length()) * 100;
		System.out.println(spl);

	}

}
