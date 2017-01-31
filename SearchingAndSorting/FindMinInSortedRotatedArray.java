import java.util.Scanner;


public class FindMinInSortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		    a[i] = scan.nextInt();
		int min = findMin(a,0,n-1);
		System.out.println(min);
	}

	private static int findMin(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int mid = (low+high)/2;
		if(high==low)
			return a[low];
		if(a[low] < a[high])
			return a[low];
		if(a[mid] > a[mid+1])
			return a[mid+1];
		if(a[mid]<a[mid-1])
			return a[mid];
		else{
			if(a[mid] < a[high])
				return findMin(a,low, mid-1);
			else
				return findMin(a,mid+1,high);
		}
	}

	

}
