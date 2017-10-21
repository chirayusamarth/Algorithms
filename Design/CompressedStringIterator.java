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


/*
Since no precomputation is done, constant space is required in this case.

The time required to perform next() operation is O(1)O(1).

The time required for hasNext() operation is O(1)O(1).

Since no precomputations are done, and hasNext() requires only O(1)O(1) time, this solution is advantageous if hasNext() operation is performed most of the times.

This approach can be extended to include previous() and hasPrevious() operationsm, but this will require the use of some additional variables.
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
