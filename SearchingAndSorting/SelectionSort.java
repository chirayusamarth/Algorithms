import java.util.Scanner;


public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		for(int i=0;i<n-1;i++){
			int minindex=i;
			for(int j=i+1;j<n;j++){
				if(a[j] < a[minindex])
					minindex=j;
			}
			int temp = a[i];
			a[i] = a[minindex];
			a[minindex] = temp;
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}

}
