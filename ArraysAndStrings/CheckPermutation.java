import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CheckPermutation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		boolean ans = checkPermutation(s1, s2);
		System.out.println(ans);
	}

	private static boolean checkPermutation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length())
			return false;
		else{
			int str1[]= new int[128];
			int str2[]= new int[128];
			for(int i=0;i<s1.length();i++){
				int val1 = s1.charAt(i);
				str1[val1]++;
				int val2 = s2.charAt(i);
				str2[val2]++;
			}
			for(int i=0;i<str1.length;i++){
				if(str1[i]!=str2[i]){
					System.out.println(str1[i]);
					return false;
				}
			}
			return true;
		}
	}

}