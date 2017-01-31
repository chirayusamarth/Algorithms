import java.util.Scanner;


public class StackMax {

	private static class StackNode{
		int data;
		int max;
		StackNode next;
		
		public StackNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	StackNode top;
	public void push(int item){
		StackNode newnode = new StackNode(item);
		if(top==null)	
			newnode.max=item;
		else{
			if(newnode.data > top.max)
				newnode.max=newnode.data;
			else
				newnode.max=top.max;
		}
		newnode.next=top;
		top=newnode;
	}
	
	public int pop(){
		if(top==null)
			return -1;
		int item=top.data;
		top=top.next;
        return item;
	}
	public int getMax(){
		return top.max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMax s = new StackMax();
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        //Stack<Integer> s = new Stack<Integer>();
        
        for(int i=0;i<N;i++){
            int t = scan.nextInt();
            switch(t) {
	            case 1:
	                    int item = scan.nextInt();
	                    s.push(item);
	                    break;
	            case 2:
	                    s.pop();
	                    break;
	            case 3:
	                    int m = s.getMax();
	                    System.out.println(m);
	                    break;
            }
        }
        scan.close();
	}
	

}
