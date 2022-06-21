package map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("One", 1);
		treeMap.put("Four", 4);
		treeMap.put("Three", 3);
		treeMap.put("Two", 2);
		
		treeMap.remove("Three");
		
		System.out.println(treeMap);

	}

}
