/*
 * Determine if a string has all unique characters
 */

import java.io.*;
import java.util.BitSet;
import java.util.HashSet;

public class HasUniqueCharacters {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		//Cannot use addition data structures
		/*HashSet set= new HashSet();
		for(int i=0;i<str.length();i++){
			if(set.contains(str.charAt(i))){
				continue;
			}
			else
				set.add(str.charAt(i));
		}
		System.out.println(set);*/
		boolean ans = isUnique(str);
		System.out.println(ans);
	}

	private static  boolean  isUnique(String str) {
		// TODO Auto-generated method stub
		boolean chr_set[] = new boolean[128];
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(chr_set[val]==true)
				return false;
			chr_set[val]=true;
		}
		return true;
	/*	BitSet bs = new BitSet(128);
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(bs.get(val))
				return false;
			bs.set(val);
		}
		return true;*/		
	}
}