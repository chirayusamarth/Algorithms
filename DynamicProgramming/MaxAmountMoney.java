import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxAmountMoney {
	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
		int t= scan.nextInt();
		for (int k=0;k<t;k++){
		int n= scan.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		    a[i]= scan.nextInt();
		int ans= maxAmount(a,n);
		System.out.println(ans);}
	}
	static int maxAmount(int a[],int n){
	    int tab[][]= new int[n][n];
	    for(int g=0;g<n;g++){
	        //int i=0;
	        for(int i=0, j=g;j<n;i++,j++){
	            int x= (i+2 <= j) ? tab[i+2][j]:0;
	            int y= (i+1<=j-1) ? tab[i+1][j-1]:0;
	            int z= (i<=j-2)? tab[i][j-2]:0;
	            
	            tab[i][j]= Math.max(a[i]+Math.min(x,y), a[j]+Math.min(y,z));
	        }
	    }
	    return tab[0][n-1];
	}
}