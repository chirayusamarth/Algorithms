import java.io.BufferedReader;
import java.io.InputStreamReader;


public class URLify {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		int len = Integer.parseInt(br.readLine());
		char ch[] = s1.toCharArray();
		char ch1[] = new char[s1.length()];
		int index=0;
		for(int i=0;i<len;i++){
			if(ch[i]==' '){
				ch1[index]='%';
				ch1[index+1]='2';
				ch1[index+2]='0';
				index=index+3;
			}
			else
			{
				ch1[index]=ch[i];
				index++;
			}
		}
		for(int i=0;i<ch1.length;i++){
			System.out.print(ch1[i]);
		}
	}

}
