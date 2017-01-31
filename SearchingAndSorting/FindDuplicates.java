import java.util.BitSet;


public class FindDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		BitSet bs = new BitSet(32000);
		for(int i=0;i<a.length;i++){
			int num=a[i];
			int num0 = num-1;
			if(bs.get(num0))
				System.out.println(num);
			else
				bs.set(num0);
		}
	}

}
