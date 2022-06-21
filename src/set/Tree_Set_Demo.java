package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet class maintains ascending order.
		//Set<Integer> treeSet = new TreeSet<>();
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(32);
		treeSet.add(2);
		treeSet.add(54);
		treeSet.add(21);
		treeSet.add(65);
		treeSet.add(7);
		treeSet.add(32); // not allow the duplicate elements
		
		System.out.println(treeSet);

		treeSet.remove(65);
		System.out.println(treeSet);
		
		System.out.println(treeSet.contains(7));
		System.out.println(treeSet.isEmpty());
		System.out.println(!treeSet.isEmpty());
		System.out.println(treeSet.size());
		System.out.println("Lowest Value: "+treeSet.pollFirst());
		System.out.println("Highest Value: "+treeSet.pollLast());


		treeSet.clear();
		System.out.println(treeSet);
		treeSet.add(32);
		

	}

}
