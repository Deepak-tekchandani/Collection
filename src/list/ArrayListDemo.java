package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arrayList = new ArrayList<>();

		//size : n for 10 elemants
				//size : n + n/2 + 1; more than 10 elemants; auto copy old array to new array;

		arrayList.add("deepak");

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);

		System.out.println(list2);

		list2.add(5);

		System.out.println(list2);

		list2.add(3, 7);

		System.out.println(list2);

		ArrayList<Integer> list3 = new ArrayList<>();
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

		//when we add/remove the elemant then shift the value and There the time complexity is O(n) as well;

	List list = new ArrayList();

	list.add("imran");
	list.add(34);
	list.add(1.2);


	for (Object o : list){
		System.out.println(o);
	}


		for (int i =0 ; i<list.size() ; i++ ){
			System.out.println(list.get(i));
		}

	}

}
