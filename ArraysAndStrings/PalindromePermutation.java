import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PalindromePermutation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		boolean ans = checkPalindromePermutation(s1);
		System.out.println(ans);
	}

	private static boolean checkPalindromePermutation(String s1) {
		// TODO Auto-generated method stub
		/*
		 * Strings with even length must have all even counts of characters and
		 * Strings with odd length must have exactly one character with an odd count.
		 */
		if(s1.length()%2==0){
			int ch[] = new int[128];
			for(int i=0;i<s1.length();i++){
				int val = s1.charAt(i);
				ch[val]++;
			}
			for(int i=0;i<ch.length;i++){
				if(ch[i]%2!=0)
					return false;
			}
			return true;
		}
		else{
			int ch[] = new int[128];
			for(int i=0;i<s1.length();i++){
				int val = s1.charAt(i);
				ch[val]++;
			}
			int count = 0;
			for(int i=0;i<ch.length;i++){
				if(ch[i]%2!=0)
					count++;
			}
			if(count!=1)
				return false;
			else
				return true;
		}
		
	}
}
