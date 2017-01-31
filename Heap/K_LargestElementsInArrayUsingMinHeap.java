import java.util.*;


public class K_LargestElementsInArrayUsingMinHeap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int a[] =new int[n];
		PriorityQueue<Integer> small = new PriorityQueue<Integer>();
		PriorityQueue<Integer> large = new PriorityQueue<Integer>(k, Collections.reverseOrder());
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			small.offer(a[i]);
			large.offer(a[i]);
		}
		ArrayList<Integer> smallop = new ArrayList<Integer>();
		ArrayList<Integer> largeop = new ArrayList<Integer>();
		while(smallop.size() < k){
			smallop.add(small.poll());
		}
		for(int itr: smallop)
			System.out.print(itr+" ");
		System.out.println();
		while(largeop.size() < k){
			largeop.add(large.poll());
		}
		for(int itr1: largeop)
			System.out.print(itr1+" ");
		
		
		scan.close();
	}

}
