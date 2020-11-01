package Strings;

import java.util.Scanner;

public class CountOfWordsAndUserDefinedSplit {
	public static int countofWords(String s1, char c1) {
		char[] ch = s1.toCharArray();
		int count = 1;
		if (ch[0] == ' ')
			count = 0;
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == c1 && ch[i + 1] != c1) {
				count++;
			}
		}
		return count;
	}

	public static String[] split(String s1, char c1) {
		char[] ch = s1.toCharArray();
		String[] str = new String[countofWords(s1, c1)];
		int a = 0;
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i < ch.length && ch[i] != c1) {
				res = res + ch[i];
				i++;
			}
			str[a++] = res;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the STring");
		String s1 = sc.nextLine();
		int res = countofWords(s1, ' ');
		System.out.println(res);
		String[] str = split(s1, ' ');
		for (String s : str)
			System.out.println(s);
	}
}
