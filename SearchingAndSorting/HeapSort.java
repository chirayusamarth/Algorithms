import java.util.Scanner;


public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        heapsort(a,n);
        for(int i=0;i<n;i++){
        	System.out.println(a[i]);
        }
            
	}

	private static void heapsort(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=n/2 - 1;i>=0;i--){
			heapify(a, n, i);
		}
		for(int i=n-1;i>=0;i--){
			swap(a, 0, i);
			heapify(a,i,0);
		}
	}

	private static void swap(int[] a, int i, int i2) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[i2];
		a[i2]=temp;
	}

	private static void heapify(int[] a, int n, int i) {
		// TODO Auto-generated method stub
		int largest = i;
		int l= 2*i + 1;
		int r = 2*i + 2;
		if(l<n && a[l] > a[largest])
			largest=l;
		if(r<n && a[r] > a[largest])
			largest=r;
		if(largest!=i)
		{
			swap(a,i,largest);
			heapify(a,n,largest);
		}
	}

}
