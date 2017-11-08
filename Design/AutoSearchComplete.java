/*

Design a search autocomplete system for a search engine. Users may input a sentence (at least one word and end with a special character ‘#’). For each character they type except ‘#’, you need to return the top 3 historical hot sentences that have prefix the same as the part of sentence already typed. Here are the specific rules:

The hot degree for a sentence is defined as the number of times a user typed the exactly same sentence before. 
The returned top 3 hot sentences should be sorted by hot degree (The first is the hottest one). If several sentences have the same degree of hot, you need to use ASCII-code order (smaller one appears first). 
If less than 3 hot sentences exist, then just return as many as you can. 
When the input is a special character, it means the sentence ends, and in this case, you need to return an empty list. 
Your job is to implement the following functions:

The constructor function:

AutocompleteSystem(String[] sentences, int[] times): This is the constructor. The input is historical data. Sentences is a string array consists of previously typed sentences. Times is the corresponding times a sentence has been typed. Your system should record these historical data.

Now, the user wants to input a new sentence. The following function will provide the next character the user types:

List input(char c): The input c is the next character typed by the user. The character will only be lower-case letters (‘a’ to ‘z’), blank space (’ ‘) or a special character (‘#’). Also, the previously typed sentence should be recorded in your system. The output will be the top 3 historical hot sentences that have prefix the same as the part of sentence already typed.

*/

public class AutoSearchComplete{

	class TrieNode{
		Map<Character, TrieNode> children;
		Map<String, Integer> counts;
		boolean isWord;

		public TrieNode(){
			children = new HashMap<Character, TrieNode>();
			counts=  new HashMap<String, Integer>();
			isWord = false;
		}
	}

	TrieNode root;
	String prefix;

	public AutoSearchComplete(String sentences[], int times[i]){
		root= new TrieNode();
		prefix = "";
		for(int i=0;i<sentences.length;i++){
			add(sentences[i], times[i]);
		}
	}

	private void add(String s, int count){
		TrieNode curr= root;
		for(char c : s.toCharArray()){
			TrieNode next = curr.children.get(c);
			if(next == null){
				next = new TrieNode();
				curr.children.put(c, next);
			}
			curr= next;
			curr.counts.put(s, curr.counts.getOrDefault(s, 0)+count);
		}
		curr.isWord = true;
	}

	private List<String> input(char c){
		if(c == '#'){
			add(prefix, 1);
			prefix = "";
			return new ArrayList<String>();
		}

		prefix = prefix + c;
		TrieNode curr = root;
		for(char ch : prefix.toCharArray()){
			TrieNode next = curr.children.get(ch);
			if(next == null)
				return new ArrayList<String>();
			curr= next;
		}

		PriorityQueue<Pair> pq= new PriorityQueue<Pair>((a,b) -> a.count == b.count ? a.str.compareTo(b.str) : b.count - a.count);
		for(String s : curr.counts.entrySet()){
			pq.offer(new Pair(s, curr.counts.get(s)));
		}

		List<String> res= new ArrayList<String>();
		for(int i=0;i<3 && !pq.isEmpty();i++){
			res.add(pq.poll().str);
		}
		return res;

	}

	class Pair{
		String str;
		int count;

		Pair(String str, int count){
			this.str= str;
			this.count= count;
		}
	}
}
