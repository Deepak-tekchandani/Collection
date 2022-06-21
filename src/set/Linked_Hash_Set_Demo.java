package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LinkedHashSet class maintains insertion order.
		Set<Integer> hastSet = new LinkedHashSet<>();
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
