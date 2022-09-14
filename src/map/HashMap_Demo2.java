package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo2 {

    public static void main(String[] args) {
        Map<Integer , String> map =new HashMap();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        System.out.println(map.get(4));
        System.out.println("-------------1------------");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }
        System.out.println("-------------2------------");
        map.put(1,"two");
        map.putIfAbsent(1,"okay");
        map.put(null,"one");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }
        System.out.println("-------------3------------");
        map.remove(4,"one");// not remove b/c key and value not match
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }

        System.out.println("-------------4------------");
        map.replace(3,"threes");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }

        System.out.println("-------------5------------");
        map.replace(2,"two","twice");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }
        System.out.println("-------------7------------");
        for(Integer key :map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

        System.out.println("-------------6------------");
        map.replaceAll((k,v)->"deep");// not remove b/c key and value not match
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }


    }
}
