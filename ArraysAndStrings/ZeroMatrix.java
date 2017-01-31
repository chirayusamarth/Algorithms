import java.util.Scanner;


public class ZeroMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] a = new int[rows][cols];
		int row[]=new int[rows];
		int col[]=new int[cols];
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				a[i][j]=scan.nextInt();
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(a[i][j]==0){
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(row[i]==1 || col[j]==1)
					a[i][j]=0;
			}
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
				System.out.print(a[i][j]+"  ");
			System.out.println();
		}
	}

}
