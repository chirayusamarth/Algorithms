
public class Palindrome {

	private static class Node{
		String data;
		Node next;
		
		public Node(String data){
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
	private Node reverseLL(Node head){
		if(head==null)
			return null;
		else{
			Node current = head;
			Node prev = null;
			Node next = null;
			while(current!=null){
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			return prev;
		}
	}
	
	private boolean isPalindrome(Node head, Node rev){
		Node curr1= head;
		Node curr2= rev;
		while(curr1!=null && curr2!=null){
			if(curr1.data!=curr2.data)
				return false;
			curr1=curr1.next;
			curr2=curr2.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node("A");
		Node second = new Node("B");
		Node third = new Node("C");
		Node fourth = new Node("B");
		Node fifth = new Node("A");
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		Palindrome L = new Palindrome();
		L.display(head);
		
		Node rev = L.reverseLL(head);
		L.display(rev);
		boolean ans = L.isPalindrome(head, rev);
		System.out.println(ans);
	}

}
