
public class StackUsingLinkedList {

	private static class StackNode{
		int data;
		StackNode next;
		
		public StackNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	StackNode top;
	
	private void push(int item){
		StackNode newnode = new StackNode(item);
		newnode.next=top;
		top=newnode;
	}
	
	private int pop(){
		int item = top.data;
		top=top.next;
		return item;
	}
	
	private int peek(){
		return top.data;
	}
	
	@SuppressWarnings("unused")
	private boolean isEmpty(){
		if(top==null)
			return true;
		return false;
	}
	
	private void display(){
		StackNode curr=top;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		//System.out.print(top);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList L = new StackUsingLinkedList();
		L.push(3);
		L.push(5);
		L.push(6);
		L.display();
		int x = L.pop();
		System.out.println("\nPopped Element "+x+"\n");
		L.display();
		x = L.peek();
		System.out.println("Top Element "+x+"\n");
		x = L.pop();
		System.out.println("Popped Element "+x+"\n");
		L.display();
	}

}
