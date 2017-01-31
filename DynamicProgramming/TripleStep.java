import java.util.Scanner;


public class TripleStep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of steps: ");
		int n = scan.nextInt();
		int OPT[]= new int[n+1];
		OPT[0]=1;
		OPT[1]=1;
		OPT[2]=2;
		for(int i=3;i<=n;i++)
			OPT[i]= OPT[i-1]+OPT[i-2]+OPT[i-3];
		System.out.println(OPT[n]);
	}
}
