public class StringIterator{
	int i;
	char ch;
	String str;
	int num;
	char ch_prev = ' ';
	int prev = 0;
	int j = -2;
	
	public StringIterator(String s){
		str= s;
		i = 0;
		num = 0
		ch= ' ';
	}

	public char next(){
		if(i == str.length() && num == 0)
			return ' ';

		if(num == 0){
			ch = str.charAt(i++);

			while(i < str.length() && Character.isDigit(str.charAt(i))){
				num = num * 10 + str.charAt(i) - '0';
				i++;
			}
			num--;
		}
		j++;
		return ch;
	}

	public char previous(){
		if(!hasPrevious())
			return ' ';

		if(prev_num >= 0) {
			while(j >= 0 && Character.isDigit(str.charAt(j))){
				prev_num = prev_num * 10 - str.charAt(j) - '0';
				j--;
			}
			ch_prev= str.charAt(j--);
			prev_num++;
		}
		return ch_prev;
	}

	public boolean hasNext(){
		return i != str.length() || num!=0;
	}

	public boolean hasPrevious(){
		return j >= 0;
	}
}