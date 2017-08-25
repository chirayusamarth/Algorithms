public class LongestSubstringWithAtMostKDistinctChars(){
	public int longestSubstring(String s){
    // Taking k=2
		int start= 0;
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
				map.put(s.charAt(i), 1);

			if(map.size() > 2){
				max= Math.max(max, i-start);

				while(map.size() > 2){
					int count= map.get(start);
					if(count > 1)
						map.put(s.charAt(start), count-1);
					else
						map.remove(s.charAt(i));
					start++;
				}
			}
		}
		max= Math.max(max, s.length()-start);
		return max;
	}
}
