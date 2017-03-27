import java.util.HashSet;
import java.util.Scanner;


public class FindingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		for(int j=0;j<t;j++){
		int n= scan.nextInt();
		int a[]= new int[(2*n)+2];
		for(int i=0;i<(2*n)+2;i++)
			a[i]= scan.nextInt();
		HashSet<Integer> set= new HashSet<Integer>();
		for(int i=0;i<(2*n)+2;i++){
			if(set.contains(a[i]))
				set.remove(a[i]);
			else
				set.add(a[i]);
		}
		for(int i: set)
			System.out.println(i);
	}}

}
