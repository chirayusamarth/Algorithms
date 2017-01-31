
public class MergeKLists {

	private static class Node {
	     int data;
	     Node next;
	     

	 	public Node(int data){
	 		this.data = data;
	 		this.next=null;
	  }
	
	
	public Node() {
			// TODO Auto-generated constructor stub
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
	
	private static Node mergeKLists(Node arr[], int last){
		
		while(last!=0){
			int i=0;
			int j=last;
			
			while(i<j){
				
				arr[i] = MergeLists(arr[i],arr[j]);
				
				i++;
				j--;
				
				if(i>=j)
					last=j;
			}
		}
		return arr[0];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=4;
		
		Node arr[] = new Node[3];
		arr[0] = new Node(1);
		arr[0].next= new Node(3);
		arr[0].next.next = new Node(5);
	    arr[0].next.next.next = new Node(7);

	    arr[1] = new Node(2);
	    arr[1].next = new Node(4);
	    arr[1].next.next = new Node(6);
	    arr[1].next.next.next = new Node(8);

	    arr[2] = new Node(0);
	    arr[2].next = new Node(9);
	    arr[2].next.next = new Node(10);
	    arr[2].next.next.next = new Node(11);

		arr[0] = mergeKLists(arr,k-1);
		display(arr[0]);
		
	}
	
}

}
