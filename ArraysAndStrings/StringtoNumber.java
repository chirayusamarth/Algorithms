import java.util.InputMismatchException;
import java.util.Scanner;


public class StringtoNumber {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s= scan.next();
		long n= parseLong(s);
		System.out.print(n);
	}

	private static long parseLong(String s){
		// TODO Auto-generated method stub
		if(s==null || s.length()==0 || !isNumeric(s))
			try {
				throw new InputMismatchException();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		boolean isNegative=false;
		if(s.charAt(0)=='-')
			 isNegative=true;
        if(s.charAt(0)=='-' || s.charAt(0)=='+')
            s=s.substring(1);
        long result=0;
        for(int i=0;i<s.length();i++){
        	int val= s.charAt(i)-'0';
        	result = 10*result + val;
        }
        if(isNegative)
        	return (-1)* result;
        else
        	return result;
        //System.out.println(s);
	}

	private static boolean isNumeric(String s) {
		// TODO Auto-generated method stub
		for(char c: s.toCharArray()){
			if(!Character.isDigit(c))
				return false;
		}
		return true;
	}
}
