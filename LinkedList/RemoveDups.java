public class RemoveDups {

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
	private Node removeDups(Node head){
		Node prev=head;
		Node curr;
		while(prev!=null){
			curr=prev;
			while(curr.next!=null){
				if(curr.next.data==prev.data){
					curr.next=curr.next.next;
				}
				else{
					curr=curr.next;
				}
			}
			prev=prev.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating nodes
		Node head = new Node(3);
		Node second = new Node(5);
		Node third = new Node(8);
		
		//Attaching links
		head.next = second;
		second.next= third;

		//Printing elements of LL
		RemoveDups L = new RemoveDups();
		L.display(head);
		
		//Inserting new node(say having data=5) at the beginning
		head = L.insertAtBeginning(head, 10);
		L.display(head);
		
		//Inserting a new node(15) at position(3)
		head = L.insertAtPosition(head, 10, 3);
		L.display(head);
		
		//Inserting (1) at the end of LL
		head = L.insertAtEnd(head, 8);
		L.display(head);
		
		//Removing Duplicates
		head=L.removeDups(head);
		L.display(head);
		
		/*
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
		*/
		
	}
}
