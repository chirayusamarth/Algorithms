import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class PrintAllParens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		
		Set<String> set= getParens(n);
		for(String s:set)
			System.out.print(s+" ");
	}

	private static Set<String> getParens(int n) {
		// TODO Auto-generated method stub
		Set<String> set= new HashSet<String>();
		if(n==0){
			set.add("");
			return set;
		}
		Set<String> prev= getParens(n-1);
		for(String str: prev){
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='('){
					String s = insertInside(str, i);
					set.add(s);
				}
			}
			set.add("()"+str);
		}
		return set;
	}

	private static String insertInside(String str, int i) {
		// TODO Auto-generated method stub
		String left= str.substring(0,i+1);
		String right= str.substring(i+1);
		return left+"()"+right;
	}

}
