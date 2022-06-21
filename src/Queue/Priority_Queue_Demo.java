package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Priority give in Ascending order

		Queue<Integer> priorityQueue = new PriorityQueue<>();
		//Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

		priorityQueue.offer(11);
		priorityQueue.offer(2);
		priorityQueue.offer(23);
		priorityQueue.offer(143);
		priorityQueue.offer(17);
		priorityQueue.offer(4);
		
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());

	}
 
}
