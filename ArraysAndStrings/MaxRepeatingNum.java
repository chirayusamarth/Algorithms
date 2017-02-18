import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxRepeatingNum {
	public static void main (String[] args) {
		//code
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		for(int x=0;x<t;x++){
    		int n= scan.nextInt();
    		int k= scan.nextInt();
    		int count[]=new int[k];
    		int a[]= new int[n];
    		for(int i=0;i<n;i++)
    		    a[i]=scan.nextInt();
    		for(int i=0;i<n;i++){
    		    count[a[i]]+=1;
    		}
   
    		int max=count[0];
    		int maxidx=0;
    		for(int i=1;i<k;i++)
    		{
    		    if(count[i]>max){
    		        maxidx=i;
    		        max=count[i];
    		    }
    		}
    		System.out.println(maxidx);
    		
	    }
	    
	}
}