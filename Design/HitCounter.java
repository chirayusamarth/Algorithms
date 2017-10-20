/*

Design a hit counter which counts the number of hits received in the past 5 minutes.

Each function accepts a timestamp parameter (in seconds granularity) and you may assume that calls are being made to the system in chronological order (ie, the timestamp is monotonically increasing). You may assume that the earliest timestamp starts at 1.

It is possible that several hits arrive roughly at the same time.

Example:
HitCounter counter = new HitCounter();

// hit at timestamp 1.
counter.hit(1);

// hit at timestamp 2.
counter.hit(2);

// hit at timestamp 3.
counter.hit(3);

// get hits at timestamp 4, should return 3.
counter.getHits(4);

// hit at timestamp 300.
counter.hit(300);

// get hits at timestamp 300, should return 4.
counter.getHits(300);

// get hits at timestamp 301, should return 3.
counter.getHits(301); 
Follow up:
What if the number of hits per second could be very large? Does your design scale?

 **** Yes, it scales because hit() will be O(1) time and getHits() will be O(300) time.
 If we use the queue solution, there will be lots of entries in the queue since number of hits per timestamp is high.
 We will have to compare queue.peek() for every hit but in HashMap we are just comparing timestamps, so time will be at max O(300).****

*/

public class HitCounter{
	int hits;
	Map<Integer, Integer> map;
	public HitCounter(){
		map = new HashMap<Integer, Integer>();
		hits = 0;
	}

	public void hit(int timestamp){
		hits += 1;
		map.put(timestamp, hits);
	}

	public int getHits(int timestamp){
		for(int key : map.keySet()){
			if(timestamp - key >= 300){
				int removeHits= map.get(key);
				hits = hits - removeHits;
			}
		}
		return hits;
	}
}
