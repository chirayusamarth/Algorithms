
public class PathsWithSum {

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
		TreeNode root1 = new TreeNode(10);
		root1.left = new TreeNode(5);
		root1.right=new TreeNode(-3);
		root1.right.right=new TreeNode(11);
		root1.left.left=new TreeNode(3);
		root1.left.right=new TreeNode(2);
		root1.left.right.right=new TreeNode(1);
		root1.left.left.left=new TreeNode(3);
		root1.left.left.right=new TreeNode(-2);
		
		int targetSum=8;
		int paths = countPathsWithSum(root1.left, targetSum);
		System.out.println(paths);
	}
	private static int countPathsWithSum(TreeNode root1, int targetSum) {
		// TODO Auto-generated method stub
		if(root1==null)
			return 0;
		int pathFromRoot = countPathsWithSumFromNode(root1, targetSum, 0);
		return pathFromRoot;
	}
	private static int countPathsWithSumFromNode(TreeNode node, int targetSum, int currSum) {
		// TODO Auto-generated method stub
		if(node==null)
			return 0;
		currSum+=node.data;
		int totalPaths=0;
		if(currSum==targetSum)
			totalPaths++;
		
		totalPaths += countPathsWithSumFromNode(node.left, targetSum, currSum);
		totalPaths += countPathsWithSumFromNode(node.right, targetSum, currSum);
		
		return totalPaths;
	}

}
