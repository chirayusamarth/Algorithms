import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StringCompression {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		//String s2="";
		StringBuilder s = new StringBuilder();
		for(int i=0;i<s1.length();i++){
			int count=0;
			for(int j=i;j<s1.length();j++){
				if(s1.charAt(i)==s1.charAt(j))
					count++;
				else
					break;
			}
			s.append(s1.charAt(i));
			s.append(count);
			//s2=s2+s1.charAt(i)+count;
			i=i+(count-1);
		}
		if(s1.length()<s.length())
			System.out.println("Compressed string larger. Returning original string "+s1);
		else
			System.out.println("Compressed string "+s);
	}

}
