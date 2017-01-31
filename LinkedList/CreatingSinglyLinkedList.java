
public class CreatingSinglyLinkedList {

	//private Node head;
	private static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void display(Node head){
		if(head==null)
			return;
		Node current = head;
		while(current!=null){
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.print(current+"\n");
	}
	public Node insertAtBeginning(Node head, int data){
		Node newNode = new Node(data);
		if(head==null)
			head = newNode;
		else{
			newNode.next=head;
			head = newNode;
		}
		return head;
		
	}
	private Node insertAtPosition(Node head, int data, int pos) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if(pos==1){
			newNode.next=head;
			head=newNode;
			return head;
		}
		else{
			Node prev = head;
			Node current;
			int count = 1;
			while(count < pos-1){
				prev=prev.next;
				count++;
			}
			current = prev.next;
			newNode.next = current;
			prev.next = newNode;
			return head;
		}
	}
	private Node insertAtEnd(Node head, int data){
		Node newNode = new Node(data);
		if(head==null)
			return newNode;
		else{
			Node current = head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=newNode;
			return head;
		}
	}
	private Node deleteFirstNode(Node head){
		if(head==null)
			return null;
		else{
			Node current = head;
			head=current.next;
		//	current.next=null;
			return head;
		}
	}
	private Node deleteFromPosition(Node head, int pos){
		if(pos==1){
			Node current=head;
			head=current.next;
			current.next=null;
			return head;
		}
		else{
			Node prev = head;
			int count = 1;
			while(count<pos-1){
				prev=prev.next;
				count++;
			}
			Node current=prev.next;
			prev.next=current.next;
			current.next=null;
			return head;
		}
	}
	private Node deleteFromLast(Node head){
		if(head==null)
			return null;
		else{
			Node current=head.next;
			Node prev=head;
			while(current.next!=null){
				current=current.next;
				prev=prev.next;
			}
			prev.next=null;
			return head;
		}
	}
	public Node reverseLL(Node head){
		if(head==null)
			return head;
		else {
			Node current = head;
			Node prev = null;
			Node next = null;
			while(current!=null){
				next = current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			return prev;
		}
	}
	public boolean search(Node head, int x){
		if(head==null)
			return false;
		else{
			Node current = head;
			while(current!=null){
				if(current.data==x)
					return true;
				current=current.next;
			}
			return false;
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating nodes
		Node head = new Node(10);
		Node second = new Node(8);
		Node third = new Node(4);
		
		//Attaching links
		head.next = second;
		second.next= third;

		//Printing elements of LL
		CreatingSinglyLinkedList L = new CreatingSinglyLinkedList();
		L.display(head);
		
		//Inserting new node(say having data=5) at the beginning
		head = L.insertAtBeginning(head, 5);
		L.display(head);
		
		//Inserting a new node(15) at position(3)
		head = L.insertAtPosition(head, 15, 3);
		L.display(head);
		
		//Inserting (1) at the end of LL
		head = L.insertAtEnd(head, 1);
		L.display(head);
		
		//Delete 1st node from LL
		head = L.deleteFirstNode(head);
		L.display(head);
		
		//Delete node at position 2
		head=L.deleteFromPosition(head, 2);
		L.display(head);
		
		head=L.deleteFromLast(head);
		L.display(head);
		
		//Search an element in LL
		boolean ans = L.search(head, 8);
		System.out.println(ans);
		
		//Reversing LL
		Node prev = L.reverseLL(head);
		L.display(prev);
		
		
	}

}
