package Strings;

public class NoOFWords {
	public static int countOfWords(String s1) {
	    char[] ch = s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' '&&ch[i+1]!=' ')
			count++;
		}
		return count;
	}
public static void main(String[] args) {
	String s1="this is a string";
    
	System.out.println("No. of words "+countOfWords(s1));
}
}
