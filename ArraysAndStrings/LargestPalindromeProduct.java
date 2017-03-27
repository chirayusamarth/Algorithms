import java.util.Scanner;


public class LargestPalindromeProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        String no1="";
        String no2="";
        for(int i=0;i<n;i++)
        {
            no1+=9;
            no2+=9;
        }
        long a= Long.parseLong(no1);
        long b= Long.parseLong(no2);
        long maxproduct=0;
        long lowlimit= (1+a)/10;
        for(long i=a;i>lowlimit;i--){
	        for(long j=i;j>lowlimit;j--){
	        	long p= a*b;
	        	//System.out.println(a+" "+b+": "+p);
	        	if(isPalindrome(p) && p>maxproduct){
	        		maxproduct=p;
	        	}
	        	b--;
	        }
	        a--;
        }
        maxproduct= maxproduct % 1337;
		System.out.println(maxproduct);
        scan.close();
	}

	private static boolean isPalindrome(long p) {
		// TODO Auto-generated method stub
		String s= Long.toString(p);
		char ch[]= s.toCharArray();
		int i=0;
		int j= ch.length-1;
		while(i<j){
			if(ch[i]!=ch[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

}
