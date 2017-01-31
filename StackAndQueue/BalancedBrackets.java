import java.util.Scanner;
import java.util.Stack;


public class BalancedBrackets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            Stack<Character> st = new Stack<Character>();
            int count=0;
            if(s.length()%2 != 0){
            	System.out.println("NO");
            	count++;
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                    st.push(s.charAt(i));
                if(st.isEmpty() || (s.charAt(i)==')' && st.pop()!='(') || (s.charAt(i)==']' && st.pop()!='[') || (s.charAt(i)=='}' && st.pop()!='{'))
                {   
                	System.out.println("NO");
                	count++;
                	break;
                }
            }
            if(st.isEmpty() && count==0)
            	System.out.println("YES");
            else
            	System.out.println("NO");
        }
        in.close();
	}
}
