import java.util.ArrayList;
import java.util.Scanner;


public class NQueens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		ArrayList<Integer[]>results = new ArrayList<Integer[]>();
		Integer columns[]= new Integer[n];
		placeQueens(0, columns, n, results);
	}

	private static void placeQueens(int row, Integer[] columns, int n, ArrayList<Integer[]> results) {
		// TODO Auto-generated method stub
		if(row==n)
			results.add(columns.clone());
		else{
			for(int col=0;col<n;col++){
				if(checkValid(columns,row,col)){
					columns[row]= col;
					placeQueens(row+1, columns, n, results);
				}
			}
		}
	}

	private static boolean checkValid(Integer[] columns, int row1, int col1) {
		// TODO Auto-generated method stub
		for(int row2=0;row2<row1;row2++){
			int column2= columns[row2];
			
			if(col1==column2)
				return false;
			
			int colDist= Math.abs(col1-column2);
			int rowDist= Math.abs(row1-row2);
			
			if(colDist==rowDist)
				return false;
		}
		return true;
	}

}
