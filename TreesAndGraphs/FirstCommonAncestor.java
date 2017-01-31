import java.util.ArrayList;


public class FirstCommonAncestor {

	/**
	 * @param args
	 */
	private static class TreeNode{
		int data;
		TreeNode parent;
		ArrayList<TreeNode> children = new ArrayList<TreeNode>();
		
		public TreeNode(TreeNode parent){
			this.parent=parent;
		}
		public void setData(int data){
			this.data=data;
		}
		public int getData(){
			return data;
		}
		public ArrayList<TreeNode> getChildren(){
			return children;
		}
		public TreeNode getParent(){
			return parent;
		}		
	}
	private static TreeNode addChild(TreeNode parent, int data){
		TreeNode node = new TreeNode(parent);
		node.setData(data);
		parent.getChildren().add(node);
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(null);
		root.setData(6);
		TreeNode child1 = addChild(root, 9);
		TreeNode child11 = addChild(child1, 3);
		TreeNode child12 = addChild(child1, 4);
		TreeNode child2 = addChild(root, 10);
		
		TreeNode commonancestor = firstCommonAncestor(child12, child2);
		System.out.println(commonancestor.data);
	}
	private static TreeNode firstCommonAncestor(TreeNode p, TreeNode q) {
		// TODO Auto-generated method stub
		int diff = getDepth(p) - getDepth(q);
		TreeNode first;
		TreeNode second;
		if(diff > 0){
			first = q;
			second = p;
		}
		else{
			first = p;
			second = q;
		}
		second = goUp(second, Math.abs(diff));
		while(first!=second && first!=null && second!=null){
			first= first.parent;
			second = second.parent;		
		}
		if(first==null || second==null)
			return null;
		return first;
	}
	private static TreeNode goUp(TreeNode second, int diff) {
		// TODO Auto-generated method stub
		while(diff > 0 && second!=null){
			second = second.parent;
			diff--;
		}
		return second;
	}
	private static int getDepth(TreeNode node) {
		// TODO Auto-generated method stub
		int depth=0;
		while(node != null){
			node = node.parent;
			depth++;
		}
		return depth;
	}

}
