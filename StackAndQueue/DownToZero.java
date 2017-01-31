import java.util.ArrayDeque;
import java.util.Scanner;


public class DownToZero {

	/**
	 * @param args
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0;i<q;i++){
			int n= scan.nextInt();
			int numberOfMoves = downToZero(n);
			System.out.println(numberOfMoves);
		}
	}

	private static int downToZero(int n) {
		// TODO Auto-generated method stub
		int numberOfMoves = 0;
		while(n!=0){
			int f = getPrimeFactor(n);
			//n = n/f;
			int a = f;
			int b = n/f;
			
			if(a!=1 && b!=1){
				n = Math.min(Math.max(a,b), n-1);
				numberOfMoves++;
			}
			else{
				n = n-1;
				numberOfMoves++;
			}
				
		}
		return numberOfMoves;
		
	}
	
	private static int getPrimeFactor(int n) {
		// Add the 2s that divide n into the queue
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		if(n==1){
			q.add(n);
		}
		if(n%2==0){
			q.add(2);
		}
		
		//n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		for(int i=3;i<=Math.sqrt(n);i+=2){
			if(n%i == 0){
				q.poll();
				q.add(i);
			}
		}
		
		//This condition is to handle the case when n is a prime number greater than 2
		if(q.isEmpty() && n > 2){
			q.poll();
			q.add(n);
		}
		return q.poll();
	}
}
