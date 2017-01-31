
public class DoublyLinkedList {

	private static class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	private static Node reverseDLL(Node head){
		Node curr=head;
		while(curr!=null){
			curr=curr.next;
		}
		head=curr;
		return head;
	}
	private static void display(Node head){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(2);
		Node second = new Node(4);
		Node third = new Node(6);
		
		head.next=second;
		second.prev=head;
		second.next=third;
		third.prev=second;
		
		display(head);
		Node head1 = reverseDLL(head);
		System.out.println("-----");
		display(head1);
	}

}
