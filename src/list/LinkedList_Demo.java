package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<String> linkList = new LinkedList<>();
		
		//size : n for 10 elemants
				//size : n + n/2 + 1; more than 10 elemants; auto copy old array to new array;

		linkList.add("deepak");

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		System.out.println(list2);
		
		list2.add(5);
		
		System.out.println(list2);
		
		list2.add(3, 7);
		
		System.out.println(list2);

		LinkedList<Integer> list3 = new LinkedList<>();
		list3.add(11);
		list3.add(22);
		
		list2.addAll(list3);
		System.out.println(list2);
		
		list3.add(33);
		list3.addAll(list2);
		
		System.out.println(list3);
		
		list3.remove(2); // remove  by index
		System.out.println(list3);
		
		list3.remove(Integer.valueOf(22)); //remove by value
		System.out.println(list3);
		
		list3.set(3, 900); // update the value;
		System.out.println(list3);
		
		
		System.out.println(list3.contains(111)); // elemant is present in the list
		
		System.out.println(list3.get(5)); // find/get the value
		
		list3.clear();
		System.out.println("clear the list3 : "+list3);

		System.out.println("list2 : "+list2);

		list2.addFirst(33);
		list2.addLast(55);
		System.out.println("list2 after add first and last : "+list2);

		//remove
		list2.removeFirst();
		list2.removeLast();
		System.out.println("list2 after remove first and last : "+list2);

		list2.removeFirstOccurrence(2);
		list2.removeLastOccurrence(4);
		System.out.println("list2 after removeOccurrence first and last : "+list2);

		System.out.println("list2 Hash code : "+list2.hashCode());
		//when we add/remove the elemant then shift the value and There the time complexity is O(n) as well;
		//in LinkedList has no_shifting
		

	}

}
