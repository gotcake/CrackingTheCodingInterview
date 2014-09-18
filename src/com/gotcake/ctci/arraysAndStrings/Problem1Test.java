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

    private static void shouldHaveNoDupes(String s) {
        assertTrue("'"+s+"' should have no dupes", allCharsUnique(s));
    }

    private static void shouldHaveDupes(String s) {
        assertFalse("'"+s+"' should have at least one dupe", allCharsUnique(s));
    }

    private static void shouldHaveNoDupes_noStructures(String s) {
        assertTrue("'"+s+"' should have no dupes", allCharsUniqueNoDataStructures(s));
    }

    private static void shouldHaveDupes_noStructures(String s) {
        assertFalse("'"+s+"' should have at least one dupe", allCharsUniqueNoDataStructures(s));
    }

    @Test
    public void testAllCharsUnique_zeroLength() throws Exception {
        shouldHaveNoDupes(EMPTY_STRING);
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_zeroLength() throws Exception {
        shouldHaveNoDupes_noStructures(EMPTY_STRING);
    }

    @Test
    public void testAllCharsUnique_noDupesShort() throws Exception {
        shouldHaveNoDupes(SHORT_STRING_NO_DUPES);
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_noDupesShort() throws Exception {
        shouldHaveNoDupes_noStructures(SHORT_STRING_NO_DUPES);
    }

    @Test
    public void testAllCharsUnique_noDupesLong() throws Exception {
        shouldHaveNoDupes(LONG_STRING_NO_DUPES);
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_noDupesLong() throws Exception {
        shouldHaveNoDupes_noStructures(LONG_STRING_NO_DUPES);
    }

    @Test
    public void testAllCharsUnique_adjacentCharsDupe() throws Exception {
        shouldHaveDupes(ADJACENT_CHARS_DUPE);
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_adjacentCharsDupe() throws Exception {
        shouldHaveDupes_noStructures(ADJACENT_CHARS_DUPE);
    }

    @Test
    public void testAllCharsUnique_endCharsDupe() throws Exception {
        shouldHaveDupes(STRING_DUPE_ENDS);
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_endCharsDupe() throws Exception {
        shouldHaveDupes_noStructures(STRING_DUPE_ENDS);
    }

    @Test
    public void testAllCharsUnique_manyDupes() throws Exception {
        shouldHaveDupes(STRING_MANY_DUPES);
    }

    @Test
    public void testAllCharsUniqueNoDataStructures_manyDupes() throws Exception {
        shouldHaveDupes_noStructures(STRING_MANY_DUPES);
    }


}