import java.util.Scanner;


public class StringToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String str= scan.next();
		System.out.println(myAtoi(str));
	}

    public static int myAtoi(String str) {
        if(str.length()==0)
            return 0;
        
        int idx=0;
        while(str.charAt(idx)==' ' && idx<str.length())
            idx++;
            
        int sign=1;
        if(str.charAt(idx)=='-'){
            sign=-1;
            idx++;
        }
        else if(str.charAt(idx)=='+'){
            sign=1;
            idx++;
        }
        int total=0;
        while(idx<str.length())
        {
            int digit= str.charAt(idx) - '0';
            if(digit < 0 || digit > 9)
            	break;
            
            if(Integer.MAX_VALUE/10 < total || (Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < digit))
            	return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            total= total*10 + digit;
            idx++;
        }
        return total*sign;
    }

}
