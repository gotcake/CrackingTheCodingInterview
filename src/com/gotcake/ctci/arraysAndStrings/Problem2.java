package com.gotcake.ctci.arraysAndStrings;

/**
 * Problem 1.2
 * Write code to reverse a c-style string.
 */
public class Problem2 {

    /**
     * Reverses a c-style string. Note this code doesn't make much sense in Java. Just imagine this is c...
     * Executes in O(n) time
     * @param cstr the null-terminated string to reverse
     * @return the same cstr that was passed in, after it has been reversed
     * @throws java.lang.Exception if no null terminator was found
     */
    public static char[] reverseCString(char[] cstr) throws Exception {

        int len = strlen(cstr), // O(n)
             halfLen = len / 2;

        for (int i=0, j=len-1; i<halfLen; ++i, --j) {
            char tmp = cstr[i];
            cstr[i] = cstr[j];
            cstr[j] = tmp;
        }

        return cstr;

    }

    /**
     * Gets the length of the null-terminated c-string
     * @param cstr the c-string to get the length of
     * @return the length of the string
     * @throws Exception no null terminator found (yeah this isn't c after all)
     */
    public static int strlen(char[] cstr) throws Exception {
        for (int i=0; i<cstr.length; i++) {
            if (cstr[i] == '\0')
                return i;
        }
        // if we reached here it means there was no null-terminator.
        // note that in c, the code would simply continue out of bounds
        throw new Exception("No null terminator found.");
    }

}
