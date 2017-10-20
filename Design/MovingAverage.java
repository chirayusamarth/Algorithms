/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
*/

public class MovingAverage{

	Queue<Integer> queue;
	int sum = 0;
	int window_size = 0;

	public MovingAverage(int size){
		queue= new LinkedList<Integer>();
		window_size = size;
	}

	public double next(int val){
		if(queue.size() > window_size){
			int top = queue.poll();
			sum = sum - top;
		}
		queue.add(val);
		sum += val;
		double avg = (double) sum/window_size;
		return avg;
	}
}
