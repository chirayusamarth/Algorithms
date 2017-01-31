import java.util.Scanner;


public class ArraysAndSimpleQueries {

	/**
	 * @param args
	 */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<q;i++){
            int t = scan.nextInt();
            switch(t){
                case 1:
                        int x = scan.nextInt();
                        int y = scan.nextInt();
                        arr = typeOne(arr, x, y);
                        break;
                case 2:
                        int x1 = scan.nextInt();
                        int y1 = scan.nextInt();
                        arr = typeTwo(arr, x1, y1);
                        break;
            }
        }
        int abs = Math.abs(arr[1]-arr[n]);
        System.out.println(abs);
        for(int a=1;a<=n;a++)
			System.out.print(arr[a]+" ");
    }

	private static int[] typeTwo(int[] arr, int x1, int y1) {
		// TODO Auto-generated method stub
		int n = arr.length-1;
		int k=y1;
		int a;
		int temp[] = new int[n+1];
		for(a=n;a>=1;a--){
			if(y1>=x1){
				temp[a] = arr[y1];
				y1--;
			}
			else
				break;
		}
		y1=k;
		int b=n;
		for(int i=a;i>=1;i--)
		{
			while(b>=1){
				if(b<x1 || b>y1){
					temp[a]= arr[b];
					a--;
				}
				b--;
			}
		}
			
		//System.out.print(a+" \n");
		//for(a=1;a<=n;a++)
			//System.out.print(temp[a]+" ");
		
		return temp;
	}

	private static int[] typeOne(int[] arr, int x, int y) {
		// TODO Auto-generated method stub
		int n = arr.length-1;
		int k=x;
		int temp[] = new int[n+1];
		for(int a=1;a<=n;a++){
			if(x<=y){
				temp[a] = arr[x];
				x++;
			}
		}
		x=k;
		int m = y-x+2;
		int a=m;
		int b=1;
		while(a<=n){
			while(b<=n){
				if(b<x || b>y){
					temp[a] = arr[b];
					a++;
				}
				b++;
			}
			a++;
		}
		//for(a=1;a<=n;a++)
			//	System.out.print(temp[a]+" ");
		return temp;
	}

}
