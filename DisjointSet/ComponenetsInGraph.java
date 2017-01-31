
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ComponenetsInGraph {
    
	private static class Graph{
		int V;	//no. of nodes
		LinkedList<Integer> adj[];
		
		
		public Graph(int v){
			V = v;
			adj = new LinkedList[(2*v)+1];
			for(int i=1;i<=2*v;i++){
				adj[i]=new LinkedList();
			}
		}
		public void addEdge(int a, int b){
			adj[a].add(b);
		}
		public int DFS(int start, boolean visited[], int count){
			LinkedList<Integer> q = new LinkedList<Integer>();
			visited [start]= true;
			//System.out.println(start+" ");
			for(int i: adj[start]){
				if(visited[i]==false){
					count++;
					count = DFS(i, visited, count);
				}
			}
			return count;
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n+1];
        int b[]= new int[n+1];
		Graph g = new Graph(n);
		int parent[]= new int[(2*n)+1];
		int size[]= new int[(2*n)+1];
		for(int i=1;i<=n;i++){
	        a[i]= sc.nextInt();
	        b[i] = sc.nextInt();
			g.addEdge(a[i], b[i]);
			g.addEdge(b[i], a[i]);
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=1;i<=n;i++){
			int count=1;
			boolean visited[]= new boolean[(2*n)+1];
			int connectedcomponenet = g.DFS(a[i], visited, count);
			min = Math.min(connectedcomponenet, min);
			max = Math.max(connectedcomponenet, max);
		}
		System.out.println(min+" "+max);
		
	}
	

}