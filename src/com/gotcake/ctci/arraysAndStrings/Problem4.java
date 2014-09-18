package com.gotcake.ctci.arraysAndStrings;

import java.util.HashMap;

/**
 * Problem 1.4: Create an algorithm to check if two strings are anagrams
 * @author Aaron Cake
 */
public class Problem4 {

    /**
     * Checks if Strings a and b are anagrams of one another
     * Runs in O(n) time
     * @param a a string
     * @param b a string to check against a for anagram-ness
     * @return true if a and b are anagrams, false otherwise
     */
    public static boolean areStingsAnagrams(String a, String b) {

        int len = a.length();

        // different length strings cannot be anagrams. Also this algorithm requires same length strings.
        if (len != b.length()) return false;

        HashMap<Character, Integer> charCounts = new HashMap<>();

        // add all the characters from a into the map
        for (int i=0; i<len; ++i) {
            char ch = a.charAt(i);
            Integer count = charCounts.get(ch);
            if (count == null)
                count = 0;
            charCounts.put(ch, ++count);
        }

        // for each character in b, remove it from the map, and check the count
        for (int i=0; i<len; ++i) {
            char ch = b.charAt(i);
            Integer count = charCounts.get(ch);
            // if the character did not exist in a or there are more in b than a, return false
            if (count == null || count == 0)
                return false;
            charCounts.put(ch, --count);
        }

        // check for extra chars in a that are not in b
        //return charCounts.isEmpty(); // moot check, would have failed by now

        return true;
    }

}
