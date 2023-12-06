package com.brianteeter.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestProblem290_WordProblem
{
    @Test
    public void testPatternMatchSuccess1()
    {
        Problem290_WordProblem p290 = new Problem290_WordProblem();
        boolean result = p290.wordPattern("aba", "these words these");
        assertTrue(result);
    }

    @Test
    public void testPatternMatchSuccess2()
    {
        Problem290_WordProblem p290 = new Problem290_WordProblem();
        boolean result = p290.wordPattern("cat", "my kitty oreo");
        assertTrue(result);
    }

    @Test
    public void testPatternMatchSuccess3()
    {
        Problem290_WordProblem p290 = new Problem290_WordProblem();
        boolean result = p290.wordPattern("catxr", "my kitty oreo is cute");
        assertTrue(result);
    }

    @Test
    public void testPatternMatchFail1()
    {
        Problem290_WordProblem p290 = new Problem290_WordProblem();
        boolean result = p290.wordPattern("catxr", "my kitty oreo is totally cute");
        assertFalse(result);
    }
}
