package Strings;

public class ToUpperCaseToLowerCase {
	public static String toLowerCase(String s1)
	{
		char [] ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65&&ch[i]<=90)
			{
			ch[i]=(char)(ch[i]+32);
			}
			
		}
		return new String(ch);
	}
	public static String toUpperCase(String s1)
	{
		char [] ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97&&ch[i]<=122)
			{
			ch[i]=(char)(ch[i]-32);
			}
		}
		return new String(ch);
	}
public static void main(String[] args) {
	String out=toLowerCase("AbCd$");
	System.out.println(out);
	String out2=toUpperCase("AbCd");
	System.out.println(out2);
}
}
