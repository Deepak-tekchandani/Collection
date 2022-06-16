package Queue;

import java.util.ArrayDeque;

public class Array_Deque_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		deque.offer(23);
		deque.offerFirst(12);
		deque.offerLast(33);
		deque.offerFirst(5);
		deque.offer(24);
		
		System.out.println(deque);
		
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		System.out.println(deque.poll());
		System.out.println("Poll : "+deque);
		
		System.out.println(deque.pollFirst());
		System.out.println("poll First : "+deque);
		
		System.out.println(deque.pollLast());
		System.out.println("poll last : "+deque);

	}

}
