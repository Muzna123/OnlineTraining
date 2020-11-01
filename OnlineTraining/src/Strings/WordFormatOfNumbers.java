package Strings;

public class WordFormatOfNumbers {

	static String[] first = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
	static String[] second = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "Seventy", "eighty", "ninty" };

	public static void concat(int num, String s1) {
		if (num > 19) {
			System.out.print(second[num / 10] + " " + first[num % 10] + " ");
		} else {
			System.out.print(first[num] + " ");
		}
		if (num > 0)
			System.out.print(s1);
	}

	public static void main(String[] args) {
		int num = 123456789;
		concat(num/10000000,"Crore ");
		concat((num/100000)%100,"lakh ");
		concat((num/1000)%100,"thousand ");
		concat((num/100)%10,"hundred ");
		concat(num%100,"");
		//System.out.println(0.0 / 0.0);
	}

}