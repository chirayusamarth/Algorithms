import java.util.Scanner;

public class CountingSort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        countingsort(a,n);
        for(int i=0;i<n;i++){
        	System.out.println(a[i]);
        }
    }
    private static void countingsort(int a[], int n){
        int count[] = new int[10];
        
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        
        for(int i=0;i<n;i++){
            count[i+1]+=count[i];
        }
        
        int places[] = new int[10];
        for(int i=0;i<n;i++){
            places[count[a[i]]]= a[i];
            count[a[i]]--;
        }
        int j=0;
        for(int i=1;i<=n;i++){
        	a[j] = places[i];
        	j++;
        }
    }
}