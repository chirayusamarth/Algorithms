import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * https://www.youtube.com/watch?v=GTJr8OvyEVQ
 * http://www.geeksforgeeks.org/searching-for-patterns-set-2-kmp-algorithm/
 */
public class LongestPrefixSuffix {
	public static void main (String[] args) {
		//code
		Scanner scan= new Scanner(System.in);
		int t= scan.nextInt();
		for(int k=0;k<t;k++){
		    String str= scan.next();
		    int n= str.length();
		    int lps[]= new int[n];
		    int len= computeLPS(str, n, lps);
		    System.out.println(len);
		}	
	}

	private static int computeLPS(String str, int n, int[] lps) {
		// TODO Auto-generated method stub
		int i=1;
		int len=0;
		lps[0]=0;
		while(i<n){
			if(str.charAt(i)==str.charAt(len)){
				len++;
				lps[i]=len;
				i++;
			}
			else{
				if(len!=0)
					len=lps[len-1];
				else{
					lps[i]=len;
					i++;
				}
			}
		}
		return lps[n-1];
	}	
}