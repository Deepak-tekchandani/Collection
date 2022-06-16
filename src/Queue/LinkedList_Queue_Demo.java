package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(11);
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(15);
		queue.offer(16);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.peek()); // which element will go out / next for out
		
		//Three Other Functions. There function through the Exception when find nothing
		//1. add();
		//2. element();
		//3. remove();

	}

}
