/*
  SHORTEST WORD DISTANCE
  
  Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

  For example,
  Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

  Given word1 = “coding”, word2 = “practice”, return 3.
  Given word1 = "makes", word2 = "coding", return 1
*/

public class Solution{
	public int shortestWordDistance(String words[], String w1, String w2){
		int m=-1;
		int n=-1;
		int min= Integer.MAX_VALUE;
		for(int i=0;i<words.length;i++){
			String w= words[i];
			if(w.equals(w1))
				m= i;
			else if(w.equals(w2))
				n= i;

			if(m!=-1 && n!=-1)
				min= Math.min(min, Math.abs(m-n));
		}
		return min;
	}
}
