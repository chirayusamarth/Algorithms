import java.util.HashSet;
import java.util.Scanner;


public class Equillibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		for(int x=0;x<t;x++)
		{
			int n= scan.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++)
				a[i]= scan.nextInt();
			if(n==1)
				System.out.println(n);
			else{
			int equi=1;
			while(equi<n){
				int sumleft=0;
				int sumright=0;
				int j=0;
				int k=equi+1;
				while(j<equi){
					sumleft+=a[j];
					j++;
				}
				while(k<n){
					sumright+=a[k];
					k++;
				}
				if(sumleft==sumright)
				{
					System.out.println(equi+1);
					break;
				}
				else
					equi++;
			}}
		}
	}

}
