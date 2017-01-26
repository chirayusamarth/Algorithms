import java.util.Scanner;

public class Arrays2D {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[][]=new int[6][6];
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				a[i][j]=scan.nextInt();
			}
		}
		scan.close();
		int sum[][]=new int[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				sum[i][j]=0;
				for(int k=j;k<j+3;k++){
					sum[i][j] += a[i][k]+a[i+2][k];
				}
				sum[i][j]+=a[i+1][j+1];
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(" "+sum[i][j]);
			}
			System.out.println();
		}
		
		int max = sum[0][0];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(sum[i][j] > max)
					max = sum[i][j];
			}
		}
		System.out.println("Max: "+max);	
	}
}
