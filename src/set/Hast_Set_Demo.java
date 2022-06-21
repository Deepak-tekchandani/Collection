package set;

import java.util.HashSet;
import java.util.Set;

public class Hast_Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet doesn't maintain the insertion order.
		// Here, elements are inserted on the basis of their hashcode.
		Set<Integer> hastSet = new HashSet<>();
		hastSet.add(32);
		hastSet.add(2);
		hastSet.add(54);
		hastSet.add(21);
		hastSet.add(65);
		hastSet.add(100);
		hastSet.add(7);
		hastSet.add(32); // not allow the duplicate elements
		
		System.out.println(hastSet);
		
		hastSet.remove(65);
		System.out.println(hastSet);

		Set<Integer> hastSet1 = new HashSet<>();

		hastSet1.add(143);
		hastSet1.add(123);
		hastSet.addAll(hastSet1);

		System.out.println("hastSet "+hastSet);
		
		System.out.println(hastSet.contains(7));
		System.out.println(hastSet.isEmpty());
		System.out.println(!hastSet.isEmpty());
		System.out.println(hastSet.size());
		
		hastSet.clear();
		System.out.println(hastSet);
		hastSet.add(32);
		

	}

}
