package com.company;
import java.util.*;

public class Java1DArray {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        // Will read the next # as the size of the Array and attribute it to "n"
        int n = scan.nextInt();

        //Creates a Array named "a" using "n"
        int[] a = new int[n];

        // This will repeat "n" times and each time it will add the # scanned to "a"
        for(int i = 0; i < n; i++){
            a[i]=scan.nextInt();
        }

        scan.close();

        // Prints each sequential element in array "a"
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    }

