import java.util.Scanner;


public class ReverseAnInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int x= scan.nextInt();
		System.out.println(reverse(x));
	}

	private static int reverse(int x) {
		long rev=0;
		while(x!=0)
		{
			rev= rev*10;
			rev += x%10;
			x = x/10;
		}
		if(rev*10 > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
			return 0;
		return (int)rev;
	}

}
