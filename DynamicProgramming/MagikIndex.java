import java.util.Scanner;


public class MagikIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
			a[i] = scan.nextInt();
		int magicIndex = getMagikIndex(a,0,n-1);	//Distinct Integer Values
		int magicIndex1 = getMagikIndex1(a,0,n-1);
		System.out.println(magicIndex);
		System.out.println(magicIndex1);
	}

	private static int getMagikIndex1(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(low<=high){
			int mid = (low+high)/2;
			
			if(a[mid]==mid)
				return mid;
			
			int leftIndex = Math.min(mid-1, a[mid]);
			int left = getMagikIndex1(a, low, leftIndex);
			if(left>=0)
				return left;
			int rightIndex = Math.max(mid+1, a[mid]);
			int right = getMagikIndex1(a,rightIndex,high);
			return right;
		}
		return -1;
	}

	private static int getMagikIndex(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(low<=high){
			int mid = (low+high)/2;
			if(mid==a[mid])
				return mid;
			else{
				if(a[mid] > mid)
					return getMagikIndex(a,0,mid-1);
				else
					return getMagikIndex(a,mid+1,high);
			}
		}
		return -1;
	}
}
