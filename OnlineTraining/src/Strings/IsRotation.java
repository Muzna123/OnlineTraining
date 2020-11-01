package Strings;

public class IsRotation {
	public static boolean isRotation(String s1, String s2) {
		s1 = s1 + s1;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int j = 0;
			int k = i;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				k++;
				j++;
			}
			if (j == c2.length) {
				return true;
			}
		}
		return false;
	}

	public static boolean isSubString(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int j = 0;
			int k = i;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				k++;
				j++;
			}
			if (j == c2.length) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "java is programing";
		String s2 = "ingjava is program";
		boolean res = isRotation(s1, s2);
		if (res)
			System.out.println("it is rotation");
		else
			System.out.println("it is not rotation");
		
	
		String s3="is programing";
		if(isSubString(s1, s3))
		System.out.println("It is substring");
		else
			System.out.println("It is not substring");
	}
}
