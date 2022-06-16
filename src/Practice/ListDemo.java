package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Deepak");
        list.add(143);
        list.add(2.3);

        for(Object s : list){
            System.out.println("ArrayList "+s);
        }
        list.add(2,"zohib");
        list.set(2,"dee");
        for(Object s : list){
            System.out.println(s);
        }
        System.out.println(list.indexOf(list));
        System.out.println(list);

        List list1 = new LinkedList();

        list1.addAll(list);
        System.out.println("Contains value : "+list.contains(143));

        for(Object s : list1){
            System.out.println("LinkedList "+s);
        }
        list1.add(2,"zohib");
        list1.set(2,"dee");
        for(Object s : list1){
            System.out.println(s);
        }
        System.out.println(list1.indexOf(list1));
        System.out.println(list1);
    }
}
