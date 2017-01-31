
public class Sample {

	/**
	 * @param args
	 */
	class Node {
	     int data;
	     Node next;
	  }
	
	    

	Node InsertNth(Node head, int data, int position) {
	   // This is a "method-only" submission. 
	    // You only need to complete this method. 
	    Node newnode=new Node();
	    newnode.data=data;
	    if(position==0){
	        newnode.next=head;
	        head=newnode;
	    }
	        else{
	            Node current=head;
	            int count=1;
	            while(count < position-1){
	                current=current.next;
	                count++;
	            }
	            Node prev = current.next;
	            //current.next=newnode;
	            current.next = new Node();
	            current.next.data = data;
	            current.next.next = prev;
	            newnode.next=prev;
	            
	        }
	    return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample L = new Sample();
		Node head = null;
		L.InsertNth(head, 3, 0);
		L.InsertNth(head, 5, 1);
		L.InsertNth(head, 4, 2);
		L.InsertNth(head, 2, 3);
		L.InsertNth(head, 10, 1); 
	}

}
