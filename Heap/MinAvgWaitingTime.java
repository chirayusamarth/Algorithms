import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class MinAvgWaitingTime {

	private static class Customer{
		int orderTime;
		int cookTime;
		
		public Customer(int orderTime, int cookTime){
			this.orderTime=orderTime;
			this.cookTime=cookTime;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Customer cust[] = new Customer[n];
		for(int i=0;i<n;i++){
			int orderTime = scan.nextInt();
			int cookTime = scan.nextInt();
			cust[i] = new Customer(orderTime, cookTime);
		}
		//Arrays.sort(cust, (c1,c2) -> c1.orderTime - c2.orderTime);
		PriorityQueue<Customer> waitings = new PriorityQueue<Customer>();
		for(int i=0;i<n;i++){
			waitings.add(cust[i]);
		}
		int currentTime = 0;
		long totalWaitingTime = 0;
		int index = 0;
		while(!waitings.isEmpty() || index < n){
			Customer served = waitings.poll();
			currentTime += served.cookTime;
			totalWaitingTime += currentTime - served.orderTime;
		}
		System.out.println(totalWaitingTime/n);
	}

}
