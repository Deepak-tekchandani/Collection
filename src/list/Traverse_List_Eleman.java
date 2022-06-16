package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Traverse_List_Eleman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		System.out.println(list);
		
		//Step1 : to Traverse the list through for loop.
		for (int i = 0; i <list.size(); i++) {
			System.out.println("Traverse List Through For loop : "+list.get(i));
			
		}
		
		//Step2 : to Traverse the list through foreach loop.
		for (Integer element : list) {
			System.out.println("Traverse List Through Foreach loop : "+element);
			
		}
		
		//Step3a : to Traverse the list through iterator.
		for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Traverse List Through iterator : "+integer);
			
		}
		
		//Step3b : to Traverse the list through iterator.
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
		System.out.println("iterator : "+it.next());
		}

	}

}
