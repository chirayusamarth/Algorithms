import java.util.Scanner;


public class SubarrayWithGivenSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int t= scan.nextInt();
		for(int c=0;c<t;c++){
		    int n= scan.nextInt();
		    int k= scan.nextInt();
		    int a[]= new int[n];
		    for(int i=0;i<n;i++){
		        a[i]= scan.nextInt();
		    }
		    int x=0;
		    int sum= a[x];
		    for(int i=1;i<n;i++){
		        if(sum+a[i] > k){
		        	x++;
		            sum=a[x];
		            i=x;
		        }
		        else{
		            if(sum+a[i]==k){
		            	sum+=a[i];
		                System.out.print(x+1+" "+(i+1));
		                break;
		            }
		            else{
		                sum+=a[i];
		            }
		        }
		      
		    }
		    if(sum!=k)
		    	System.out.println(-1);
		}
	

	}

}
