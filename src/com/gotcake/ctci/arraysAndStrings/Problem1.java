package com.gotcake.ctci.arraysAndStrings;

import java.util.HashSet;

/**
 * Problem 1.1
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class Problem1 {

    /**
     * Checks to see if all the characters in a string are unique (no duplicates) using
     * a HashSet to keep track of the characters already found.
     * Executes in O(n) time.
     * @param str the String to check
     * @return true if there all characters are unique, false if there are duplicates
     */
    public static boolean allCharsUnique(String str) {

        int len = str.length();

        // optimize for length of 1 or less
        if (len < 2) return true;

        // a hash set to hold the characters we've already found while iterating through the string
        HashSet<Character> charsFound = new HashSet<>();

        // iterate through all characters in the string
        for (int i=0; i<len; ++i) {
            Character ch = str.charAt(i);
            // the the character was already found, return false: O(1)
            if (charsFound.contains(ch))
                return false;

            // otherwise add the character the charsFound set: O(1)
            charsFound.add(ch);
        }

        // there are no duplicate characters if we've made it this far, return true
        return true;
    }

    /**
     * Checks to see if all the characters in a string are unique (no duplicates) by checking character
     * against all following characters.
     * Executes in O(n^2) time.
     * @param str the String to check
     * @return true if there all characters are unique, false if there are duplicates
     */
    public static boolean allCharsUniqueNoDataStructures(String str) {

        int lengthMinusOne = str.length() - 1;

        // iterate through all characters in the string
        for (int i=0; i<lengthMinusOne; ++i) {
            char ch = str.charAt(i);

            // check to see if this character is located later in the string: O(n)
            if (str.indexOf(ch, i+1) != -1)
                return false;

        }

        // there are no duplicate characters if we've made it this far, return true
        return true;
    }

}
