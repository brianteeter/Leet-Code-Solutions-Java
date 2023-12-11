package com.brianteeter.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblem151_ReverseWordsInString
{

    @Test
    public void testString1()
    {
        Problem151_ReverseWordsInString p151 = new Problem151_ReverseWordsInString();
        String result = p151.reverseWords("a good   example");

        assertEquals(result, "example good a");
    }

    @Test
    public void testString2()
    {
        Problem151_ReverseWordsInString p151 = new Problem151_ReverseWordsInString();
        String result = p151.reverseWords("a b super duper   example");

        assertEquals(result, "example duper super b a");
    }
}
