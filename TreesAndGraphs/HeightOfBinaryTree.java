import java.util.Scanner;


public class HeightOfBinaryTree {

	/**
	 * @param args
	 */	
	private static class Node {
	    Node left;
	    Node right;
	    int data;
	    
	    Node(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

	static int getHeight(Node root) {
      	// Write your code here.
        int ldepth=1;
        int rdepth=1;
        if(root==null)
            return -1;
        ldepth += getHeight(root.left);
        rdepth += getHeight(root.right);

        return Math.max(ldepth, rdepth);
    }
    static int height(Node root){
        int h = 0;
        h += getHeight(root);
        return h;
    }
    public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
