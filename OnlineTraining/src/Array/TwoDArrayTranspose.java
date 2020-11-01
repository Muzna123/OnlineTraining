package Array;

public class TwoDArrayTranspose {
	public static int[][] colElemRev(int [][] ar)
	{
		for (int i = 0,y=ar.length-1; i < ar.length/2; i++,y--) {
	for (int j = 0; j < ar[i].length; j++) {
				int temp=ar[i][j];
				ar[i][j]=ar[y][j];
				ar[y][j]=temp;
			}
		}
		return ar;
	}
	public static int[][] rowElemRev(int [][] ar)
	{
		for (int i = 0; i < ar.length; i++) {
	for (int j = 0,y=ar[i].length-1; j < ar[i].length/2; j++,y--) {
				int temp=ar[i][j];
				ar[i][j]=ar[i][y];
				ar[i][y]=temp;
			}
		}
		return ar;
	}
	public static int[][] transpose2(int [] [] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length/2; j++) 
			{
				if(i!=j)
				{
				int temp=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=temp;
				}
			}
		}
		return ar;
	}
	public static int[][] transpose1(int [] []ar)
	{
		int [][] nar=new int[ar.length][ar[0].length];
		for (int i = 0; i < nar.length; i++) {
			for (int j = 0; j < nar[i].length; j++) {
				nar[i][j]=ar[j][i];
			}
		}
		return nar;
	}
public static void main(String[] args) {
	int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("array before transpose");	
	for (int i = 0; i < ar.length; i++) {
		for (int j = 0; j < ar[i].length; j++) {
			System.out.print(ar[i][j]+"("+i+","+j+")"+" ");
		}
		System.out.println();
	}
	int[][] na=rowElemRev(ar);
	
	System.out.println("array after row reverse");
	for (int i = 0; i < na.length; i++) {
		for (int j = 0; j < na[i].length; j++) {
			System.out.print(na[i][j]+"("+i+","+j+")"+" ");
		}
		System.out.println();
	}
	
	int [][]nar=colElemRev(na);
	
	System.out.println("array after 180 degree ");
	for (int i = 0; i < nar.length; i++) {
		for (int j = 0; j < nar[i].length; j++) {
			System.out.print(nar[i][j]+"("+i+","+j+")"+" ");
		}
		System.out.println();
	}
}
}
