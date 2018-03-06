public class AutoCompleteSystem{
	class TrieNode{
		Map<Character, TrieNode> children;
		Map<String, Integer> counts;
		boolean isWord;

		public TrieNode(){
			children = new HashMap<Character, TrieNode>();
			counts= new HashMap<String, Integer>();
			isWord= false;
		}
	}

	TrieNode root;
	String prefix;
	public AutoCompleteSystem(String[] sentences, int[] times){
		root = new TrieNode();
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
			curr = next;
			curr.counts.put(s, curr.counts.getOrDefault(s, 0) + count);
		}
		curr.isWord = true;
	}

	private List<String> input(char c){
		if(c=='#'){
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
			curr = next;
		}

		PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> (a.count == b.count ? a.str.compareTo(b.str)) : b.count-a.count);
		for(String s : curr.counts.keySet()){
			pq.offer(new Pair(s, curr.counts.get(s)));
		}

		for(int i=0; i < 3 && !pq.isEmpty();i++){
			res.add(pq.poll().str);
		}
	}

	class Pair{
		String str;
		int count;

		Pair(String str, int count){
			this.str= str;
			this.count = count;
		}
	}
}