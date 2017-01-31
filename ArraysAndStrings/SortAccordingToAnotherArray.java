import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class SortAccordingToAnotherArray {

	/**
	 * @param args
	 */
	//http://www.geeksforgeeks.org/sort-array-according-order-defined-another-array/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		int a1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8, 7, 5, 6, 9, 7, 5, 4};
		 int n = a1.length;
	      int a2[] = {2, 4, 1, 8, 3};
	      int a3[]= new int[n];
		int k=0;
		int temp;
		for(int i=0;i<5;i++){
			for(int j=0;j<n;j++){
				if(a1[j]==a2[i]){
					a3[k] = a1[j];
					for(int c=j;c<n-1;c++)
						a1[c]=a1[c+1];
					a1[n-1]=0;
					temp = a1[k];
					a1[k]=a1[j];
					a1[j]=temp;
					k++;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(a3[i]+" ");
		}*/
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int a1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8, 7, 5, 6, 7, 5, 4};
		int n = a1.length;
	    int a2[] = {2, 4, 9, 8, 3};
	    int a3[]= new int[n];
	    for(int i=0;i<n;i++){
	    	if(hm.containsKey(a1[i])){
	    		hm.replace(a1[i], hm.get(a1[i])+1);
	    	}
	    	else{
	    		int count=0;
	    		count+=1;
	    		hm.put(a1[i], count);
	    	}
	    }
	    for(Map.Entry entry: hm.entrySet()){
	    	System.out.print(entry.getKey()+" "+entry.getValue());
	    	System.out.println();
	    }
	    int j=0;
	    int k=0;
	    int count=0;
	    for(int i=0;i<5;i++){
	    	if(hm.containsKey(a2[i])){
	    		count = hm.get(a2[i]);
	    		for(k=j;k<j+count;k++)
	    		{
	    			a3[k]=a2[i];
	    		}
	    		j=k;
	    		hm.remove(a2[i]);
	    	}
	    }
	    for(Map.Entry entry: hm.entrySet())
	    	System.out.print(entry.getKey()+" "+entry.getValue());
	    TreeMap<Integer, Integer> tm = new TreeMap<Integer,Integer>(hm);
	    for(int r: tm.keySet()){
	    	count = hm.get(r);
	    	for(k=j;k<j+count;k++)
    		{
    			a3[k]=r;
    		}
    		j=k;
    		hm.remove(r);
	    }
	    System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(a3[i]+" ");
		}
		
	}

}
