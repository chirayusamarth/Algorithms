import java.util.Scanner;


public class RomanToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		scan.close();
		int n= str.length();
		int res=0;
		for(int i=0;i<n;i++){
			int s1= integerValue(str.charAt(i));
			if(i+1<n){
				int s2= integerValue(str.charAt(i+1));
				if(s1 >= s2)
				{
					res+=s1;
				}
				else{
					res=res+s2-s1;
					i++;
				}
			}
			else{
				res+=s1;
			}
		}
		System.out.println(res);
	}
	static int integerValue(char c){
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;
		if(c=='C')
			return 100;
		if(c=='D')
			return 500;
		if(c=='M')
			return 1000;
		return -1;
	}

}
