package com.brianteeter.leetcode;

import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No
 * two characters may map to the same character, but a character may map to itself.
 *
 * See: https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150
 */
public class Problem205_IsomorphicStrings
{
    public boolean isIsomorphic(String s, String t)
    {
        HashMap<Character, Character> characterMapping = new HashMap<Character, Character>();

        // ------------------------------------------------------------------------------------
        // For each character in String s, map it to a character in t.  If we find a case
        // where the mapping is invalid  then the strings are not isomorphic:
        // ------------------------------------------------------------------------------------
        for (int i = 0; i < s.length(); i++)
        {
            Character s_next = s.charAt(i);
            Character t_next = t.charAt(i);

            Character hashLookupResult = characterMapping.get(s_next);

            if (hashLookupResult == null)
            {
                // ------------------------------------------------------------------------------------
                // Make sure the target character isn't already mapped:
                // ------------------------------------------------------------------------------------
                boolean characterAlreadyMapped = characterMapping.containsValue(t_next);

                if (characterAlreadyMapped == true)
                {
                    return false;
                }

                characterMapping.put(s_next, t_next);
            }
            else if (hashLookupResult.equals(t_next) != true)
            {
                return false;
            }
        }
        return true;
    }

}
