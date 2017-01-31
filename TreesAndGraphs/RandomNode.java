import java.util.Random;


public class RandomNode {

	/**
	 * @param args
	 */
	private static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		int size;
		
		public TreeNode(int data){
			this.data=data;
			size=1;
		}
		public void insert(int d){
			if(d<=data){
				if(left==null)
					left = new TreeNode(d);
				else
					left.insert(d);
			}
			else{
				if(right==null)
					right = new TreeNode(d);
				else
					right.insert(d);
			}
			size++;
		}
		public TreeNode find(int d){
			if(d == data)
				return this;
			else{
				if(left!=null)
					left.find(d);
				else{
					if(right!=null)
						right.find(d);
				}
			}
			return null;
		}
		public TreeNode getRandomNode(){
			int leftSize = left==null ? 0 : left.size();
			Random rnd = new Random();
			int index = rnd.nextInt(size);
			if(index < leftSize){
				return left.getRandomNode();
			}
			else{
				if(index == leftSize)
					return this;
				else
					return right.getRandomNode();
			}
		}
		
		public int size(){
			return size;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.insert(3);
		root.insert(8);
		
		TreeNode random = root.getRandomNode();
		System.out.println(random.data);
	}

}
