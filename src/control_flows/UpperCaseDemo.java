package control_flows;

import java.util.Scanner;

public class UpperCaseDemo {
    public static String myToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String customUpper = myToUpperCase(text);
        String builtInUpper = text.toUpperCase();
        System.out.println("Custom UpperCase: " + customUpper);
        System.out.println("Built-in UpperCase: " + builtInUpper);
        System.out.println("Comparison result: " + compareStrings(customUpper, builtInUpper));
    }
}

