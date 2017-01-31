import java.util.Scanner;


public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	       System.out.print("Enter number of rows: ");
	       int rows = s.nextInt();
	       System.out.print("Enter number of columns: ");
	       int columns = s.nextInt();
	       int[][] a = new int[rows][columns];
	       System.out.println("Enter the first matrix");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               a[i][j] = s.nextInt();
	           }
	       }
	       System.out.println("The sum of the two matrices is"+a.length);
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(a[i][j] + " ");
	           }
	           System.out.println();
	       }
	       int n= a.length;
	       for(int layer=0;layer<n/2;layer++){
	    	   int first=layer;
	    	   int last = n-1-layer;
	    	   for(int i=first;i<last;i++){
	    		   int offset = i-first;
	    		   int top = a[first][i];
	    		   a[first][i]= a[last-offset][first];
	    		   a[last-offset][first]= a[last][last-offset];
	    		   a[last][last-offset]= a[i][last];
	    		   a[i][last]= top;
	    	   }
	       }
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(a[i][j] + " ");
	           }
	           System.out.println();
	       }
	}

}
