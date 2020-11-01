package forLoop;
public class LCM {
	public static void lCM(int a,int b) {
		
		int max=(a>b)?a:b;
		int temp=max;
		while(true)
		{
			if(max%a==0 && max%b==0) {
				System.out.println("LCM is "+max);
				break;
			}
			max=max+temp;
		}	
	}
	public static void main(String[] args) {
		lCM(3,5);
	}

}
