import java.util.EmptyStackException;


public class StackMin {

	private static class StackNode{
		int data;
		int min;
		StackNode next;
		
		public StackNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	StackNode top;
	
	private void push(int item){
		StackNode newnode = new StackNode(item);
		if(top==null)
			newnode.min=newnode.data;
		else
		{
			if(newnode.data < top.min)
				newnode.min = newnode.data;
			else
				newnode.min = top.min;
		}
		newnode.next=top;
		top=newnode;
	}
	
	private int pop(){
		if(top==null)
			throw new EmptyStackException();
		int item = top.data;
		top=top.next;
		return item;
	}
	
	private int getMin(){
		return top.min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMin st = new StackMin();
		st.push(4);		
		st.push(3);
		st.push(2);
		int min = st.getMin();
		System.out.println("Min: "+min);
		st.pop();
		min = st.getMin();
		System.out.println("Min: "+min);
		st.pop();
		min = st.getMin();
		System.out.println("Min: "+min);

	}

}
