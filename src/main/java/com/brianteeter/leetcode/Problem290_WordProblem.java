package com.brianteeter.leetcode;

import java.util.HashMap;

public class Problem290_WordProblem
{
    public boolean wordPattern(String pattern, String s)
    {
        HashMap<Character, String> characterMapping = new HashMap<Character, String>();

        // Split the words in s into an array:
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
        {
            return false;
        }

        // ------------------------------------------------------------------------------------
        // For each character in the pattern, map it to a word in s.  If we find a case
        // where the mapping is invalid  then the strings are not isomorphic:
        // ------------------------------------------------------------------------------------
        for (int i = 0; i < pattern.length(); i++)
        {
            Character pattern_next = pattern.charAt(i);
            String next_word = words[i];

            String hashLookupResult = characterMapping.get(pattern_next);

            if (hashLookupResult == null)
            {
                // ------------------------------------------------------------------------------------
                // Make sure the target character isn't already mapped:
                // ------------------------------------------------------------------------------------
                boolean characterAlreadyMapped = characterMapping.containsValue(next_word);

                if (characterAlreadyMapped == true)
                {
                    return false;
                }

                characterMapping.put(pattern_next, next_word);
            }
            else if (hashLookupResult.equals(next_word) != true)
            {
                return false;
            }
        }
        return true;
    }
}
