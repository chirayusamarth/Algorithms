// Two Sum III Data structure design
/*

Design and implement a TwoSum class. It should support the following operations: add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

*/
public class TwoSum{
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public void add(int x){
		map.put(x, map.getOrDefault(x, 0)+1);
	}

	public boolean find(int value){
		for(Integer i : map.keySet()){
			int target = value - i;
			if(map.containsKey(target)){
				if(i==target && map.get(i) <= 1)
				{
					continue;
				}
				return true;
			}
		}
		return false;
	}
	
	/**
	public class FasterFindSum {
	    Set<Integer> sums = new HashSet<>();
	    List<Integer> nums = new ArrayList<>();

	    // O(n)
	    public void add(int input) {
		for (int num : nums) {
		     sums.add(input + num);
		}
		nums.add(input);
	    }

	    // O(1)
	    public boolean find(int val) {
		return sums.contains(val);
	    }
	}
	**/
}
