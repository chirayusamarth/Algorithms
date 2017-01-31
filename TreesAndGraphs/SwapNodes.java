import java.util.Scanner;


public class SwapNodes {

	public static int root_node=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tree[][] = new int[n+1][2];
        for(int i=1;i<=n;i++){
            for(int j=0;j<2;j++)
                tree[i][j] = scan.nextInt();
        }
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
        	int k = scan.nextInt();
        	//inorder(tree, root_node);
        	swapNodes(tree, root_node, k, 1);
        	inorder(tree, root_node);
        	System.out.println();
        }
    }

	private static void swapNodes(int[][] tree, int node, int targetdepth, int depth) {
		// TODO Auto-generated method stub
		if(node==-1)	//null
			return;
		if(depth % targetdepth == 0)
		{
			int temp = tree[node][0];
			tree[node][0] = tree[node][1];
			tree[node][1] = temp;
		}
		swapNodes(tree, tree[node][0], targetdepth, depth+1);
		//System.out.print(Integer.toString(node)+" ");
		swapNodes(tree, tree[node][1], targetdepth, depth+1);
	}
	private static void inorder(int tree[][], int node) {
        if (node == -1) 
        	return;
        inorder(tree, tree[node][0]);
        System.out.print(Integer.toString(node)+" ");
        inorder(tree, tree[node][1]);
    }

}
