package com.gotcake.ctci.arraysAndStrings;

import org.junit.*;
import static org.junit.Assert.*;
import static com.gotcake.ctci.arraysAndStrings.Problem1.*;

public class Problem1Test {

    private static final String EMPTY_STRING = "";
    private static final String SHORT_STRING_NO_DUPES = "abc123xyz!@#$";
    private static final String LONG_STRING_NO_DUPES = "abcdefghijklmnopqrstuvwxyz 1234567890\t\n!@#$%^&*()";
    private static final String ADJACENT_CHARS_DUPE = "12345aa67";
    private static final String STRING_DUPE_ENDS = "abc1234567890a";
    private static final String STRING_MANY_DUPES = "this is a string with many dupes!";

    @Test
    public void testAllCharsUnique_zeroLength() throws Exception {
        assertTrue(allCharsUnique(EMPTY_STRING));
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_zeroLength() throws Exception {
        assertTrue(allCharsUniqueNoDataStructures(EMPTY_STRING));
    }

    @Test
    public void testAllCharsUnique_noDupesShort() throws Exception {
        assertTrue(allCharsUnique(SHORT_STRING_NO_DUPES));
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_noDupesShort() throws Exception {
        assertTrue(allCharsUniqueNoDataStructures(SHORT_STRING_NO_DUPES));
    }

    @Test
    public void testAllCharsUnique_noDupesLong() throws Exception {
        assertTrue(allCharsUnique(LONG_STRING_NO_DUPES));
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_noDupesLong() throws Exception {
        assertTrue(allCharsUniqueNoDataStructures(LONG_STRING_NO_DUPES));
    }

    @Test
    public void testAllCharsUnique_adjacentCharsDupe() throws Exception {
        assertFalse(allCharsUnique(ADJACENT_CHARS_DUPE));
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_adjacentCharsDupe() throws Exception {
        assertFalse(allCharsUniqueNoDataStructures(ADJACENT_CHARS_DUPE));
    }

    @Test
    public void testAllCharsUnique_endCharsDupe() throws Exception {
        assertFalse(allCharsUnique(STRING_DUPE_ENDS));
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_endCharsDupe() throws Exception {
        assertFalse(allCharsUniqueNoDataStructures(STRING_DUPE_ENDS));
    }

    @Test
    public void testAllCharsUnique_manyDupes() throws Exception {
        assertFalse(allCharsUnique(STRING_MANY_DUPES));
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_manyDupes() throws Exception {
        assertFalse(allCharsUniqueNoDataStructures(STRING_MANY_DUPES));
    }


}