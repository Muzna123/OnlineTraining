package Strings;

import java.util.Scanner;

public class ReverseWordsAndSumOfDigitsInwords {
	public static String SumOfNumInWord(String s1) {
		char[] ch = s1.toCharArray();
		String out = "";
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			int sum = 0;
			while (i < ch.length && ch[i] != ' ') {
				if (ch[i] >= 48 && ch[i] <= 57) {
					sum = sum + (ch[i] - 48);
				} else {
					res = res + ch[i];
				}
				i++;
			}
			out = out + res + sum + " ";
		}
		return out;
	}

	public static String countCHarInWord(String s1) {
		char[] ch = s1.toCharArray();
		String out = "";
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i < ch.length && ch[i] != ' ') {
				res = res + ch[i];
				i++;
			}
			out = out + res + res.length()+" ";
		}
		return out;
	}

	public static String revWholeWord(String s1) {
		char[] ch = s1.toCharArray();
		String out = "";
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i < ch.length && ch[i] != ' ') {
				res = res + ch[i];
				i++;
			}
			out = res + " " + out;
		}
		return out;
	}

	public static String revEachWord(String s1) {
		char[] ch = s1.toCharArray();
		String out = "";
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i < ch.length && ch[i] != ' ') {
				res = ch[i] + res;
				i++;
			}
			out = out + res + " ";
		}
		return out;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the STring");
		String s1 = sc.nextLine();
		String res = SumOfNumInWord(s1);
		System.out.println(res);
		String res1 = countCHarInWord(s1);
		System.out.println(res1);
		String res2 = revWholeWord(s1);
		System.out.println(res2);
		String res3 = revEachWord(s1);
		System.out.println(res3);
	
	}
}
