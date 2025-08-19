package java_fundamentals;

import java.util.*;
public class AreaofaCircle {
    public static void main(String[] args){
        double pi=3.14;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter radius of circle");
        double radius=sc.nextDouble();
        System.out.println("area of circle :"+(pi*radius*radius));

    }
}