import java.util.Scanner;
import java.util.Stack;


public class TowersOfHanoi {

	/**
	 * @param args
	 */
	private static class Tower{
		static Stack<Integer> disks;
		int index;
		public Tower(int i){
			disks= new Stack<Integer>();
			index= i;
		}
		public void add(int i) {
			// TODO Auto-generated method stub
			if(!disks.isEmpty() && disks.peek()<=i)
				System.out.println("Error placing disk "+i);
			else
				disks.push(i);
		}
		public void moveDisks(int n, Tower destination, Tower buffer) {
			// TODO Auto-generated method stub
			if(n > 0){
				moveDisks(n-1, buffer, destination);
				moveTopTo(destination);
				moveDisks(n-1, destination, buffer);
			}
		}
		private void moveTopTo(Tower destination) {
			// TODO Auto-generated method stub
			int t = disks.pop();
			destination.add(t);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		Tower towers[]= new Tower[3];
		for(int i=0;i<3;i++){
			towers[i] = new Tower(i);
		}
		
		for(int i=n-1;i>=0;i--)
			towers[0].add(i);
		
		towers[0].moveDisks(n, towers[2], towers[1]);
	}
}
