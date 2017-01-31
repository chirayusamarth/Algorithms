import java.util.LinkedList;


public class DFS {
	/**
	 * @param args
	 */
	private static class Graph{
		int V;	//no. of nodes
		LinkedList<Integer> adj[];
		
		
		public Graph(int v){
			V = v;
			adj = new LinkedList[v];
			for(int i=0;i<v;i++){
				adj[i]=new LinkedList();
			}
		}
		public void addEdge(int a, int b){
			adj[a].add(b);
		}
		public void DFS(int start, boolean visited[]){
			LinkedList<Integer> q = new LinkedList<Integer>();
			
			visited [start]= true;
			System.out.println(start+" ");
			for(int i: adj[start]){
				if(visited[i]==false){
					DFS(i, visited);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(3, 2);
		boolean visited[]= new boolean[4];
		g.DFS(2, visited);

	}

}
