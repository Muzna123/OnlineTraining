package Strings;

import java.util.Scanner;

public class ReverseString {
	public static String reverse2(String s1) {
		char[] ch = s1.toCharArray();// convert String to char array
		for (int i = 0, j = ch.length - 1; i < ch.length / 2; i++, j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		return new String(ch);// char array to String
	}

	public static String reverse(String s1) {
		char[] ch = s1.toCharArray();
		String out = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			out = out + ch[i];
		}
		return out;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the STring");
		String s1 = sc.nextLine();
		String res = reverse2(s1);
		System.out.println(res);
		String res2=reverse(s1);
		System.out.println(res2);
	}
}
