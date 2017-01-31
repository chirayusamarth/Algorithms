import java.util.NoSuchElementException;


public class QueueUsingLinkedList {

	private static class QueueNode{
		int data;
		QueueNode next;
		
		public QueueNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	static QueueNode first;
	static QueueNode last;
	private  void add(int item){
		QueueNode newnode = new QueueNode(item);
		if(last!=null)
			last.next = newnode;
		last=newnode;
		if(first==null)
			first=last;
	}
	private  int delete(){
		if(first==null)
			throw new NoSuchElementException();
		int item = first.data;
		first=first.next;
		if(first==null)
			last=null;
		return item;
	}
	private  int peek(){
		if(first==null)
			throw new NoSuchElementException();
		return first.data;
	}
	private void display(){
		QueueNode current=first;
		while(current!=null){
			System.out.print(current.data+"  ");
			current=current.next;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList L = new QueueUsingLinkedList();
		L.add(3);
		L.add(4);
		L.add(5);
		L.add(6);
		L.display();
		int x = L.delete();
		System.out.println("Deleted element "+x);
		L.display();
		x = L.peek();
		System.out.println("Top element "+x);
		L.display();

	}

}
