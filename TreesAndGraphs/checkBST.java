import java.util.ArrayList;


public class checkBST {

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

    /*private static boolean checkBST(TreeNode root) {
        if(root==null || root.left==null || root.right==null)
            return true;
        if(root.left.data > root.data || root.data > root.right.data)
            return false;
        return checkBST(root.left) && checkBST(root.right);
    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(20);
		//root.right = new TreeNode(6);
		/*root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);*/
		
		boolean ans = checkBST(root);
		System.out.println(ans);
	}
	
    private static boolean checkBST(TreeNode root) {
        ArrayList<Integer> in = new ArrayList<Integer>();
        inOrderTraversal(root, in);
        for(int i=1; i<in.size();i++)
        	if(in.get(i) <= in.get(i-1))
        		return false;
        return true;
        
    }
    private static ArrayList<Integer> inOrderTraversal(TreeNode root, ArrayList<Integer> in){
        if(root!=null){
            inOrderTraversal(root.left, in);
            in.add(root.data);
            inOrderTraversal(root.right, in);
        }
        return in;
    }

}
