import java.util.*;


public class EqualStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        int H1=0;
        int H2=0;
        int H3=0;
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        for(int h1_i=n1-1; h1_i >= 0; h1_i--){
            s1.push(h1[h1_i]);
            H1+=h1[h1_i];
        }
        for(int h2_i=n2-1; h2_i >= 0; h2_i--){
            s2.push(h2[h2_i]);
            H2+=h2[h2_i];
        }
        for(int h3_i=n3-1; h3_i >= 0; h3_i--){
        	s3.push(h3[h3_i]);
        	H3+=h3[h3_i];
        }      
        while(H1!=H2 || H2!=H3){
        	if(H1>H2 || H1>H3){
        		H1=H1-s1.peek();
        		s1.pop();
        	}
        	if(H2>H3 || H2>H1){
        		H2=H2-s2.peek();
        		s2.pop();
        	}
        	if(H3>H1 || H3>H2){
        		H3=H3-s3.peek();
        		s3.pop();
        	}
        }
        System.out.println(H1);
	}

}
