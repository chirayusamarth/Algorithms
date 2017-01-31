import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Heap {

	private static ArrayList<Integer> a = new ArrayList<Integer>();
	
	/*public Heap(){
		a = new ArrayList<Integer>();
	}*/
	
	private static void insert(int ele){
		a.add(ele);
		shiftUp();
	}
	
	private static void shiftUp() {
		// TODO Auto-generated method stub
		int k = a.size()-1;
		while(k>0){
			int p = (k-1)/2;
			Integer child = a.get(k);
			Integer parent = a.get(p);
			if(a.get(k) < a.get(p) ){
				a.set(k, parent);
				a.set(p, child);
				k=p;
			}
			else{
				break;
			}
		}
	}
	
	
	
	
	
	private static void delete(int ele){
		int index = a.indexOf(ele);
		//a.remove(index);
		int temp = a.get(a.size()-1);
		a.set(index, temp);
		a.remove(a.size()-1);
		int pindex = (index-1)/2;

		
		//if(pindex >= 0 && !a.isEmpty()){
		if(pindex < a.size()){
			while(index > 0){
				int parent = a.get(pindex);
				if(temp < parent){
					a.set(pindex, temp);
					a.set(index, parent);
				}
				else
					break;
			}
		}
		int lindex = (2*index)+1;
		int rindex = (2*index)+2;
		while(lindex < a.size()){//if left child exists
			rindex= lindex+1; // 2*k + 2
			int left = a.get(lindex);
			int min= lindex;
			if(rindex < a.size()){//if right child exists
				int right = a.get(rindex);
				if(right < left)
					min = rindex;
			}
			if(a.get(index) > a.get(min)){
				Integer temp1 = a.get(min);
				a.set(min, a.get(index));
				a.set(index, temp1);
				index= min;
				lindex= (2*index) + 1;
			}
			else
				break;
		}

		
		
			/*int index = a.indexOf(ele);
			//a.remove(index);
			int last = a.get(a.size()-1);
			if(last == ele)
				a.remove(index);
			else{
				a.set(index, last);
				a.remove(a.size()-1);
				if(index==0)
				{
					shiftDown();
				}
				else{
					while(index > 0){
						int child = a.get(index);
						int parentIndex = (index - 1)/2;
						Integer parent = a.get(parentIndex);
						if(child < parent){
							a.set(index, parent);
							a.set(parentIndex, child);
							index = parentIndex;
						}
						else{
							break;
						}
					}
				}
			}*/
		}
		/*if(a.size()==1)
			a.remove(0);
		int root = a.get(0);
		a.set(0, a.get(a.size()-1));
		a.remove(a.size()-1);
		shiftDown();*/
	

	private static void shiftDown() {
		// TODO Auto-generated method stub
		int k=0;
		int l= 2*k + 1;
		while(l < a.size()){//if left child exists
			int r= l+1; // 2*k + 2
			int min= l;
			if(r < a.size()){//if right child exists
				if(a.get(r) < a.get(min))
					min = r;
			}
			if(a.get(k) > a.get(min)){
				Integer temp = a.get(min);
				a.set(min, a.get(k));
				a.set(k, temp);
				k= min;
				l= 2*k + 1;
			}
			else
				break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0;i<q;i++){
			int t = scan.nextInt();
			switch(t){
			case 1:
					int v = scan.nextInt();
					insert(v);
					break;
			case 2:
					v = scan.nextInt();
					delete(v);
					break;
			case 3:
					System.out.println(a.get(0));
					break;
			}
		}
		scan.close();
		/*Heap hp = new Heap();
		hp.insert(4);
		
		hp.insert(3);

		
		hp.delete();
		
		hp.insert(7);
		for(int itr: hp.a)
			System.out.print(itr+" ");*/
	}
}
