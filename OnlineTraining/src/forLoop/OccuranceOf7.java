package forLoop;

public class OccuranceOf7 {
public static void main(String[] args) {
	int count=0;
	int num=777897;
	while(num>0) {
		int rem=num%10;
		if(rem==7)
			count++;
		num=num/10;
	}
	System.out.println("No of occurance of 7 ="+count);
}
}
