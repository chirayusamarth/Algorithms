
public class InOrderSuccessor {

	/**
	 * @param args
	 */
	private static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		
		public TreeNode(int data, TreeNode parent){
			this.data = data;
			this.parent = parent;
		}
		
	}
	
	public static TreeNode inOrderSucc(TreeNode node){
		if(node==null)
			return null;
		if(node.right!=null){
			node=node.right;
			while(node.left!=null)
				node=node.left;
			return node;
		}
		else{
			TreeNode q = node;
			TreeNode x = q.parent;
			while(x!=null && x.left!=q){
				q=x;
				x=x.parent;
			}
			return x;
		}
		//return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5, null);
		TreeNode child1 = new TreeNode(2, root);
		TreeNode child2 = new TreeNode(8, root);
		root.left = child1;
		root.right = child2;
		TreeNode child11 = new TreeNode(1, child1);
		TreeNode child12 = new TreeNode(4, child1);
		child1.left = child11;
		child1.right = child12;
		TreeNode child21 = new TreeNode(6, child2);
		TreeNode child22 = new TreeNode(9, child2);
		child2.left = child21;
		child2.right = child22;
		
		
		TreeNode succ = inOrderSucc(root);
		System.out.println(succ.data);
	}
	

}