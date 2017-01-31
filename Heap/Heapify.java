import java.util.*;


public class Heapify {

	static ArrayList<Integer> a = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			insert(scan.nextInt(), n);
		}
		scan.close();
		for(int itr: a)
			System.out.println(itr);
	}

	private static void insert(int ele, int n) {
		// TODO Auto-generated method stub
		a.add(ele);
		for(int i=(n-2)/2;i>=0;i--)
			Heapify(i, n);
	}

	private static void Heapify(int i, int n) {
		// TODO Auto-generated method stub
		int l= 2*i + 1;
		int r = 2*i + 2;
		int large=i;
		if(l<a.size() && a.get(l) > a.get(i)){
			large=l;
		}
		if(r<a.size() && a.get(r) > a.get(large)){
			large=r;
		}
		if(large!=i){
			int temp = a.get(large);
			a.set(large, a.get(i));
			a.set(i, temp);
			Heapify(large, n);
		}
	}
}
