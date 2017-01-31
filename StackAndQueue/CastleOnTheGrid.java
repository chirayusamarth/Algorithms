import java.util.*;


public class CastleOnTheGrid {

	/**
	 * @param args
	 */
	private static class Node{
		int a;
		int b;
		int depth;
		
		public Node(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public Node(int a, int b, int d){
			this.a = a;
			this.b = b;
			this.depth = d;
		}
		public boolean equal(Node dest){
			if(this.a==dest.a && this.b==dest.b)
				return true;
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		char m[][] = new char[n][n];
		for(int i=0;i<n;i++){
			String s = scan.nextLine();
			m[i] = s.toCharArray();
		}
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
        ArrayDeque<Node> queue = new ArrayDeque<Node>() ;
        Node start = new Node(a,b,0);
        Node dest = new Node(c,d);
        queue.add(start);
        boolean visited[][] = new boolean[n][n];
        visited[a][b] = true;
        
        while(!queue.isEmpty()){
        	Node x = queue.poll();
        	if(x.equal(dest)) {
        		System.out.println(x.depth);
        		break;
        	}
        	int a1 = x.a;
        	int b1 = x.b+1;
        	while(b1<n && m[a1][b1]!='X'){
        		if(!visited[a1][b1]){
        			Node temp = new Node(a1,b1,x.depth+1);
        			visited[a1][b1]=true;
        			queue.add(temp);
        		}
        		b1++;
        	}
        	b1 = x.b-1;
        	while(b1 >= 0 && m[a1][b1]!='X'){
        		if(!visited[a1][b1]){
        			Node temp = new Node(a1,b1,x.depth+1);
            		visited[a1][b1]=true;
            		queue.add(temp);
        		}
        		b1--;
        	}
        	a1=x.a+1;
        	b1=x.b;
        	while(a1<n && m[a1][b1]!='X'){
        		if(!visited[a1][b1]){
        			Node temp = new Node(a1,b1,x.depth+1);
            		visited[a1][b1]=true;
            		queue.add(temp);
        		}
        		a1++;
        	}
        	a1=x.a-1;
        	while(a1>=0 && m[a1][b1]!='X'){
        		if(!visited[a1][b1]){
        			Node temp = new Node(a1,b1,x.depth+1);
            		visited[a1][b1]=true;
            		queue.add(temp);
        		}
        		a1--;
        	}
        }
	}

}
