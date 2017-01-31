
public class SumLists {

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
	private int getSize(Node head){
		Node current=head;
		int count=1;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
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
	private Node sumLists(Node head1, Node head2){
		Node head3=null;
		Node curr1=head1;
		Node curr2=head2;
		Node temp = new Node(0);
		int val=0;
		int size1=getSize(head1);
		int size2=getSize(head2);
		if(size1 < size2){
			while(size1!=size2){
				while(curr1.next!=null){
					curr1=curr1.next;
				}
				curr1.next=new Node(temp.data);
				size1=getSize(head1);
			}
			display(head1);
		}
		if(size1 > size2){
			while(size1!=size2){
				while(curr2.next!=null){
					curr2=curr2.next;
				}
				curr2.next=new Node(temp.data);
				size2=getSize(head2);
			}
			display(head2);
		}
		System.out.println("-----------------");
		curr1=head1;
		curr2=head2;
		while(curr1!=null || curr2!=null){
			temp.data = curr1.data + curr2.data + val;
			val = temp.data/10;
			temp.data = temp.data % 10;

			if(head3==null){
				head3=new Node(temp.data);
			}
			else{
				Node curr3=head3;
				while(curr3.next!=null){
					curr3=curr3.next;
				}
				curr3.next=new Node(temp.data);
			}
			curr1=curr1.next;
			curr2=curr2.next;
		}
		if(val==1){
			Node curr3=head3;
			while(curr3.next!=null){
				curr3=curr3.next;
			}
			curr3.next=new Node(val);
		}
		return head3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumLists L = new SumLists();
		
		Node head1 = new Node(9);
		Node second1 = new Node(7);
		Node third1 = new Node(8);
		head1.next=second1;
		second1.next=third1;
		
		Node head2 = new Node(6);
		Node second2 = new Node(8);
		Node third2 = new Node(5);
		head2.next=second2;
		second2.next=third2;
		
		L.display(head1);
		L.display(head2);
		
		Node head3 = L.sumLists(head1, head2);
		L.display(head3);
		
		
		
		//Follow up
		System.out.println("\nDigits stored in forward order: ");
		 head1 = new Node(8);
		 second1 = new Node(7);
		 third1 = new Node(9);
		head1.next=second1;
		second1.next=third1;
		
		 head2 = new Node(5);
		 second2 = new Node(8);
		 third2 = new Node(6);
		head2.next=second2;
		second2.next=third2;
		
		L.display(head1);
		L.display(head2);
		
		head1 = L.reverseLL(head1);
		head2 = L.reverseLL(head2);
		
		 head3 = L.sumLists(head1, head2);
		//L.display(head3);
		head3 = L.reverseLL(head3);
		L.display(head3);
	}

}
