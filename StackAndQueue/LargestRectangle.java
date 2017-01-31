import java.util.Scanner;
import java.util.Stack;


public class LargestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        int h[] = new int[N];
        for(int i=0;i<N;i++){
            h[i] = scan.nextInt();
        }
        scan.close();
        int n = h.length;
        
        int maxarea = 0;
        maxarea = getMaxArea(h, n);
        System.out.println(maxarea);
	}

	private static int getMaxArea(int[] h, int n) {
		// TODO Auto-generated method stub
		int i=0;
		int maxarea = 0;
		int area;
		Stack<Integer> s = new Stack<Integer>();
		int tp;
		while(i<n){
			if(s.isEmpty() || h[s.peek()] <= h[i]){
				s.push(i++);
			}
			else{
				tp = s.peek();
				s.pop();
				if(s.isEmpty())
					area = h[tp]*i;
				else
					area = h[tp]*(i-s.peek()-1);
				if(maxarea < area)
					maxarea = area;
			}
		}
		while(!s.isEmpty()){
			tp = s.peek();
			s.pop();
			if(s.isEmpty())
				area = h[tp]*i;
			else
				area = h[tp]*(i-s.peek()-1);
			if(maxarea < area)
				maxarea = area;
		}
		return maxarea;
	}

}
