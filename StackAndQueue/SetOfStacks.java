import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;


public class SetOfStacks {

	static ArrayList<Stack> stacks = new ArrayList<Stack>();
	
	static void push(int item){
		Stack last = getLastStack();
		
		if(last!=null && last.capacity() > last.size())
			last.push(item);
		else{
			Stack stack = new Stack();
			stack.push(item);
			stacks.add(stack);
		}
	}
	
	static int pop(){
		Stack last = getLastStack();
		if(last==null)
			throw new EmptyStackException();
		int item = (Integer) last.pop();
		if(last.size()==0)
			stacks.remove(stacks.size()-1);
		return item;
		
	}
	static Stack getLastStack() {
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(3);
		push(7);
		push(2);
		push(44);
		push(43);
		push(34);
		push(24);
		push(42);
		push(14);
		push(41);
		push(111);
		int x = pop();
		System.out.println(x);
		x = pop();
		System.out.println(x);
		x = pop();
		System.out.println(x);
	}

	

}
