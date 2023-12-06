package com.brianteeter.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestProblem205_IsomorphicStrings
{
    @Test
    public void testIsIsomorphicSuccess1()
    {
        Problem205_IsomorphicStrings p205 = new Problem205_IsomorphicStrings();

        assertTrue( p205.isIsomorphic("aba", "cdc"));
    }

    @Test
    public void testIsIsomorphicSuccess2()
    {
        Problem205_IsomorphicStrings p205 = new Problem205_IsomorphicStrings();

        assertTrue( p205.isIsomorphic("abaze", "cdcxs"));
    }

    @Test
    public void testIsIsomorphicFail1()
    {
        Problem205_IsomorphicStrings p205 = new Problem205_IsomorphicStrings();

        assertFalse( p205.isIsomorphic("abaze", "cdq"));
    }

    @Test
    public void testIsIsomorphicFail2()
    {
        Problem205_IsomorphicStrings p205 = new Problem205_IsomorphicStrings();

        assertFalse( p205.isIsomorphic("qqqqaa", "eeeeee"));
    }
}
