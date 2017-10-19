/*
An abbreviation of a word follows the form <first letter><number><last letter>. Below are some examples of word abbreviations:
a) it                      --> it    (no abbreviation)
     1
b) d|o|g                   --> d1g
              1    1  1
     1---5----0----5--8
c) i|nternationalizatio|n  --> i18n
              1
     1---5----0
d) l|ocalizatio|n          --> l10n
Assume you have a dictionary and given a word, find whether its abbreviation is unique in the dictionary. A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.
*/

/*
The description (A word's abbreviation is unique if no other word from the dictionary has the same abbreviation) is clear however a bit twisting. It took me a few "Wrong Answer"s to finally understand what it's asking for.
We are trying to search for a word in a dictionary. If this word (also this word’s abbreviation) is not in the dictionary OR this word and only it’s abbreviation in the dictionary. We call a word’s abbreviation unique.
EX:
1) [“dog”]; isUnique(“dig”);   
//False, because “dig” has the same abbreviation with “dog" and “dog” is already in the dictionary. It’s not unique.
2) [“dog”, “dog"]; isUnique(“dog”);  
//True, because “dog” is the only word that has “d1g” abbreviation.
3) [“dog”, “dig”]; isUnique(“dog”);   
//False, because if we have more than one word match to the same abbreviation, this abbreviation will never be unique.
*/


public class UniqueWordAbbr{
	Map<String, List<String>> map;
	public UniqueWordAbbr(String[] dict){
		if(dict==null || dict.length==0)
			return;
		map = new HashMap<String, List<String>>();

		for(String s : dict){
			String str = "";
			if(s.length <= 2)
				str = s;
			else
				str += s.charAt(0) + (s.length()-2 +"")+ s.charAt(s.length()-1);

			if(!map.containsKey(str)){
				map.put(str, new ArrayList<String>());
			}
			if(!map.get(str).contains(s)){
				map.get(str).add(s);
			}
		}
	}

	public boolean isUnique(String word){
		if(map == null || map.size()==0)
			return true;

		String str = "";
		if(word.length() <= 2)
			str = word;
		else{
			str += word.charAt(0) + (word.length()-2+"") + word.charAt(word.length()-1);
		}

		if(map.containsKey(str) && map.get(str).size() == 1 && map.get(str).get(0).equals(word))
			return true;

		return !map.containsKey(str);

	}
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");
