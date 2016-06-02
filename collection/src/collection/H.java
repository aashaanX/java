package collection;

import java.util.PriorityQueue;

// implementation of priority Queue
public class H {
	public static void main(String[] args) {
		PriorityQueue q1 = new PriorityQueue();
		q1.add(10);
		q1.add(2);
		q1.add(30);
		q1.add(4);
		q1.add(50);
		q1.add(6);
		q1.add(75);
		q1.add(8);
		q1.add(90);
		// the data entered in priority queue is not based on any sorting order
		// it is based on priority(Unknown)
		System.out.println(q1);
		// peek() will fetch the element with lowest value in a priority Queue.
		System.out.println(q1.peek());
		// poll() will remove the pointed element
		q1.poll();
		System.out.println(q1);
	}

}
