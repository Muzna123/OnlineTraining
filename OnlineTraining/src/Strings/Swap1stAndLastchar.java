package Strings;

public class Swap1stAndLastchar {
	public static String swap1stAndLastchar(String s1,char c1) {
		char [] ch=s1.toCharArray();
		int a=0;
		String [] str=new String[CountOfWordsAndUserDefinedSplit.countofWords(s1, c1)];
		String out="";
		for(int i=0;i<ch.length;i++) {
			String res="";
		
			while(i<ch.length&&ch[i]!=c1) {
				res=res+ch[i];
				i++;
			}
			char[] c2 = res.toCharArray();
			char temp=c2[0];
			c2[0]=c2[c2.length-1];
			c2[c2.length-1] = temp;
			res=new String(c2);
			out=out+res+" ";
		}
		return out;
	}
	public static void main(String[] args) {
		String s1="this is java program";
		String res=swap1stAndLastchar(s1, ' ');
		System.out.println(res);
	}
}
