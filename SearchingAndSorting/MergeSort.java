import java.util.Scanner;


public class MergeSort {

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
		mergeSort(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}

	private static void mergeSort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l < r){
			int mid = (l+r)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, r);
			merge(a,l,mid,r);
		}
	}

	private static void merge(int[] a, int l, int mid, int r) {
		// TODO Auto-generated method stub
		// Merges two subarrays of arr[].
	    // First subarray is arr[l..mid]
	    // Second subarray is arr[mid+1..r]
		int n1 = mid-l+1;	//size of first subarray
		int n2 = r-mid;		//size of second subarray
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			L[i] = a[l+i];
		for(int j=0;j<n2;j++)
			R[j] = a[mid+1+j];
		
		int i=0;
		int j=0;
		int k=l;	//
		while(i<n1 && j<n2){
			if(L[i]<R[j]){
				a[k]=L[i];
				i++;						
			}
			else{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			a[k]=L[i];
			i++;
			k++;	
		}
		while(j<n2){
			a[k]=R[j];
			j++;
			k++;
		}
	}

}
