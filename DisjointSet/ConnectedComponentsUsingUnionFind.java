import java.util.Scanner;


public class ConnectedComponentsUsingUnionFind {

	/**
	 * @param args
	 */
	static int parent[] = new int[100005];
	static int size[] = new int[100005];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		init(2*n);
		for(int i=1;i<=n;i++){
			int u = scan.nextInt();
			int v = scan.nextInt();
			union(u,v);
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=1;i<=2*n;i++){
			int temp = size[find(i)];
			max = Math.max(temp, max);
			if(temp > 1)
				min = Math.min(temp, min);
		}
		System.out.println(min+" "+max);
		
	}

	private static void union(int u, int v) {
		// TODO Auto-generated method stub
		int root_u = find(u);
		int root_v = find(v);
		if(root_u!=root_v){
			parent[root_u] = root_v;
			size[root_v] += size[root_u];
		}
	}

	private static int find(int i) {
		// TODO Auto-generated method stub
		/*while(i!=parent[i])
			i=parent[i];
		return i;*/
		if(i==parent[i])
			return i;
		return parent[i]=find(parent[i]);
	}

	private static void init(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++){
			parent[i] = i;
			size[i]=1;
		}
	}

}
