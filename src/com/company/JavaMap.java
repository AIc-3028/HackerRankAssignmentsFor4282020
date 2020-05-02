package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    //Complete this code or write your own from scratch
    public static void main(String[] argh) {
        //New scanner named "in"
        Scanner in = new Scanner(System.in);

        // Scans the next # typed and names it "n"
        int n = in.nextInt();

        //Takes the next String
        in.nextLine();

        //
        Map<String, Integer> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();

    }
}