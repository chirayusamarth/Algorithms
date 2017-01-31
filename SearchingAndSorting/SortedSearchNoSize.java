import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortedSearchNoSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
        while (scan.hasNextInt()) {
            a.add(scan.nextInt());
        }
        scan.close();
		int idx = sortedSearch(a,x);
		System.out.println(idx);
		
	}

	private static int sortedSearch(ArrayList<Integer> a, int x) {
		// TODO Auto-generated method stub
		int n=1;
		while(elementAt(a,n)!=-1 && elementAt(a,n)<x)
			n=n*2;
		return binarySearch(a,0,n,x);
	}

	private static int binarySearch(ArrayList<Integer> a, int low, int high, int x) {
		// TODO Auto-generated method stub
		int mid = (low+high)/2;
		if(low<=high){
			int middle = elementAt(a,mid);
			if(middle==-1 || x < middle)
				return binarySearch(a,low,mid-1,x);
			else{
				if(x > middle)
					return binarySearch(a,mid+1,high,x);
				else
					return mid;
			}
		}
		return -1;
	}

	private static int elementAt(ArrayList<Integer> a, int i) {
		// TODO Auto-generated method stub
		if(i>=a.size())
			return -1;
		return a.get(i);
	}
}