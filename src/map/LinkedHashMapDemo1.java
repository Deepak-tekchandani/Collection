package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {
    public static void main(String args[]) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(103,"Rahul");
        map.put(101,"Amit");
        map.put(102,"Vijay");

        System.out.println("Before invoking remove() method: "+map);
        map.putIfAbsent(104,"deep");
        map.put(103,"neeraj");
        System.out.println("After invoking remove() method: "+map);
        map.remove(102);
        map.replace(101,"sonu");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}