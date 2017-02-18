import java.util.Scanner;


public class NextLargerElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
			int n= scan.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++)
				a[i]= scan.nextInt();
			int k=1;
			for(int i=0;i<n;i++){
				//int k= i+1;
				if(k>=n){
					System.out.print("-1 ");
					if(i<n)
						k=i+1;
				}
				else{
				if(a[k]>a[i]){
					System.out.print(a[k]+" ");
					k=i+1;
				}
				else{
					k++;
					i--;
				}}
			}
		}
	}

}
