package map;

import java.util.EnumMap;
import java.util.Map;

class Bookss {
    int id;
    String name,author,publisher;
    int quantity;
    public Bookss(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class EnumMapDemo2WithBooks {
    // Creating enum
    public enum Key{
        One, Two, Three
    };
    public static void main(String[] args) {
        EnumMap<Key, Bookss> map = new EnumMap<Key, Bookss>(Key.class);
        // Creating Books
        Bookss b1=new Bookss(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Bookss b2=new Bookss(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Bookss b3=new Bookss(103,"Operating System","Galvin","Wiley",6);
        // Adding Books to Map
        map.put(Key.One, b1);
        map.put(Key.Two, b2);
        map.put(Key.Three, b3);
        // Traversing EnumMap
        for(Map.Entry<Key, Bookss> entry:map.entrySet()){
            Bookss b=entry.getValue();
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}