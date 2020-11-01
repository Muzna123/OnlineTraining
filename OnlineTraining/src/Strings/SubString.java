package Strings;

public class SubString {
	public static boolean isSubString(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int k = i;
			int j = 0;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				k++;
				j++;
			}
			if (j == c2.length)
				return true;
		}
		return false;
	}
	public static boolean isRotation(String s1, String s2) {
		s1=s1+s2;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int k = i;
			int j = 0;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				k++;
				j++;
			}
			if (j == c2.length)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "this is string";
		String s2 = "nga";
		if (isSubString(s1, s2))
			System.out.println("it is substring");
		else
			System.out.println("it is not substring");
		
	  String s3="Java programing";
	  String s4="ingJava program";
	  if(isRotation(s3, s4))
		  System.out.println("It is rotation");
	  else
		  System.out.println("It is not rotation");
	}
}
