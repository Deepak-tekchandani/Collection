package map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> number = new HashMap<String, Integer>();
		
		number.put("one", 1);
		number.put("two", 2);
		number.put("Three", 3);
		number.put("Four", 4);
		
//		if(!number.containsKey("two")){
//			number.put("two", 32);
//		}
		
		number.putIfAbsent("two", 32);
		
		  
		
		System.out.println(number);
		
		for(Map.Entry<String,Integer> e:number.entrySet()) {
			System.out.println("obj : "+e);
			System.out.println("Key  : "+e.getKey());
			System.out.println("value  :"+e.getValue());
			
		}
		
		for(String key : number.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value : number.values()) {
			System.out.println(value);
		}
		
		System.out.println(number.containsValue(3));
		System.out.println(number.isEmpty());

	}

}
