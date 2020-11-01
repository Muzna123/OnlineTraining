package Strings;

public class RemoveSpaceAndAnagram {
	public static String removeSpace(String s) {
		char[] ch = s.toCharArray();

		String out = "";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ') 
				out=out+ch[i];
		}
		return out;
	}
	
	public static String toLowerCase(String s){
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65&&ch[i]<=90) {
				 ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
	public static String sort(String s){
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	return new String(ch);
	}
	public static boolean compare(String s1,String s2){
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i])
				return false;	
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s1 = removeSpace("Mother in law");
		String s2 = removeSpace("Hitler woman");
		System.out.println("after removing space");
		System.out.println(s1);
		System.out.println(s2);
		if(s1.length()!=s2.length()) 
			System.out.println("It is not anagram");
			
		else
		{
		System.out.println("After converting to lower case");		
		s1 = toLowerCase(s1);
		s2 = toLowerCase(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("After sorting");
		s1 = sort(s1);
		s2 = sort(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("After comparing letters");
	    if(compare(s1,s2))
			System.out.println("It is anagram");
		else
			System.out.println("It is not anagram");
		}
		
	}
}
