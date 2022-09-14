package Practice;

import java.util.Scanner;

public class OopPrat {

    public static void getNumber(String n){

        String temp="";

//        int rev , temp , sum=0;
//        temp=n;
//        while (n>0){
//            rev=n%10;
//            sum = (sum*10)+rev;
//            n=n/10;
//
//        }
        for (int i=n.length()-1 ; i>=0 ; i--){
            temp =temp+n.charAt(i);
        }
        if (n.equals(temp)){
            System.out.println("yes : "+temp);
        }
        else
            System.out.println("No : "+temp);
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String value : ");
        String n = obj.nextLine();
        getNumber(n);

    }

}
