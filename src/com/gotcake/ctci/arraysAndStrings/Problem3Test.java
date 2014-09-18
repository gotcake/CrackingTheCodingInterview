package com.gotcake.ctci.arraysAndStrings;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.gotcake.ctci.arraysAndStrings.Problem3.*;

public class Problem3Test {

    private static void checkRemoveDups(String inString, String outString) {
        assertEquals(removeDups(inString), outString);
    }

    @Test
    public void testRemoveDups_empty() throws Exception {
        checkRemoveDups("", "");
    }

    @Test
    public void testRemoveDups_single() throws Exception {
        checkRemoveDups("a", "a");
    }

    @Test
    public void testRemoveDups_adjacent() throws Exception {
        checkRemoveDups("abccdef", "abcdef");
    }

    @Test
    public void testRemoveDups_ends() throws Exception {
        checkRemoveDups("abcdefa", "abcdef");
    }

    @Test
    public void testRemoveDups_many() throws Exception {
        checkRemoveDups("abcabcdefdef", "abcdef");
    }
}