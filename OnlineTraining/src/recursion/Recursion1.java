package recursion;

public class Recursion1 {
	//987654321
	public static void printDec(int a) {
		if(a>=1) {
		System.out.print(a);
		a--;
		printDec(a);
		}
		}
    //23456789
	public static void printInc(int a) {
		if (a <= 9) {
			System.out.print(a);
			a++;
			printInc(a);
		}
	}

	

	public static void main(String[] args) {
		printDec(9);
		printInc(2);
	}
}
