
public class LoopDetection {
	private static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
		public Node(int data, Node next){
			this.data=data;
			this.next=next;
		}
	}
	private static class CircularLL{
		Node head;
		int count;
		public void append(int x){
			count++;
			Node temp=new Node(x);
			if(head==null){
				head=temp;
				temp.next=head;
			}
			else{
				Node curr=head;
				while(curr.next!=head)
					curr=curr.next;
				curr.next=temp;
				temp.next=head;
			}
		}
		public void addAtBeg(int x){
			count++;
			Node temp = new Node(x);
			Node curr=head;
			if(head==null){
				temp.next=temp;
				head=temp;
			}
			else{
				while(curr.next!=head){
					curr=curr.next;
				}
				curr.next=temp;
				temp.next=head;
				head=temp;
			}
		}
		public void addAtPos(int pos, int x){
			count++;
			Node temp = new Node(x);
			Node curr=head;
			for(int i=0;i<pos;i++){
				if(curr.next==head)
					break;
				curr=curr.next;
			}
			temp.next=curr.next;
			curr.next=temp;
		}
		public void deleteFirst(){
			count--;
			Node curr=head;
			while(curr.next!=head)
				curr=curr.next;
			curr.next=head.next;
			head=head.next;
		}
		public void deleteAtPos(int pos){
			count--;
			Node current=head;
			Node prev=null;
			for(int i=0;i<pos;i++){
				if(current.next==head)
					break;
				prev=current;
				current=current.next;
			}
			if(pos==0)
				deleteFirst();
			else
				prev.next=current.next;
		}
		public void display(){
			Node curr=head;
			while(curr.next!=head){
				System.out.print(curr.data+" --> ");
				curr=curr.next;
			}
			System.out.print(curr.data);
		}
		public Node loopDetection() {
			// TODO Auto-generated method stub
			Node slow=head;
			Node fast=head;
			
			while(fast!=null && fast.next!=null){
				slow=slow.next;
				fast=fast.next.next;
				if(slow==fast)
					break;
			}
			
			slow=head;
			while(slow!=fast){
				slow=slow.next;
				fast=fast.next;
			}
			return fast;	
			
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Node head = new Node("A");
		Node second = new Node("B");
		Node third = new Node("C");
		Node fourth = new Node("D");
		Node fifth = new Node("E");
		Node sixth = new Node("C");
	//	Node seventh = new Node("D");
	//	Node eighth = new Node("E");
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=second;
		//sixth.next=seventh;
		//seventh.next=eighth;
	*/
		CircularLL ccl=new CircularLL();
	    ccl.addAtBeg(1);
	    ccl.append(2);
	    ccl.append(3);
	    ccl.append(4);
	    ccl.addAtPos(1, 0);
	    ccl.append(5);
	    ccl.append(12);
	    ccl.display();
		//LoopDetection ccl = new LoopDetection();
		//L.display(head);
		
		Node begin = ccl.loopDetection();
		System.out.print("\nLoop starts at "+begin.data);
	}

}
