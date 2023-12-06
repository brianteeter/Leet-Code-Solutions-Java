package com.brianteeter.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestProblem228_SummaryRanges
{
    @Test
    public void testRangeSuccess1()
    {
        Problem228_SummaryRanges p228 = new Problem228_SummaryRanges();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = p228.summaryRanges(nums);

        List<String> expected = new ArrayList<>();
        expected.add("0->2");
        expected.add("4->5");
        expected.add("7");

        assertTrue(result.equals(expected));
    }

    @Test
    public void testRangeSuccess2()
    {
        Problem228_SummaryRanges p228 = new Problem228_SummaryRanges();
        int[] nums = {-1};
        List<String> result = p228.summaryRanges(nums);

        List<String> expected = new ArrayList<>();
        expected.add("-1");

        assertTrue(result.equals(expected));
    }

    @Test
    public void testRangeSuccess3()
    {
        Problem228_SummaryRanges p228 = new Problem228_SummaryRanges();
        int[] nums = {-2147483648,-2147483647,2147483647};
        List<String> result = p228.summaryRanges(nums);

        List<String> expected = new ArrayList<>();
        expected.add("-2147483648->-2147483647");
        expected.add("2147483647");

        assertTrue(result.equals(expected));
    }

    @Test
    public void testRangeSuccess4()
    {
        Problem228_SummaryRanges p228 = new Problem228_SummaryRanges();
        int[] nums = {-2,-1,1,2,2147483646,2147483647};
        List<String> result = p228.summaryRanges(nums);

        List<String> expected = new ArrayList<>();
        expected.add("-2->-1");
        expected.add("1->2");
        expected.add("2147483646->2147483647");

        assertTrue(result.equals(expected));
    }

    @Test
    public void testRangeSuccess5()
    {
        Problem228_SummaryRanges p228 = new Problem228_SummaryRanges();
        int[] nums = {0,2,3,4,6,8,9};
        List<String> result = p228.summaryRanges(nums);

        List<String> expected = new ArrayList<>();
        expected.add("0");
        expected.add("2->4");
        expected.add("6");
        expected.add("8->9");

        assertTrue(result.equals(expected));
    }
}
