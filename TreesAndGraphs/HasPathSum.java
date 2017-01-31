//Given a binary tree and a number, 
//return true if the tree has a root-to-leaf path such that adding up 
//all the values along the path equals the given number. Return false if no such path can be found.

public class HasPathSum {

	/**
	 * @param args
	 */
	// Java program to print to print root to leaf path sum equal to
	// a given number

	/* A binary tree node has data, pointer to left child
	and a pointer to right child */
	static class Node 
	{
		int data;
		Node left, right;

		Node(int item) 
		{
			data = item;
			left = right = null;
		}
	}

	

		Node root;
		
		/*
		Given a tree and a sum, return true if there is a path from the root
		down to a leaf, such that adding up all the values along the path
		equals the given sum.

		Strategy: subtract the node value from the sum when recurring down,
		and check to see if the sum is 0 when you run out of tree.
		*/

		boolean haspathSum(Node node, int sum) 
		{
			boolean ans = false;
			if (node == null)
				return (sum == 0);
			else
			{

				/* otherwise check both subtrees */
				int subsum = sum - node.data;
				if (subsum == 0 && node.left == null && node.right == null)
					return true;
				if (node.left != null)
					ans = ans || haspathSum(node.left, subsum);
				if (node.right != null)
					ans = ans || haspathSum(node.right, subsum);
			}
			return ans;
		}
		
		/* Driver program to test the above functions */
		public static void main(String args[]) 
		{
			int sum = 23;
			
			/* Constructed binary tree is
				10
				/ \
			8	 2
			/ \ /
			3 5 2
			*/
			HasPathSum tree = new HasPathSum();
			tree.root = new Node(10);
			tree.root.left = new Node(8);
			tree.root.right = new Node(2);
			tree.root.left.left = new Node(3);
			tree.root.left.right = new Node(5);
			tree.root.right.left = new Node(2);

			if (tree.haspathSum(tree.root, sum))
				System.out.println("There is a root to leaf path with sum " + sum);
			else
				System.out.println("There is no root to leaf path with sum " + sum);
		}
}