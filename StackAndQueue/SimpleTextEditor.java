import java.util.*;


public class SimpleTextEditor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s="";
		Stack<String> st = new Stack<String>();
		st.push(s);
		for(int i=0;i<n;i++){
			int t = scan.nextInt();
			switch(t){
			case 1:
				String w = scan.next();
				s=s+w;
				st.push(s);
				break;
			case 2:
				int k = scan.nextInt();
				String tp = st.peek();
				int pos = tp.length()-k;
				String s1="";
				for(int j=0;j<pos;j++){
					s1+=tp.charAt(j);
				}
				s=s1;
				st.push(s);
				break;
			case 3:
				k = scan.nextInt();
				tp=st.peek();
				char x = tp.charAt(k-1);
				System.out.println(x);
				break;
			case 4:
				st.pop();
				s="";
				s+=st.peek();
				break;
			}
			
		}
		scan.close();
	}

}
