
public class ReturnKthToLast {

	/**
	 * @param args
	 */
	private static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	private void display(Node head){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print(current+"\n");
	}
	private void returnKthToLast(Node head, int pos){
		Node current=head;
		int count=1;
		while(count!=pos)
		{
			current=current.next;
			count++;
		}
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print(current);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(8);
		Node third = new Node(5);
		Node fourth = new Node(4);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		
		ReturnKthToLast L = new ReturnKthToLast();
		L.display(head);
		
		L.returnKthToLast(head, 3);
		//L.display(head);
	}

}
