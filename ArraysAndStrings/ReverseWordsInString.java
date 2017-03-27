import java.util.Arrays;
import java.util.Scanner;


public class ReverseWordsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		//int n= scan.nextInt();
		String s= scan.next();
		int n = s.length();
		int a=0;
		int b=n-1;
		StringBuilder s1= new StringBuilder();
		while(b>=0){
			s1.append(s.charAt(b));
			b--;
		}
		s= s1.toString();
		System.out.println(s);
				
		String str[]= new String[n];
		for(int i=0;i<n;i++){
			str[i]= scan.next();
		}
		for(int i=0;i<n;i++){
			System.out.print(str[i]+" ");
		}
		int l=0;
		int r=n-1;
		while(l<r){
			String temp= str[l];
			str[l]= str[r];
			str[r]= temp;
			l++;
			r--;
		}
		for(int i=0;i<n;i++){
			System.out.print(str[i]+" ");
		}
		reverse(str);
		
	}
	static String reverse(String str[]){
		
		if(str.length<=1 || str==null)
			return str[0];
		StringBuilder rev= new StringBuilder();
		rev.append(str[str.length-1]);
		rev.append(reverse(Arrays.copyOfRange(str, 0, str.length-1)));
		return rev.toString();
	}

}
