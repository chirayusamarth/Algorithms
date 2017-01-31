import java.util.Scanner;


public class TruckTour {

	/**
	 * @param args
	 */
	//http://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
	
	private static class PetrolPump{
		int amt;
		int dist;
		public PetrolPump(int a, int b){
			this.amt=a;
			this.dist=b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		PetrolPump m[] = new PetrolPump[N];
		for(int i=0;i<N;i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			m[i] = new PetrolPump(a,b);
			//m[i].dist=Integer.parseInt(scan.next());
		}
		scan.close();
		int startindex = tour(m, N);
		System.out.println(startindex);
	}
	private static int tour(PetrolPump[] m, int n) {
		// TODO Auto-generated method stub
		int start=0;
		int end=1;
		int sum=0;
		sum = m[start].amt- m[start].dist;
		while(end!=start || sum<0){
			while(sum<0 && start!=end){
				sum = sum - (m[start].amt - m[start].dist);
				start=(start+1)%n;
			}
			sum += m[end].amt- m[end].dist;
			end=(end+1)%n;
		}
		return start;
	}

}