/*

Design and implement a data structure for a compressed string iterator. It should support the following operations: next and hasNext.

The given compressed string will be in the form of each letter followed by a positive integer representing the number of this letter existing in the original uncompressed string.

next() - if the original string still has uncompressed characters, return the next letter; Otherwise return a white space.
hasNext() - Judge whether there is any letter needs to be uncompressed.


Example:
StringIterator iterator = new StringIterator("L1e2t1C1o1d1e1");

iterator.next(); // return 'L'
iterator.next(); // return 'e'
iterator.next(); // return 'e'
iterator.next(); // return 't'
iterator.next(); // return 'C'
iterator.next(); // return 'o'
iterator.next(); // return 'd'
iterator.hasNext(); // return true
iterator.next(); // return 'e'
iterator.hasNext(); // return false
iterator.next(); // return ' '

*/

public class StringIterator{
	int i;
	char ch;
	String str;
	int num;

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
		return ch;
	}

	public boolean hasNext(){
		return i != str.length() || num!=0;
	}
}
