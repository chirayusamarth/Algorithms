/*

Design a Phone Directory which supports the following operations:

get: Provide a number which is not assigned to anyone.
check: Check if a number is available or not.
release: Recycle or release a number.

*/

public class PhoneDirectory{

	int totalNum;
	Set<Integer> assigned_nums;
	Queue<Integer> available_nums;
	
	public PhoneDirectory(int maxNumbers){
		available_nums= new LinkedList<Integer>();
		assigned_nums= new HashSet<Integer>();
		for(int i=0;i<maxNumbers;i++){
			available_nums.offer(i);
		}
		totalNum = maxNumbers - 1;
	}

	public int get(){
		if(!available_nums.isEmpty())
		{
			int num = available_nums.poll()
			assigned_nums.add(num);
			return num;
		}
		return -1;
	}

	public boolean isAvailable(int number){
		return !available_nums.contains(number) && number <= totalNum;
	}

	public void release(int num){
		if(assigned_nums.contains(num)){
			assigned_nums.remove(num);
			available_nums.offer(num);
		}
	}
}
