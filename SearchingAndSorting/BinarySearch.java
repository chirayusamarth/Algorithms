import java.util.Scanner;


public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int val = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		int index = binarySearch(a,0,n-1,val);
		System.out.println(index);
	}

	private static int binarySearch(int[] a, int low, int high, int val) {
		// TODO Auto-generated method stub
		if(low <= high){
			int mid= (low+high)/2;
			if(a[mid]==val)
				return mid;
			else{
				if(val < a[mid])
					return binarySearch(a, low, mid-1, val);
				else
					return binarySearch(a, mid+1, high, val);
			}
		}
		
		// We reach here when element is not present in array
		return -1;
	}	
}
