public class MinHeap{
	int[] elements = new int[];
	int size = 0;
	int capacity = 10;

	public boolean hasLeftChild(int index){
		return getLeftChildIndex(index) < size;
	}

	public boolean hasParent(int index){
		return getParentIndex(index) < size;
	}

	public int getLeftChildIndex(int parentIndex){
		return 2*parentIndex + 1;
	}

	public int getRightChildIndex(int parentIndex){
		return 2*parentIndex + 2;
	}

	public int getParentIndex(int childIndex){
		return (childIndex - 1)/2;
	}

	public int getParent(int childIndex){
		return elements[getParentIndex(childIndex)];
	}

	public int getLeftChild(int parentIndex){
		return elements[2*parentIndex + 1;];
	}

	public void swap(int one, int two){
		int temp= elements[one];
		elements[one] = elements[two];
		elements[two] = temp;
	}

	public void ensureCapacity(){
		if(size == capacity){
			elements= Arrays.copyOf(elements, capacity*2);
			capacity *= 2;
		}
	}

	public int peek(){
		int item = elements[0];
		return item;
	}

	public int poll(){
		if(size == 0)
			return -1;
		int item = elements[0];
		elements[0] = elements[size-1];
		size--;
		heapifyDown();
		return item;
	}

	public void heapifyDown(){
		int index = 0;

		while(hasLeftChild(index)){
			int smallerIndex= getLeftChildIndex(index);
			if(hasRightChildIndex(index) && getRightChild(index) < getLeftChild(index)){
				smallerIndex= getRightChildIndex(index)
			}
			if(elements[index] > elements[smallerIndex]){
				swap(index, smallerIndex);
				index = smallerIndex;
			}
			else
				break;
		}
	}

	public void add(int val){
		ensureCapacity();
		elements[size] = val;
		size++;
		heapifyUp();
	}

	public void heapifyUp(){
		int index = size-1;
		while(hasParent(index)){
			if(getParent(index) > elements[index]){
				swap(index, getParentIndex(index));
				index = getParentIndex(index);
			}
			else{
				break;
			}
		}
	}
}