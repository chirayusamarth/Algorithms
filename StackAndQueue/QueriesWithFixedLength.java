import java.util.Scanner;


public class QueriesWithFixedLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		for(int k=0;k<q;k++){
			int d = scan.nextInt();
			int min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				int max = Integer.MIN_VALUE;
				for(int j=i;j<i+d;j++){
					if(j>=n)
						break;
					max = Math.max(a[j], max);
				}
				min = Math.min(max, min);
			}
			System.out.println(min);
		}
		
	}

}
