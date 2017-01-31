
public class MergingLinkedLists {

	/**
	 * @param args
	 */
	private static class Node {
	     int data;
	     Node next;
	  }
	
	private static Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	    Node current1=headA;
	    Node current2=headB;
	    Node head3=null;
	    Node current3 = head3;
	    while(current1!=null && current2!=null){
	        if(current1.data < current2.data){
	            Node temp=new Node();
	            temp.data = current1.data;
				if(head3==null){
					head3=temp;
				}
				else{
					current3=head3;
					while(current3.next!=null)
						current3=current3.next;
					current3.next=temp;
				}
	            current1=current1.next;
	        }
	        else{
	           // current3.data=current2.data;
	            Node temp=new Node();
	            temp.data = current2.data;
				if(head3==null){
					head3=temp;
				}
				else{
					current3=head3;
					while(current3.next!=null)
						current3=current3.next;
					current3.next=temp;
				}
	            current2=current2.next;
	        }
	        
	    }
	    while(current1!=null){
	    	Node temp=new Node();
            temp.data = current1.data;
			if(head3==null){
				head3=temp;
			}
			else{
				current3=head3;
				while(current3.next!=null)
					current3=current3.next;
				current3.next=temp;
			}
            current1=current1.next;
	    }
	    while(current2!=null){
	    	Node temp=new Node();
            temp.data = current2.data;
			if(head3==null){
				head3=temp;
			}
			else{
				current3=head3;
				while(current3.next!=null)
					current3=current3.next;
				current3.next=temp;
			}
            current2=current2.next;
	    }
	    return head3;
	}

	private static void display(Node head){
		if(head==null)
			return;
		Node current = head;
		while(current!=null){
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.print(current+"\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node headA = new Node();
		Node second1 = new Node();
		Node third1 = new Node();
		headA.data=1;
		second1.data=3;
		third1.data=5;
		headA.next=second1;
		second1.next=third1;
		
		Node headB = new Node();
		Node second2 = new Node();
		Node third2 = new Node();
		headB.data=2;
		second2.data=4;
		third2.data=6;
		headB.next=second2;
		second2.next=third2;
		
		display(headA);
		display(headB);
		
		Node head3 = MergeLists(headA, headB);
		display(head3);
	}

}
