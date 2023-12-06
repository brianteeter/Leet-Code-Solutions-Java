package com.brianteeter.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 * <p>
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * <p>
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * <p>
 * Each range [a,b] in the list should be output as:
 * <p>
 * "a->b" if a != b
 * "a" if a == b
 * <p>
 * See: https://leetcode.com/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150
 */
public class Problem228_SummaryRanges
{
    public List<String> summaryRanges(int[] nums)
    {
        List<String> ranges = new ArrayList<String>();

        // ------------------------------------------------------------------------------------------------
        // Step through the array.  We create a range for each contiguous set of numbers
        // then start a new range, when there is a break in the range.
        // ------------------------------------------------------------------------------------------------
        for (int i = 0; i < nums.length; i++)
        {
            int start_value = nums[i];

            // ------------------------------------------------------------------------------------------------
            // While the range of sequential numbers holds advance the counter:
            // ------------------------------------------------------------------------------------------------
            while (i + 1 < nums.length && (nums[i] + 1 == nums[i + 1]))
            {
                i++;
            }

            // ------------------------------------------------------------------------------------------------
            // If we get here its because we found a value out of sequence or the end of the values:
            // ------------------------------------------------------------------------------------------------
            if (start_value != nums[i])
            {
                ranges.add("" + start_value + "->" + nums[i]);
            } else
            {
                ranges.add("" + start_value);
            }
        }

        return ranges;
    }
}
