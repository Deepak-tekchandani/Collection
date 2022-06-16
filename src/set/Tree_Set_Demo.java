package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hastSet = new TreeSet<>();
		hastSet.add(32);
		hastSet.add(2);
		hastSet.add(54);
		hastSet.add(21);
		hastSet.add(65);
		hastSet.add(7);
		hastSet.add(32); // not allow the duplicate elements
		
		System.out.println(hastSet);
		
		hastSet.remove(65);
		System.out.println(hastSet);
		
		System.out.println(hastSet.contains(7));
		System.out.println(hastSet.isEmpty());
		System.out.println(!hastSet.isEmpty());
		System.out.println(hastSet.size());
		
		hastSet.clear();
		System.out.println(hastSet);
		hastSet.add(32);
		

	}

}
