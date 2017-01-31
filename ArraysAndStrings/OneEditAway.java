import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OneEditAway {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		boolean ans = oneEditAway(s1, s2);
		System.out.println(ans);
	}

	private static boolean oneEditAway(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() == s2.length()){
			int count=0;
			for(int i=0;i<s2.length();i++){
				char ch1 = s1.charAt(i);
				char ch2 = s2.charAt(i);
				if(ch1!=ch2){
					count++;
				}
			}
			if(count == 1)
				return true;
			else
				return false;
		}
		else{
			/*
			 * Check if inserting a character in s1 will make it equal to s2
			 */
			int i=0;
			int j=0;
			while(i<s1.length() && j<s2.length()){
				if(s1.charAt(i)!=s2.charAt(j)){
					if(i!=j)
						return false;
					j++;
				}
				else
				{
					i++;
					j++;
				}
			}
			return true;
		}
	}

}
