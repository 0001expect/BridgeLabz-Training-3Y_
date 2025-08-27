package control_flows;

import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println("Invalid access: " + names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Invalid access: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }
        handleException(names);
    }
}

