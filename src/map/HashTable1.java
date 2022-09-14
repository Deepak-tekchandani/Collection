package map;

import java.util.Hashtable;

public class HashTable1{
    public static void main(String args[]){
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Initial Map: "+map);
        //Inserts, as the specified pair is unique
        map.putIfAbsent(104,"Gaurav");
        System.out.println("Updated Map: "+map);
        //Returns the current value, as the specified pair already exist
        map.putIfAbsent(101,"deep");
        map.put(106,"six");
        System.out.println("Updated Map: "+map);

        System.out.println(map.getOrDefault(101, "Not Found"));
        System.out.println(map.getOrDefault(105, "Not Found"));
        map.remove(102);
        System.out.println("After remove: "+ map);
    }
}