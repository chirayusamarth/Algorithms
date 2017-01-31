import java.util.Scanner;


public class PeaksAndValleys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		sortPeaksValleys(arr,n);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

	private static void sortPeaksValleys(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<n;i+=2){
			int biggestIndex = maxIndex(arr, i-1, i, i+1);
			if(i!=biggestIndex)
				swap(arr, i, biggestIndex);
		}
	}

	private static void swap(int[] arr, int i, int biggestIndex) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i]= arr[biggestIndex];
		arr[biggestIndex]= temp;
	}

	private static int maxIndex(int[] arr, int a, int b, int c) {
		// TODO Auto-generated method stub
		int aVal = a>=0 && a<arr.length ? arr[a]:Integer.MIN_VALUE;
		int bVal = b>=0 && b<arr.length ? arr[b]:Integer.MIN_VALUE;
		int cVal = c>=0 && c<arr.length ? arr[c]:Integer.MIN_VALUE;
		
		int max = Math.max(aVal, Math.max(bVal, cVal));
		if(aVal==max)
			return a;
		if(bVal==max)
			return b;
		else
			return c;
	}

}
