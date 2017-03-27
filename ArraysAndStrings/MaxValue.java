import java.util.Scanner;


public class MaxValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
			a[i]= scan.nextInt();
		scan.close();
		int maximum= Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			int x= a[i]-i;
			for(int j=0;j<n;j++){
				if(i!=j){
					int y= a[j]-j;
					maximum= Math.max(x- y,maximum);
				}
			}
		}
		System.out.println(maximum);
	}

}
