package com.brianteeter.leetcode;

/**
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
 * only have a single space separating the words. Do not include any extra spaces.
 *
 * See: https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=top-interview-150
 *
 */
public class Problem151_ReverseWordsInString
{
    public String reverseWords(String s)
    {
        if (s == null || s.equals(""))
        {
            return "";
        }

        // Split the string by spaces, this regex will treat one or more spaces the same:
        String[] split_string = s.split("\\s+");
        String result = "";

        // Traverse the split string array and output in reverse order:
        for (int i = split_string.length - 1; i >= 0; i--)
        {
            result += split_string[i] + " ";
        }
        result = result.trim();

        return result;
    }
}
