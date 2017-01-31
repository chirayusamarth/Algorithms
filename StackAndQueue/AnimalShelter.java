import java.util.*;


public class AnimalShelter {

	/**
	 * @param args
	 */
	private static void enqueue(LinkedList L, String item){
		L.addLast(item);
	}
	private static String dequeueAny(LinkedList L){
		if(L.isEmpty())
			return null;
		return (String) L.removeFirst();
	}
	private static boolean dequeueDog(LinkedList L){
		if(!L.contains("Dog"))
			return false;
		return L.removeFirstOccurrence("Dog");
	}
	private static boolean dequeueCat(LinkedList L){
		if(!L.contains("Cat"))
			return false;
		return L.removeFirstOccurrence("Cat");
	}
	private static void display(LinkedList L){
		System.out.println("-----------------------");
		ListIterator itr = L.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList L = new LinkedList();
		L.add("Dog");
		L.add("Cat");
		L.add("Cat");
		L.add("Cat");
		L.add("Dog");
		L.add("Dog");
		L.add("Cat");
		L.add("Dog");
		display(L);
		enqueue(L, "Dog");
		display(L);
		dequeueAny(L);
		display(L);
		dequeueCat(L);
		display(L);
		dequeueDog(L);
		display(L);
	}

}
