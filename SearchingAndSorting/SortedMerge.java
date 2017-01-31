import java.util.Scanner;


public class SortedMerge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int a[] = new int[n1+n2];
		int b[] = new int[n2];
		for(int i=0;i<n1;i++)
			a[i]= scan.nextInt();
		for(int i=0;i<n2;i++)
			b[i] = scan.nextInt();
		sortedMerge(a,n1,b,n2);
		for(int i=0;i<n1+n2;i++)
			System.out.println(a[i]);
	}

	private static void sortedMerge(int[] a, int n1, int[] b, int n2) {
		// TODO Auto-generated method stub
		int i=n1-1;
		int j=n2-1;
		int k=n1+n2-1;
		while(i>=0 && j>=0){
			if(a[i] > b[j]){
				a[k] = a[i];
				i--;
			}
			else{
				a[k] = b[j];
				j--;
			}
			k--;
		}
		//No need to copy the contents of 'a' after running out of 'b'. They are already in place.
		/*
		while(i>=0){
			a[k]=a[i];
			i--;
			k--;
		}*/
		while(j>=0){
			a[k]=b[j];
			j--;
			k--;
		}
	}

	private static void swap(int[] a, int i, int[] b, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i]=b[j];
		b[j]=temp;
	}
}