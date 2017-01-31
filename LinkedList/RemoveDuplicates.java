import java.util.*;


public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList n = new LinkedList();
		n.add(10);
		n.add(5);
		n.add(3);
		n.add(5);
		n.add(6);
		n.add(6);
		n.add(8);
		n.add(3);
		n.add(2);
		n.add(1);
		n.add(10);
		System.out.print(n);
		removeDuplicates(n);
		
				
	}

	private static void removeDuplicates(LinkedList n) {
		// TODO Auto-generated method stub
		//LinkedHashSet maintains the insertion order
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int size = n.size();
		for(int i=0;i<size;i++){
			if(set.contains(n.get(i))){
				continue; //don't add into Hashset
			}
			else{
				int val = (Integer) n.get(i);
				set.add(val);
			}
		}
		System.out.println(set);
	}

}
