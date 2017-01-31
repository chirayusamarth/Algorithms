import java.util.*;
import java.lang.*;
import java.io.*;

public class BinarySearchInRotatedArray {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int val = scan.nextInt();
		for(int i=0;i<n;i++)
		    a[i] = scan.nextInt();
		int idx = pivotedbinarySearch(a,0,n-1,val);
		System.out.println(idx);
	}
	private static int pivotedbinarySearch(int a[], int low, int high, int val){
		int pivot = findPivot(a,low,high);
		if(pivot==-1)
			return binarySearch(a, low, high, val);
	    
	    	if(a[pivot]==val)
	    		return pivot;
	    	else{
	    		if(a[low] < val)
	    			return binarySearch(a,low,pivot-1,val);
	    		else
	    			return binarySearch(a, pivot+1, high, val);
	    	}
	    
	}
	private static int binarySearch(int[] a, int low, int high, int val) {
		// TODO Auto-generated method stub
		int mid= (low+high)/2;
		if(low<=high)
		{
			if(a[mid]==val)
				return mid;
			else{
				if(val < a[mid])
					return binarySearch(a, low, mid-1, val);
				else
					return binarySearch(a, mid+1, high, val);
			}
		}
		return -1;
	}
	private static int findPivot(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int mid = (low+high)/2;
		
		if(mid<high && a[mid] > a[mid+1])
			return mid;
		if(low<mid && a[mid-1] > a[mid])
			return mid-1;
		if(a[low] >= a[mid])
			return findPivot(a, low, mid-1);
		return findPivot(a,mid+1,high);
	}
}