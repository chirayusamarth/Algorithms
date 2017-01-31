import java.util.LinkedList;

//Implementing BFS
public class RouteBetweenNodes {

	/**
	 * @param args
	 */
	private static class Graph{
		private int V;	//no. of vertices
		LinkedList<Integer> adj[];
		
		public Graph(int v){
			V=v;
			adj = new LinkedList[v];
			for(int i=0;i<v;++i)
				adj[i]= new LinkedList();
		}
		public void addEdge(int a, int b){
			adj[a].add(b);
		}
		public void BFS(int s){
			boolean visited[] = new boolean[V];
			
			LinkedList<Integer> q = new LinkedList<Integer>();
		//	LinkedList<Integer> L[] = new LinkedList[5];
			visited[s]=true;
			q.add(s);
			
			while(!q.isEmpty()){
				s = q.poll();
				System.out.println(s+" ");
				for(int i: adj[s]){
					if(visited[i]==false){
						visited[i]=true;
						q.add(i);
					}
				}
			}
		}
		
	}
	private static boolean isRoute(Graph g, int start, int end){
		boolean visited[] = new boolean[g.V];
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		visited[start]=true;
		q.add(start);
		while(!q.isEmpty() && start!=end){
			start= q.poll();
			for(int i: g.adj[start]){
				if(visited[i]==false){
					visited[i]=true;
					q.add(i);
				}
			}
		}
		if(start==end)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g= new Graph(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		//g.BFS(2);
		
		boolean ans = isRoute(g, 2, 0);
		System.out.print(ans);
	}

}
