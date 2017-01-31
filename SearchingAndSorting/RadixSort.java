import java.util.Scanner;


public class RadixSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        radixsort(a,n);
        for(int i=0;i<n;i++){
        	System.out.println(a[i]);
        }
	}

	private static void radixsort(int[] a, int n) {
		// TODO Auto-generated method stub
		int max = getMax(a);
		for(int exp=1; max/exp > 0; exp*=10)
			countingsort(a,n,exp);
	}

	private static void countingsort(int[] a, int n, int exp) {
		// TODO Auto-generated method stub
		int count[] = new int[10];
		int places[] = new int[10];
		
		for(int i=0;i<n;i++){
			count[(a[i]/exp)%10]++;
		}
		
		for(int i=0;i<n;i++){
			count[i+1]+=count[i];
		}
		
		for(int i=0;i<n;i++){
			places[count[(a[i]/exp)%10]] = a[i];
			count[(a[i]/exp)%10]--;
		}
		
		int j=0;
        for(int i=1;i<=n;i++){
        	a[j] = places[i];
        	j++;
        }
	}

	private static int getMax(int[] a) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}

}
