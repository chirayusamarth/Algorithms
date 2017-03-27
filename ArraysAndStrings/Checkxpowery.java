import java.util.Scanner;


public class Checkxpowery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int factor=2;
		while(factor <= Math.sqrt(n)){
			while(n%factor==0)
				n=n/factor;
			if(n == 1)
			{	
				System.out.println(true);
				return;
			}
			else
				factor++;
		}
		System.out.println(false);
		return;
		
	}

}
