import java.util.Scanner;


public class StringRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		StringBuilder s3= new StringBuilder();
		s3.append(s2);
		s3.append(s2);
		String s = s3.toString();
		System.out.println(s);
		//String s="";
		//s=s+s2+s2;
		boolean ans = isSubstring(s1, s);
		System.out.println(ans);
	}

	private static boolean isSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s2.contains(s1))
			return true;
		else
			return false;
	}

}
