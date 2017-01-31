import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

// String comparison is always done using .equal() method. Never use == operator.
/*
 * == operator returns true if both strings are at the same memory location.
 * String s1="Sachin"; String s2="Sachin"  s1==s2 will return true
 * String s3= new String("Sachin")  s1==s3 will return false because s3 is an object of string class and s1 and s3 points to different memory locations.
 */
public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<String> a1 = new ArrayList<String>();
        String a3[] = new String[N];
        for(int i=0;i<N;i++){
            //a1.add(scan.next());
        	a3[i]=scan.next();
        }
        /*ListIterator itr = a1.listIterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }*/
        int Q = scan.nextInt();
        ArrayList<String> a2 = new ArrayList<String>();
        String a4[] = new String[Q];
        for(int i=0;i<Q;i++){
            //a2.add(scan.next());
        	a4[i]=scan.next();
        }
        for(int j=0;j<Q;j++){
        	int count=0;
        	for(int i=0;i<N;i++){
        		//String x = a1.get(i);
        		//String y = a2.get(j);
        		//if(a2.get(j).equals(a1.get(i)))
        			//count++;
        		if(a4[j].equals(a3[i]))
        			count++;
        	}
        	System.out.println(count);
        }
	}

}
