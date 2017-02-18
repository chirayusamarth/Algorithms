import java.util.Scanner;


public class PrintPossibleStringsMadeByPlacingSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		printAllStrings(str);
	}

	private static void printAllStrings(String str) {
		// TODO Auto-generated method stub
		int n= str.length();
		char buff[]= new char[2*n];
		
		buff[0]=str.charAt(0);
		
		printAllStrings(str, buff, 1, 1, n);
	}

	private static void printAllStrings(String str, char[] buff, int i, int j,
			int n) {
		// TODO Auto-generated method stub
		if(i==n){
			for(int k=0;k<2*n;k++)
				System.out.print(buff[k]);
			System.out.println();
			return;
		}
		
		buff[j]=str.charAt(i);
		printAllStrings(str,buff, i+1,j+1,n);
		
		buff[j]=' ';
		buff[j+1]=str.charAt(i);
		printAllStrings(str,buff, i+1,j+2,n);
		
	}

}
