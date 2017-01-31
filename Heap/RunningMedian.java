import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class RunningMedian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(n, Collections.reverseOrder());
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		for(int i=0;i<n;i++){
			int t = scan.nextInt();
			
			if(!maxheap.isEmpty() && t<=maxheap.peek())
				maxheap.offer(t);
			else
				minheap.offer(t);
			
			while(maxheap.size() - minheap.size() > 1)
				minheap.offer(maxheap.poll());
			while(minheap.size()- maxheap.size() > 1)
				maxheap.offer(minheap.poll());
			
			
			if(maxheap.size() == minheap.size())
				System.out.println((minheap.peek()+maxheap.peek())/2.0);
			
			else{
				if(minheap.size() > maxheap.size()){
					System.out.printf("%.1f", minheap.peek()/1.0);
					System.out.println();
				}
				else{
					System.out.printf("%.1f", maxheap.peek()/1.0);
					System.out.println();
				}
			}
		}
		scan.close();
	}

}
