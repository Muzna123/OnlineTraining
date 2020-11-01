package forLoop;

public class BunnyEars {
public static void main(String[] args) {
	int n=14;
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
			count=count+3;
		else
			count=count+2;
	}
	System.out.println("No. of Even and odd bunny's ears: "+ count);
}
}
