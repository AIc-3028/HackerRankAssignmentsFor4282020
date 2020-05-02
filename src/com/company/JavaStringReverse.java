package com.company;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        // New Scanner named "sc"
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        //The length of "a" called "length"
        int length = a.length();

        //Creates an empty string
        String rev = "";


        //Starts placing the characters of "a" in reverse starting from the last letter
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }

        //Compares "rev" to "a"
        if (a.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(rev);
    }
}
