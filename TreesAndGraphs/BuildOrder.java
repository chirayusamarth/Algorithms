import java.util.LinkedList;
import java.util.Scanner;


public class BuildOrder {

	/**
	 * @param args
	 */ 
	private static class Graph{
		int V;
		LinkedList<Integer> edges[];
		
		public Graph(int v){
			V=v;
			edges = new LinkedList[v];
			for(int i=0;i<v;i++)
				edges[i] = new LinkedList();
		}
		
		public void addEdge(int a, int b){
			edges[a].add(b);
		}
		private void buildorder(int s) {
			// TODO Auto-generated method stub
			
				boolean visited[] = new boolean[V];
				
				LinkedList<Integer> q = new LinkedList<Integer>();
				
				visited[s]=true;
				q.add(s);
				
				while(!q.isEmpty()){
					s = q.poll();
					System.out.println(s+" ");
					for(int i: edges[s]){
						if(visited[i]==false){
							visited[i]=true;
							q.add(i);
						}
					}
				}
			}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //no of projects
		int nodes[] = new int [n];
		for(int i=0;i<n;i++){
			nodes[i] = Integer.parseInt(scan.next());
		}
		Graph g = new Graph(n);
		int e = scan.nextInt();	//no. of edges
		for(int i=0;i<e;i++){
				int n1 = scan.nextInt();				
				int n2 = scan.nextInt();
				g.addEdge(n1,n2);
		}
		g.buildorder(5);
		
	}
}
