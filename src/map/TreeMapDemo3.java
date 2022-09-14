package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo3 {

    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        System.out.println(map.get(4));

        for(Integer entry:map.keySet()){
            System.out.println(entry+" "+map.get(entry));
        }
        map.put(0,"zero");
        map.putIfAbsent(4,"five");

        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("headMap: "+map.headMap(2,true));
        System.out.println("tailMap: "+map.tailMap(2,true));
        System.out.println("subMap: "+map.subMap(1,4));
    }
}
