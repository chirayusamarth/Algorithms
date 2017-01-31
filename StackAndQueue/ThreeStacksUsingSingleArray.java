import java.util.EmptyStackException;


public class ThreeStacksUsingSingleArray {

	/**
	 * @param args
	 */
	private int numberOfStacks=3;
	private int stackCapacity;
	private int values[];
	private int sizes[];
	
	public ThreeStacksUsingSingleArray(int stackSize){
		stackCapacity=stackSize;
		values= new int[stackCapacity * numberOfStacks];
		sizes = new int[numberOfStacks];
	}
	
	public void push(int stackNum, int value) throws Exception{
		if(sizes[stackNum]==stackCapacity)
			throw new Exception();
		sizes[stackNum]++;
		values[indexOfTop(stackNum)]=value;
	}
	private int indexOfTop(int stackNum) {
		// TODO Auto-generated method stub
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum];
		return offset+size-1;
	}
	public int pop(int stackNum){
		if(sizes[stackNum]==0)
			throw new EmptyStackException();
		int item = values[indexOfTop(stackNum)];
		sizes[stackNum]--;
		return item;
	}
	public int peek(int stackNum){
		return values[indexOfTop(stackNum)];
	}
	public void display(int stackNum){
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum];
		//int i = offset-1;
		for(int i=offset;i<=size+offset-1;i++){
			System.out.println(values[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThreeStacksUsingSingleArray st = new ThreeStacksUsingSingleArray(5);
		st.push(0, 1);
		st.push(0, 2);
		st.push(1, 10);
		st.push(2, 20);
		st.pop(0);
		st.display(0);
		st.display(1);
		st.display(2);
	}

}
