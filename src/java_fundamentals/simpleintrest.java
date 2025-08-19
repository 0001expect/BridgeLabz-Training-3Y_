package java_fundamentals;

import java.util.*;
public class simpleintrest {
    public static void main( String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the principal amount :");
        int principal=sc.nextInt();
        System.out.println("enter the rate of intrest :");
        int rate=sc.nextInt();
        System.out.println("enter the time :");
        int time=sc.nextInt();
        System.out.println("Simple Intrest is :"+((principal*rate*time)/100));

    }

}