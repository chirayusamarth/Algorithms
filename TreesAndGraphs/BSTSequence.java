
public class BSTSequence {

	private static class BSTNode{
		int data;
		BSTNode left;
		BSTNode right;
		
		public BSTNode(int data){
			this.data=data;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode root = new BSTNode(2);
		root.left = new BSTNode(1);
		root.right = new BSTNode(3);
		
		sequenceBST(root);
		System.out.println();
		sequenceBST1(root);
	}
	private static void sequenceBST1(BSTNode node) {
		// TODO Auto-generated method stub
		if(node!=null){
			System.out.print(node.data+" ");
			sequenceBST(node.right);
			sequenceBST(node.left);
		}
		
	}
	private static void sequenceBST(BSTNode node) {
		// TODO Auto-generated method stub
		if(node!=null){
			System.out.print(node.data+" ");
			sequenceBST(node.left);
			sequenceBST(node.right);
		}
	}

}
