
public class Intersection {

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
	private boolean isIntersection(Node head1, Node head2){
		Node curr1=head1;
		Node curr2=head2;
		while(curr1.next!=null){
			curr1=curr1.next;
		}
		Node last1=curr1;
		while(curr2.next!=null){
			curr2=curr2.next;
		}
		Node last2=curr2;
		if(last1.data==last2.data)
			return true;
		return false;
	}
	private Node findIntersectingNode(Node head1, Node head2){
		int size1=getSize(head1);
		int size2=getSize(head2);
		if(size1 > size2){
			int temp=size1-size2;
			Node curr=head1;
			int count=1;
			while(count!=temp){
				curr=curr.next;
				count++;
			}
			head1=curr.next;
			display(head1);
		}
		if(size2 > size1){
			int temp=size2-size1;
			Node curr=head2;
			int count=1;
			while(count!=temp){
				curr=curr.next;
				count++;
			}
			head2=curr.next;
			display(head2);
		}
		Node curr1=head1;
		Node curr2=head2;
		while(curr1.data!=curr2.data){
			curr1=curr1.next;
			curr2=curr2.next;
		}
		return curr1;
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
		Intersection L = new Intersection();
		Node head1 = new Node(9);
		Node second1 = new Node(7);
		Node third1 = new Node(8);
		Node fourth1 = new Node(3);
		Node fifth1 = new Node(1);
		head1.next=second1;
		second1.next=third1;
		third1.next=fourth1;
		fourth1.next=fifth1;
		
		Node head2 = new Node(6);
		Node second2 = new Node(2);
		Node third2 = new Node(8);
		Node fourth2 = new Node(3);
		Node fifth2 = new Node(1);
		head2.next=second2;
		second2.next=third2;
		third2.next=fourth2;
		fourth2.next=fifth2;
		
		L.display(head1);
		L.display(head2);
		
		boolean ans = L.isIntersection(head1, head2);
		
		if(ans!=true)
			System.out.println("No Intersection");
		else{
			Node intersectingnode = L.findIntersectingNode(head1, head2);
			System.out.println("Intersecting Node: "+intersectingnode.data);			
		}
	}

}
