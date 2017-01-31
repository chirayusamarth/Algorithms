
public class SortStack {

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
		
		private boolean isEmpty(){
			if(top==null)
				return true;
			return false;
		}

	
	public static SortStack sortedStack(SortStack s1){
		SortStack s2 = new SortStack();
		//Push elements from s1 into s2 in sorted order (ascending)
		while(!s1.isEmpty()){
			int temp = s1.pop();
			while(!s2.isEmpty() && s2.peek() > temp){
				s1.push(s2.pop());
			}
			s2.push(temp);
		}
		
		// To make the smallest elements point to top, pop all the elements from s2 and push into s1
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		return s1;
		
	}
	private static void display(SortStack s2){
		StackNode curr=s2.top;
		System.out.print("Sorted Stack: ");
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			SortStack s1 = new SortStack();
			
			s1.push(5);
			s1.push(8);
			s1.push(9);
			s1.push(7);
			s1.push(3);
			s1.push(2);
			SortStack s2 = sortedStack(s1);
			display(s2);
	}

}
