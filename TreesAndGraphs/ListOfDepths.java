import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class ListOfDepths {

	/**
	 * @param args
	 */
	private static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	public static int getlevel(Node node){
		if(node==null)
			return 0;
		else{
			int llevel = getlevel(node.left);
			int rlevel = getlevel(node.right);
			
			return (Math.max(llevel, rlevel))+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(8);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.right.left = new Node(6);
		root.right.right = new Node(9);
		
		int depth = getlevel(root);
		//System.out.println(depth);
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		createLinkedListOfNodes(root, 0, lists);
	}
	private static void createLinkedListOfNodes(Node root, int level, ArrayList<LinkedList<Node>> lists) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		LinkedList<Node> list = null;
		if(lists.size() == level){
			list = new LinkedList<Node>();
			lists.add(list);
			list.add(root);
		}
		else{
			list = lists.get(level);
			list.add(root);
		}
		createLinkedListOfNodes(root.left, level+1, lists);
		createLinkedListOfNodes(root.right, level+1, lists);
	}

}
