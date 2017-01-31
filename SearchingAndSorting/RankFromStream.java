import java.util.Scanner;


public class RankFromStream {

	/**
	 * @param args
	 */
	static class Node{
		int leftsize=0;
		static int data;
		static Node left;
		static Node right;
		
		Node root=null;
		Node(int data){
			this.data=data;		
		}
		private void insert(int ele) {
			// TODO Auto-generated method stub
			if(ele <= data){
				if(left==null)
					left = new Node(ele);
				else
					left.insert(ele);
				leftsize++;
			}
			else{
				if(right==null)
					right= new Node(ele);
				else
					right.insert(ele);
			}
		}
	/*	private void track(int ele) {
			// TODO Auto-generated method stub
			if(root==null)
				root= new Node(ele);
			else
				root.insert(ele);
		}*/
		public int getRank(int x){
			if(x == data)
				return leftsize;
			else{
				if(x < data){
					if(left==null)
						return -1;
					return left.getRank(x);
				}
				else{
					if(right==null)
						return -1;
					else{
						int right_rank= right.getRank(x);
						if(right_rank==-1)
							return -1;
						else
							return leftsize+1+right_rank;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node root=null;
		int period=1;
		for(int i=0;i<n;i++){
			int x = scan.nextInt();
			if(root==null)
				root= new Node(x);
			else
				root.insert(x);
			int rank;
			if(period%2==0)
				rank = root.getRank(x);
			period++;
		}
	}
	
	

}
