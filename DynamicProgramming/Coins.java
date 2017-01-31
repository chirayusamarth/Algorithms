import java.util.Scanner;


public class Coins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int ways= noOfWays(n);
		System.out.println(ways);
	}

	private static int noOfWays(int n) {
		// TODO Auto-generated method stub
		int denoms[]={25,10,5,1};
		return noOfWays(denoms, n, 0);
	}

	private static int noOfWays(int[] denoms, int n, int index) {
		// TODO Auto-generated method stub
		if(index >= denoms.length-1)
			return 1;
		int ways=0;
		int denomAmount= denoms[index];
		for(int i=0; i*denomAmount <= n; i++)
		{
			int amountRemaining= n - i*denomAmount;
			ways+= noOfWays(denoms, amountRemaining, index+1);
		}
		return ways;
	}
}
