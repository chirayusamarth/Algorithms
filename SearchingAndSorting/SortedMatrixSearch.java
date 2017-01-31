
import java.util.Scanner;


public class SortedMatrixSearch {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int a[][]= new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				a[i][j] = scan.nextInt();
		}
		System.out.println(a.length);
		int ele = scan.nextInt();
		boolean ans = findElement(a,ele);
		if(!ans)
			System.out.println("Not found");
	}

	private static boolean findElement(int[][] a, int ele) {
		// TODO Auto-generated method stub
		int row=0;
		int col=a[0].length-1;			//Top Right Element
		while(row<a.length && col>=0)
		{
			if(a[row][col]==ele)
			{
				System.out.println(row+" "+col);
				return true;
			}
			else{
				if(ele < a[row][col])
					col--;
				else
					row++;
			}
		}
		return false;
	}

}
