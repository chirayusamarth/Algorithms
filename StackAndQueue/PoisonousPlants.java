import java.util.*;


public class PoisonousPlants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p[] = new int[n];
        for(int i=0;i<n;i++)
            p[i]= scan.nextInt();
        
        int count=0;
        int i=0;
        loop:
        	while(i<p.length-1) {
        	if(p[i] < p[i+1]){
        		count++;
        		p = putInStack(p);
        		i=0;
            	continue loop;
        	}
        	i++;
        }
        System.out.println(count);
        
	}

	private static int[] putInStack(int[] p) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		int n = p.length;
		for(int i=0;i<n;i++){
			if(st.isEmpty() || st.peek() >= p[i] || p[i-1] >= p[i])
				st.push(p[i]);
		}
		int p1[] = new int[st.size()];
		for(int i=st.size()-1;i>=0;i--){
			p1[i] = st.pop();
		}
		return p1;
	}

}
