import java.util.ArrayList;
import java.util.Scanner;


public class PermutationsOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String str= scan.next();
		
		ArrayList<String> result= getPerms(str);
		for(String s: result)
			System.out.print(s+" ");
	}

	private static ArrayList<String> getPerms(String str) {
		// TODO Auto-generated method stub
		int len= str.length();
		ArrayList<String> result= new ArrayList<String>();
		if(len==0){
			result.add("");
			return result;
		}
		for(int i=0;i<len;i++){
			String before= str.substring(0,i);
			String after= str.substring(i+1,len);
			ArrayList<String> partials= getPerms(before+after);
			
			for(String s: partials){
				if(!result.contains(s+str.charAt(i)))	//If string contains duplicates
					result.add(s+str.charAt(i));
			}
		}
		return result;
	}
}
