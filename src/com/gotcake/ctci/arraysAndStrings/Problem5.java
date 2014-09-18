package com.gotcake.ctci.arraysAndStrings;

/**
 * Problem 1.5: Replace spaces with "%20"
 * @author Aaron Cake
 */
public class Problem5 {

    /**
     * Replaces spaces in a string with %20. Optimized for java strings.
     * Runs in O(n) time
     * @param str the string to replace any spaces in
     * @return str with any spaces replaced with %20
     */
    public static String replaceSpaces(String str) {

        int len = str.length();

        // optimize for empty string
        if (len == 0) return str;

        int spaceCount = 0;

        for (int i=0; i<len; ++i)
            if (str.charAt(i) == ' ')
                ++spaceCount;

        // optimize for no spaces
        if (spaceCount == 0)
            return str;

        ////
        // Note: in C, we would do an in-place replacement, but again, java has immutable strings...
        ////

        StringBuilder s = new StringBuilder(len + spaceCount * 2);

        for (int i=0; i<len; ++i) {
            char ch = str.charAt(i);
            if (ch == ' ')
                s.append("%20");
            else
                s.append(ch);
        }

        return s.toString();
    }

    /**
     * Does an in-place replacement of spaces in a StringBuilder with %20. Optimized for StringBuilders
     * Runs in O(n) time
     * @param str the StringBuilder to replace any spaces in
     * @return str with any spaces replaced with %20
     */
    public static StringBuilder replaceSpaces(StringBuilder str) {

        int len = str.length();

        // optimize for empty string
        if (len == 0) return str;

        int spaceCount = 0;

        for (int i=0; i<len; ++i)
            if (str.charAt(i) == ' ')
                ++spaceCount;

        // optimize for no spaces
        if (spaceCount == 0)
            return str;


        int toAdd = spaceCount * 2, j = len + toAdd;

        // make the StringBuilder long enough the handle the new string
        str.ensureCapacity(j);
        for (int i=0; i<toAdd; ++i)
            str.append('\0');

        // replace spaces and copying chars starting at the end of the string
        for (int i=len-1; i>=0; --i) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                str.setCharAt(--j, '0');
                str.setCharAt(--j, '2');
                str.setCharAt(--j, '%');
            } else {
                str.setCharAt(--j, ch);
            }
        }

        return str;
    }

}
