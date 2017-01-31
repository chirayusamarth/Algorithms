import java.util.Scanner;


public class MinimalTree {

	/**
	 * @param args
	 */
	
	private static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		int low=0;
		int high=n-1;
		TreeNode root = BST(a, low, high);
		System.out.println(root.data);
	}
	private static TreeNode BST(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(high < low)
			return null;
		int mid = (low+high)/2;
		
		TreeNode root = new TreeNode(a[mid]);
		
		root.left= BST(a, low, mid-1);
		root.right= BST(a, mid+1, high);
		
		return root;
	}

}
