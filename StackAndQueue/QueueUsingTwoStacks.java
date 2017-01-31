import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * Sample Test Case:
	10
	1 76
	1 33
	2
	1 23
	1 97
	1 21
	3
	3
	1 74
	3
 */
public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution s = new Solution();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int t= scan.nextInt();
            switch(t){
                case 1:
                    int item = scan.nextInt();
                    s.insert(item);
                    break;
                case 2:
                    int x = s.delete();
                    break;
                case 3:
                    s.display();
                    break;
            }
        }
    }
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
	public void insert(int item){
		s1.push(item);
	}
	
	public int delete(){
		if(s1.isEmpty() && s2.isEmpty())
			throw new EmptyStackException();
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
        return s2.pop();
	}
    
    public void display(){
        if(!s2.isEmpty()){
			System.out.println(s2.lastElement());
		}
        else{
		  if(!s1.isEmpty())
			System.out.println(s1.firstElement());
	   }
    }
}