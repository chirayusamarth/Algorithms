/*
This is a follow up of Shortest Word Distance. The only difference is now you are given the list of words and your method will be called repeatedly many times with different parameters. How would you optimize it?

Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list.

For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.
*/

public class ShortestWordDistanceII{
	
	Map<String, List<String>> map;
	public ShortestWordDistanceII(String[] words){
		map = new HashMap<String, List<String>>();
		for(int i=0;i<words.length;i++){
			if(!map.containsKey(word[i])){
				map.put(word[i], new ArrayList<String>());
			}
			map.get(word[i]).add(i);
		}
	}

	public int shortest(String word1, String word2){
		List<String> l1= map.get(word1);
		List<String> l2= map.get(word2);

		int i=0;int j=0;
		int mindist= Integer.MAX_VALUE;
		while(i < l1.size() && j < l2.size()){
			mindist = Math.min(mindist, l1.get(i)-l2.get(j));
			if(l1.get(i) < l2.get(j))
				i++;
			else
				j++;
		}
		return mindist;
	}
}
