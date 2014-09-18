package com.gotcake.ctci.arraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.gotcake.ctci.arraysAndStrings.Problem2.*;

public class Problem2Test {

    private static char[] makeCString(String str) {
        int len = str.length();
        char[] cstr = new char[len+1];
        System.arraycopy(str.toCharArray(),0, cstr, 0, len);
        cstr[len] = '\0';
        return cstr;
    }

    private void checkReversed(String orig, String reversed) throws Exception {
        assertArrayEquals(makeCString(reversed), reverseCString(makeCString(orig)));
    }

    @Test
    public void testReverseCString_single() throws Exception {
        checkReversed("a", "a");
    }

    @Test
    public void testReverseCString_double() throws Exception {
        checkReversed("aa", "aa");
    }

    @Test
    public void testReverseCString_palindrome() throws Exception {
        checkReversed("racecar", "racecar");
    }

    @Test
    public void testReverseCString_sentence() throws Exception {
        checkReversed("hello world, this is a test", "tset a si siht ,dlrow olleh");
    }
}