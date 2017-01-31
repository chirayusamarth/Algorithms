import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergingCommunities {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

    	int parent[] = new int[n+1];
        int size[] = new int[n+1];
        int q = scan.nextInt();
        initialize(parent, size, n);
        //Tree node = new Tree(n);
        for(int i=0;i<q;i++){
            String t = scan.next();
            switch(t){
                case "M":
                	int a = scan.nextInt();
                	int b = scan.nextInt();
                	int root_a = find(parent, a);
                	int root_b = find(parent, b);
                	union(parent, size, root_a, root_b);
                	break;
                case "Q":
                	int s = scan.nextInt(); 
                	System.out.println(size[find(parent,s)]);
            }
        }
    }
    static void initialize(int parent[], int size[], int n){        	 
        for(int i=1;i<=n;i++){
            parent[i] = i;
            size[i]=1;
        }
    }
    static int find(int parent[], int a) {
		// TODO Auto-generated method stub
		while(a!=parent[a])
			a=parent[a];
		return a;
	}

	private static void union(int parent[], int size[], int root_a, int root_b) {
		// TODO Auto-generated method stub
		if(root_a!=root_b){
			if(size[root_a] <= size[root_b]){
				parent[root_a] = parent[root_b];
				size[root_b] += size[root_a];
			}
			else{
				parent[root_b] = parent[root_a];
				size[root_a] += size[root_b];
			}
		}
	}	
}
