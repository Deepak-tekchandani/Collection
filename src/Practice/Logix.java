package Practice;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.lang.reflect.Array;
import java.util.*;

public class Logix {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        //Palindrome Integer
//        System.out.println("Enter number : ");
//        int n = obj.nextInt();
//        int rev,sum=0,temp;
//        temp=n;
//        while(n>0){
//            rev = n%10;
//            sum=(sum*10)+rev;
//
//            n=n/10;
//        }
//        if (temp==sum){
//            System.out.println("yes Palindrome : "+sum);
//        }
//        else
//        System.out.println("not Palindrome : "+sum);


//        //Palindrome String
//        System.out.println("Enter String : ");
//        String n = obj.nextLine();
//        String rev="";
//
//        for(int i=n.length()-1 ; i>=0 ; i--){
//         rev=rev+n.charAt(i);
//        }
//        System.out.println(rev);
//        if (n.equals(rev)){
//            System.out.println("yes Palindrome : "+rev);
//        }
//        else
//            System.out.println("not Palindrome : "+rev);


        //remove the depulicate character from String and then find size
//        Set ch = new LinkedHashSet();
//        System.out.println("Enter number : ");
//        String n = obj.nextLine();
//        for(int i=0  ; i<n.length() ; i++){
//            ch.add(n.charAt(i));
//        }
//        System.out.println(ch.size());


            //find the 2nd largest number from Array
            Integer arr[] = {3, 54, 7, 4, 1, 5, 8, 9};
//            Arrays.sort(arr);
//            System.out.println(arr.length);
//            System.out.println(arr[arr.length-2]);

            List<Integer> list = Arrays.asList(arr);
            Collections.sort(list);
            System.out.println(list);
            System.out.println(list.size());
            System.out.println(list.get(list.size()-2));


//        System.out.println("Enter number : ");
//        int num = obj.nextInt();
//            for (int i = 2 ; i<num ; i++){
//                int count=0;
//                for (int j=2 ; j<i ; j++){
//                    if (i%j==0){
//                        count++;
//                    }
//                }
//                if (count==0){
//                    System.out.println("prime number : "+i);
//                }
//            }


    }
}
