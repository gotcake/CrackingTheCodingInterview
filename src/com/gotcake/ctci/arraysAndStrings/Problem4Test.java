package com.gotcake.ctci.arraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.gotcake.ctci.arraysAndStrings.Problem4.*;

public class Problem4Test {

    private static void shouldBeAnagrams(String a, String b) {
        assertTrue("'"+a+"' and '"+b+"' should be anagrams", areStingsAnagrams(a, b));
    }

    private static void shouldNotBeAnagrams(String a, String b) {
        assertFalse("'"+a+"' and '"+b+"' should NOT be anagrams", areStingsAnagrams(a, b));
    }

    @Test
    public void testAreStingsAnagrams_empty() throws Exception {
        shouldBeAnagrams("","");
    }

    @Test
    public void testAreStingsAnagrams_single() throws Exception {
        shouldBeAnagrams("a", "a");
    }

    @Test
    public void testAreStingsAnagrams_1() throws Exception {
        shouldBeAnagrams("abcdef", "bcdfea");
    }

    @Test
    public void testAreStingsAnagrams_non_end() throws Exception {
        shouldNotBeAnagrams("abcdef", "abcdez");
    }

    @Test
    public void testAreStingsAnagrams_2() throws Exception {
        shouldBeAnagrams("silent", "listen");
    }

    @Test
    public void testAreStingsAnagrams_non_first() throws Exception {
        shouldNotBeAnagrams("abcdef", "zbcdef");
    }

    @Test
    public void testAreStingsAnagrams_non_length() throws Exception {
        shouldNotBeAnagrams("this is a test", "hello world");
    }

}