import java.util.Scanner;


public class DecodeString {

	/**
	 * @param args
	 */
	/*
	 * Given a pattern as below and an integer n your task is to decode it and print nth row of it. The pattern follows as :
		1
		11
		21
		1211
		111221
		............
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		String OPT[]= new String[10];
		OPT[1]="1";
		OPT[n]= decode(n, OPT);
		System.out.println(OPT[n]);
	}

	private static String decode(int n, String OPT[]) {
		// TODO Auto-generated method stub
		for(int i=2;i<=n;i++)
		{
			OPT[i]= decodeString(OPT[i-1]);
		}
		return OPT[n];
	}

	private static String decodeString(String s) {
		// TODO Auto-generated method stub
		String res="";
		for(int i=0;i<s.length();i++){
			int count=1;
			while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
				count++;
				i++;
			}
			res= res+count+s.charAt(i);
		}
		return res;
	}
}
