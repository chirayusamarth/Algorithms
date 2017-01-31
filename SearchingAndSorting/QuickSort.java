import java.util.Scanner;


public class QuickSort {

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
		int low = 0;
		int high = n-1;
		quickSort(a, low, high);
	//	quickSortIterative(a, low, high);
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

	/*private static void quickSortIterative(int[] a, int low, int high) {
		int stack[] = new int[high-low+1];
		
		int top=-1;
		
		stack[++top] = low;
		stack[++top] = high;
		
		while(top>=0){
			high = stack[top--];
			low = stack[top--];
			
			int index = partition(a, low, high);
			
			if(index-1 > low){
				stack[++top]= low;
				stack[++top]= index-1;
			}
			else{
				if(index+1 < high){
					stack[++top] = index+1;
					stack[++top] = high;
				}
			}
		}
		
	}
	*/
	private static void quickSort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		//finding median
		if(low==high)
			System.out.println(a[low]);
		if(low < high){
			int index = partition(a, low, high);
			int mid= a.length /2;
			if(index==mid)
				System.out.println(a[index]);
			else{
				if(index > mid)
					quickSort(a, low, index-1);
				else
					quickSort(a, index+1, high);
			}
		}
	}

	private static int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = a[high];
		int i= low-1;
		for(int j=low;j<=high-1;j++){
			if(a[j] <= pivot){
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i+1, high);
		return i+1;
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
