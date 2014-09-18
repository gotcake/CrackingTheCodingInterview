package com.gotcake.ctci.arraysAndStrings;

/**
 * Problem 1.3: Design an algorithm to remove the duplicate characters in a string without using
 * any additional buffer. (note: this was stretched a bit cause java strings are immutable)
 */
public class Problem3 {

    /**
     * Removes duplicate characters from a string.
     * Executes in O(n^2) time
     * @param str the string to remove dupes from
     * @return a string with the dupes removed
     */
    public static String removeDups(String str) {
        // here we make a StringBuilder from the string because strings in java are immutable..
        StringBuilder s = new StringBuilder(str);

        for (int i=0; i<s.length()-1; ++i) {
            char ch = s.charAt(i);
            int other = i+1;
            do {
                other = s.indexOf(String.valueOf(ch), other); // O(n) (aggregate O(n) over all iterations of do..while)
                if (other != -1)
                    s.deleteCharAt(other);  // O(n) (aggregate O(n^2) for worst case, but removes iterations from outer loop)
            } while (other != -1);
        }

        // once again, we must make a copy because we used the StringBuilder and strings are immutable
        return s.toString();
    }

}
