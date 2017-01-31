
public class DeleteMiddleNode {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating LL
		DeleteMiddleNode L = new DeleteMiddleNode();
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		L.display(head);
		
		//Delete a random node, other than first and last node(not necessarily middle node)
		head = L.deleteMiddleElement(head);
		L.display(head);
	}

}
