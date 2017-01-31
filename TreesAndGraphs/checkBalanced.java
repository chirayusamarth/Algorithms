
public class checkBalanced {

	private static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data){
			this.data=data;
		}
	}
	private static int getDepth(TreeNode root){
		if(root == null)
			return 0;
		else{
			int ldepth = getDepth(root.left);
			int rdepth = getDepth(root.right);
			
			return (Math.max(ldepth, rdepth)+1);
		}
	}
	
	private static boolean isBalanced(TreeNode root){
		if(root==null)
			return true;
		int diff = Math.abs(getDepth(root.left)-getDepth(root.right));
		if(diff > 1)
			return false;
		isBalanced(root.left);
		isBalanced(root.right);
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		int h = getDepth(root);
		System.out.println(h);
		boolean ans = isBalanced(root);
		System.out.println(ans);
	}

}
