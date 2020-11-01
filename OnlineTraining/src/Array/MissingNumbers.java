package Array;

public class MissingNumbers {
	public static void main(String[] args) {
		int [] ar= {14,18,23,25,30};	
		for (int i =0 ; i < ar.length-1; i++) {
			for (int j = ar[i]+1; j <ar[i+1]; j++) {
				System.out.print(j+" ");
			}
		}
	}

}
