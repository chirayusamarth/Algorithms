import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DynamicArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        ArrayList<Integer> seqList[] = new ArrayList[N];
        for(int i=0;i<N;i++){
            seqList[i] = new ArrayList<Integer>();
        }
        int lastAns=0;
        for(int i=0;i<Q;i++){
        	int t = scan.nextInt();
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	List<Integer> seq = seqList[(x^lastAns)%N];
        	switch(t)
        	{
        		case 1:
        			seq.add(y);
        			break;
        		case 2:
        			lastAns = seq.get(y % seq.size());
        			System.out.println(lastAns);
        			break;
        	}
        }
        scan.close();
	}

}
