import java.util.BitSet;
import java.util.Scanner;


public class SparseSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String strings[] = new String[n];
		for(int i=0;i<n;i++){
			strings[i] = scan.next();
		}
		String str = scan.next();
		
		if(strings==null || str==null || str=="")
			System.out.println(-1);
		else{
			int idx = search(strings, str, 0, n-1);
			System.out.println(idx);
		}
	}

	private static int search(String[] strings, String str, int first, int last) {
		// TODO Auto-generated method stub
		if(first<=last){
			int mid = (first+last)/2;
			if(strings[mid].isEmpty()){
				int left = mid-1;
				int right = mid+1;
				while(true)
				{
					if(left < first && right > last)
						return -1;
					else{
						if(right<=last && !strings[right].isEmpty()){
							mid=right;
							break;
						}
						else{
							if(left > first && !strings[left].isEmpty()){
								mid = left;
								break;
							}
						}
						right++;
						left--;
					}
				}
			}
		
			if(strings[mid].equals(str))
				return mid;
			else{
				if(strings[mid].compareTo(str) < 0)
					return search(strings, str, mid+1, last);
				else
					return search(strings, str, first, mid-1);
			}
		}
		return -1;
	}

}
