package Strings;

public class ReverseWords {
public static void main(String[] args) {
	

	String s1="this is string ";
	  String out =" ";
	  char [] c=s1.toCharArray();
	  for(int i =0;i<c.length;i++)
	  {
	  String res="";
	  int count=0;
	     while(i<c.length-1&&c[i]!=' ')
	      {
	        res=res+c[i]+i+1;
	     count++;
	     i++;
	     
	   }
	  out=out+res+count;
	     }
	  System.out.println(out);
}
}
