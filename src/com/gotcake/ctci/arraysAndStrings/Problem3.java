package com.gotcake.ctci.arraysAndStrings;

/**
 * Problem 1.3: Design an algorithm to remove the duplicate characters in a string without using
 * any additional buffer. (note: this was stretched a bit cause java strings are immutable)
 * @author Aaron Cake
 */
public class Problem3 {

    /**
     * Removes duplicate characters from a string.
     * Executes in O(n^2) time
     * @param str the string to remove dupes from
     * @return a string with the dupes removed
     */
    public static String removeDups(String str) {

        int len = str.length();

        // optimize for length of 1 or less
        if (len < 2) return str;

        // here we make a StringBuilder from the string because strings in java are immutable..
        StringBuilder s = new StringBuilder(str);

        removeDups_better(s, len);

        // once again, we must make a copy because we used the StringBuilder and strings are immutable
        return s.toString();
    }

    private static void removeDups(StringBuilder s) {

        // here we might check for length, but that's already done in the above method

        for (int i=0; i<s.length()-1; ++i) {
            char ch = s.charAt(i);
            int other = i+1;
            do {
                other = s.indexOf(String.valueOf(ch), other); // O(n) (aggregate O(n) over all iterations of do..while)
                if (other != -1)
                    s.deleteCharAt(other);  // O(n) (aggregate O(n^2) for worst case, but removes iterations from outer loop)
            } while (other != -1);
        }
    }

    private static void removeDups_better(StringBuilder s, int len) {

        // here we might check for length, but that's already done in the above method

        for (int i=0; i<len-1; ++i) {
            char ch = s.charAt(i);
            int j = i+1;
            for (int k=i+1; k<len; k++) {
                char kch = s.charAt(k);
                if (kch != ch) {
                    if (j != k)
                        s.setCharAt(j, kch);
                    ++j;
                }
            }
            if (j < len) {
                len = j;
                if (ch != s.charAt(j))
                    ++len;
            }

        }

        s.delete(len, s.length());

    }

}
