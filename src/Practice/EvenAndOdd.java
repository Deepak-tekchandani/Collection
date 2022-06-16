package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenAndOdd {

    public static void main(String[] args) {

        List list = new ArrayList();

        List <Integer> even = new ArrayList();
        List <Integer> odd = new ArrayList();

        for (int i = 0 ; i<=30 ; i++)
        {
            list.add(i);
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {

            Integer integer = (Integer) iterator.next();
//        for (int i=0 ; i<list.size() ; i++){

            if (integer%2==0) {
                even.add(integer);
            }

            else {
                odd.add(integer);
            }
        }
        even.remove(6);
        even.add(3,7);
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);

    }
}
