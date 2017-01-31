import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class GroupAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
			arr[i] = scan.next();
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		
		for(String s: arr){
			String key = sortChar(s);
			hm.put(key, s);
		}
		
		int index=0;
		
		for(String key: hm.keySet()){
			ArrayList<String> a = new ArrayList<String>();
			a.set(0, hm.get(key));
			for(String t: a){
				arr[index]=t;
				index++;
			}
		}
		
	}

	private static String sortChar(String s) {
		// TODO Auto-generated method stub
		char ch[] = new char[s.length()];
		ch = s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

}
