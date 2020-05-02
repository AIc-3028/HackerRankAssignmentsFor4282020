package com.company;
import java.util.*;



public class JavaLoop1 {



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            int n = scanner.nextInt();
            for (int i = 0; i <= n; i++){
                System.out.printf("%d x %d = %d%n", N, i, N * i);
            }
            scanner.close();
        }
    }


