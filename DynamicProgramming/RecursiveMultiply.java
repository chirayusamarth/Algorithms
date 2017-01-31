import java.util.Scanner;


public class RecursiveMultiply {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		int smaller= a<b?a:b;
		int bigger= a<b?b:a;
		
		int product= multiply(smaller,bigger);
		System.out.println(product);
	}

	private static int multiply(int smaller, int bigger) {
		// TODO Auto-generated method stub
		if(smaller==0)
			return 0;
		if(smaller==1)
			return bigger;
		else{
			int s= smaller>>1;	//divide by 2
			int halfproduct= multiply(s, bigger);
			if(smaller%2==0)
				return halfproduct+halfproduct;
			else
				return halfproduct+halfproduct+bigger;
		}
	}

}
