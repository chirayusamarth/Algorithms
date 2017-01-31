import java.util.*;


public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int n = scan.nextInt();
        int k = scan.nextInt();
		for(int i=0;i<n;i++){
			q.offer(scan.nextInt());
		}
		sweetness(q, k);
		scan.close();
	}

	private static void sweetness(PriorityQueue<Integer> q, int k) {
		// TODO Auto-generated method stub
		int sweetness=0;
		int ops=0;
		
		while(q.peek() < k){
			if(q.size() >= 2){
				int min1 = q.poll();
				int min2 = q.poll();
				sweetness = min1 + (2*min2);
				q.offer(sweetness);
				ops++;
			}
			else{
				System.out.println(-1);
				break;
			}
			
		}
		if(q.peek() >= k)
			System.out.println(ops);
	}
}