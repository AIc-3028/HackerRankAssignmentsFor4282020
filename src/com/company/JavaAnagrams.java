package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            // test for invalid input
            if( a == null || b == null || a.equals("") || b.equals("") )
                throw new IllegalArgumentException();

// initial quick test for non-anagrams
            if ( a.length() != b.length() )
                return false;

            a = a.toLowerCase();
            b = b.toLowerCase();

// populate a map with letters and frequencies of String b
            Map<Character, Integer> map = new HashMap<>();

            for (int k = 0; k < b.length(); k++){
                char letter = b.charAt(k);

                if( ! map.containsKey(letter)){
                    map.put( letter, 1 );
                } else {
                    Integer frequency = map.get( letter );
                    map.put( letter, ++frequency );
                }
            }

// test each letter in String a against data in the map
// return if letter is absent in the map or its  frequency is 0
// otherwise decrease the frequency by 1

            for (int k = 0; k < a.length(); k++){
                char letter = a.charAt(k);

                if( ! map.containsKey( letter ) )
                    return false;

                Integer frequency = map.get( letter );

                if( frequency == 0 )
                    return false;
                else
                    map.put( letter, --frequency);
            }
// if the code got that far it is an anagram
            return true;
        }

        static boolean isAnagram2(String a, String b) {
            a = a.toLowerCase();
            b = b.toLowerCase();
            boolean r = true;
            if (a.length()!=b.length()){
                return false;
            }
            int n = 0;
            int m = 0;
            for(int i = 0;i<a.length();i++){
                if( a.contains(b.substring(i,i+1)) && b.contains(a.substring(i,i+1))){
                    n = (int)a.charAt(i)+n;
                    m = (int)b.charAt(i)+m;
                }
                else{
                    return false;
                }
            }
            return m!=n?false:true;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ans = isAnagram(a, b);
            boolean ans2 = isAnagram2(a, b);
            System.out.println( (ans) ? "Anagrams" : "Not Anagrams" );
            System.out.println( (ans2) ? "Anagrams" : "Not Anagrams" );
        }

        // Made By coderator

    }



