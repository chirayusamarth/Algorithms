import java.util.ArrayList;


public class CheckSubtree {

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
		TreeNode root1 = new TreeNode(3);
		TreeNode left1 = new TreeNode(1);
		root1.left=left1;
		TreeNode right1 = new TreeNode(6);
		root1.right= right1;
		/*TreeNode left11 = new TreeNode(1);
		left1.left = left11;
		TreeNode right12 = new TreeNode(4);
		left1.right = right12;*/
		right1.left = new TreeNode(4);
		right1.right = new TreeNode(9);
		right1.right.right = new TreeNode(7);
		/*TreeNode left13 = new TreeNode(7);
		right1.left=left13;*/
		
		TreeNode root2 = new TreeNode(6);
		root2.left = new TreeNode(3);
		root2.left.left = new TreeNode(1);
		root2.left.right= new TreeNode(4);
		root2.right = new TreeNode(9);
		root2.right.left= new TreeNode(7);
		/*TreeNode right21 = new TreeNode(3);
		root2.right= right21;
		TreeNode left22 = new TreeNode(7);
		right21.left = left22;*/
		
		boolean ans = isSubtree(root2, root1);
		System.out.println(ans);
	}
	private static boolean isSubtree(TreeNode root2, TreeNode root1) {
		// TODO Auto-generated method stub
		ArrayList<TreeNode> in1 = new ArrayList<TreeNode>();
		in1 = inorder(root1, in1);
		for(int i=0;i<in1.size();i++){
			//System.out.println(i.data);
			TreeNode temp1 = in1.get(i);
			if(temp1.data == root2.data){
				ArrayList<TreeNode> in2 = new ArrayList<TreeNode>();
				in2 = inorder(root2, in2);
				int k=i;
				for(int j=0;j<in2.size();j++){
					TreeNode temp3 = in1.get(k);
					TreeNode temp2 = in2.get(j);
					if(temp3.data!=temp2.data)
						return false;
					k++;
				}
				return true;
			}
		}
		return false;
	}
	private static ArrayList<TreeNode> inorder(TreeNode node, ArrayList<TreeNode> in1) {
		// TODO Auto-generated method stub
		if(node==null){
			TreeNode t = new TreeNode('X');
			in1.add(t);
			return in1;
		}
		in1 = inorder(node.left, in1);
		in1.add(node);
		in1 = inorder(node.right, in1);
		return in1;
	}

}
