public class Partition {
	private static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	private void display(Node head){
		Node current = head;
		while(current!=null){
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print(current+"\n");
	}
	private Node deleteMiddleElement(Node head){
		if(head==null)
			return null;
		else{
			int size = getSize(head);
			int pos=size-2;	//Select a random node, other than first and last node(not necessarily middle node)
			//System.out.print(pos);
			Node prev=head;
			int count=1;
			while(count<pos-1){
				prev=prev.next;
				count++;
			}
			Node current=prev.next;
			prev.next= current.next;
			current.next=null;
			return head;
		}
	}
	private int getSize(Node head){
		Node current=head;
		int count=1;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
	}
	private Node partition(Node head, int x){
		//Create two linked lists: one having elements < x and the other having elements > x. Then merge these two linked lists.
		Node current=head;
		Node newhead=null;
		Node bighead=null;
		while(current!=null){
			if(current.data < x){
				if(newhead==null){
					newhead= new Node(current.data);
					//newhead.next=null;
				}
				else{
					Node temp=newhead;
					while(temp.next!=null){
						temp=temp.next;
					}
					Node newNode = new Node(current.data);
					temp.next=newNode;
				}
				//current=current.next;
			}
			else{
				if(bighead==null){
					bighead = new Node(current.data);
				}
				else{
					Node temp=bighead;
					while(temp.next!=null){
						temp=temp.next;
					}
					Node newNode = new Node(current.data);
					temp.next=newNode;
				}
				//current=current.next;
			}
			current=current.next;
		}
		display(newhead);
		display(bighead);
		current=newhead;
		while(current.next!=null){
			current=current.next;
		}
		current.next=bighead;
		//display(head);
		//display(newhead);
		return newhead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating LL
		Partition L = new Partition();
		Node head = new Node(3);
		Node second = new Node(5);
		Node third = new Node(8);
		Node fourth = new Node(5);
		Node fifth = new Node(10);
		Node sixth = new Node(2);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		
		L.display(head);
		
		//Partition around the value 8
		head = L.partition(head, 8);
		L.display(head);
	}
}
