import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MedianUpdates {

	static void median(String a[], long x[]) {
    	ArrayList<Long> numbers = new ArrayList<Long>();
    	for(int i=0;i<a.length;i++){
    		if(numbers.isEmpty() && a[i].equals("r"))
    			System.out.println("Wrong!");
    		else{
    			if(a[i].equals("a")){
    				numbers.add(x[i]);
    				calculateMedian(numbers);
    			}
    			if(a[i].equals("r")){
    				if(!numbers.contains(x[i]))
    					System.out.println("Wrong!");
    				else{
    					int k = numbers.indexOf(x[i]);
    					numbers.remove(k);
    					if(numbers.isEmpty())
    						System.out.println("Wrong!");
    					else
    						calculateMedian(numbers);
    				}
    			}
    			
    		}
    	}
       
    }

	private static void calculateMedian(ArrayList<Long> numbers) {
		// TODO Auto-generated method stub
    	Collections.sort(numbers);
    	//Collections.sort(numbers, Collections.reverseOrder());
    	long median;
    	int len = numbers.size();
    	if(len % 2 != 0){
    		median = numbers.get(len/2);
    		System.out.println(median);
    	}
    	else{
    		long m1 = numbers.get(len/2);
    		long m2 = numbers.get((len/2)-1);
    		long m = m1+m2;
    		if((m & 1) == 1){
    			//Bitwise AND. The sum (m) of two numbers is odd. so will have .5 after the integer value.
    			System.out.printf("%.1f", m/2.0);
                System.out.println();
    		}
    		else
    			//The sum (m) of two numbers is even.
    			System.out.println(m/2);
    	}
	}

	/* Tail starts here*/
    
   public static void main( String args[] ){
      

      Scanner in = new Scanner(System.in);
      
      int N;
      N = in.nextInt();
   
      String s[] = new String[N];
      long x[] = new long[N];
      
      for(int i=0; i<N; i++){
         s[i] = in.next();
         x[i] = in.nextLong();
      }

      median(s,x);
    }
}
