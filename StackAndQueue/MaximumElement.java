import java.util.*;


public class MaximumElement {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<N;i++){
            int t = scan.nextInt();
            switch(t) {
	            case 1:
	                    int item = scan.nextInt();
	                    push(s, item);
	                    break;
	            case 2:
	                    int x = pop(s);
	                    break;
	            case 3:
	                    int m = maximum(s);
	                    System.out.println(m);
	                    break;
            }
        }
	}
	private static int pop(Stack<Integer> s) {
		// TODO Auto-generated method stub
		if(s.isEmpty())
			return -1;
		return s.pop();
	}
	private static void push(Stack<Integer> s, int item) {
		// TODO Auto-generated method stub
		s.add(item);
	}
	private static int maximum(Stack<Integer> s) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		Stack<Integer> s1 = s;
		while(!s1.isEmpty()){
			int x = s1.pop();
			max = Math.max(x, max);
		}
		return max;
	}
}
