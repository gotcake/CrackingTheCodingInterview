package com.gotcake.ctci.arraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.gotcake.ctci.arraysAndStrings.Problem5.*;

public class Problem5Test {

    private void checkReplacesTo(String start, String end) {
        assertEquals("'"+start+"' should be '"+end+"' after replacing spaces", end, replaceSpaces(start));
    }

    private void checkReplacesTo_SB(String start, String end) {
        assertEquals("'"+start+"' should be '"+end+"' after replacing spaces (StringBuilder method)", end, replaceSpaces(new StringBuilder(start)).toString());
    }

    @Test
    public void testReplaceSpaces_empty() throws Exception {
        checkReplacesTo("", "");
    }

    @Test
    public void testReplaceSpacesSB_empty() throws Exception {
        checkReplacesTo_SB("", "");
    }

    @Test
    public void testReplaceSpaces_spaceOnly() throws Exception {
        checkReplacesTo(" ", "%20");
    }

    @Test
    public void testReplaceSpacesSB_spaceOnly() throws Exception {
        checkReplacesTo_SB(" ", "%20");
    }

    @Test
    public void testReplaceSpaces_noSpace() throws Exception {
        checkReplacesTo("thisIsATest", "thisIsATest");
    }

    @Test
    public void testReplaceSpacesSB_noSpace() throws Exception {
        checkReplacesTo_SB("thisIsATest!", "thisIsATest!");
    }

    @Test
    public void testReplaceSpaces_sentence() throws Exception {
        checkReplacesTo("this is a test!", "this%20is%20a%20test!");
    }

    @Test
    public void testReplaceSpacesSB_sentence() throws Exception {
        checkReplacesTo_SB("this is a test!", "this%20is%20a%20test!");
    }

    @Test
    public void testReplaceSpaces_adjecent() throws Exception {
        checkReplacesTo("hello   world", "hello%20%20%20world");
    }

    @Test
    public void testReplaceSpacesSB_adjacent() throws Exception {
        checkReplacesTo_SB("hello   world", "hello%20%20%20world");
    }

    @Test
    public void testReplaceSpaces_ends() throws Exception {
        checkReplacesTo(" test ", "%20test%20");
    }

    @Test
    public void testReplaceSpacesSB_ends() throws Exception {
        checkReplacesTo_SB(" test ", "%20test%20");
    }

}