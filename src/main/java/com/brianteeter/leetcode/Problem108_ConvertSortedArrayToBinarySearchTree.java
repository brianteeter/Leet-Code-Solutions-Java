package com.brianteeter.leetcode;

import com.brianteeter.leetcode.common.LeetCode_TreeNode;

public class Problem108_ConvertSortedArrayToBinarySearchTree
{
    public LeetCode_TreeNode sortedArrayToBST(int[] nums)
    {
        return recursivelyMakeBST(nums, 0, nums.length - 1);
    }

    public LeetCode_TreeNode recursivelyMakeBST(int nums[], int start, int end)
    {
        // Break from recursion:
        if (start > end)
        {
            return null;
        }

        // Find the midpoint of what was passed in:
        int midpoint = start + ((end - start) / 2);

        // Recursively return the balanced subtrees:
        LeetCode_TreeNode root = new LeetCode_TreeNode(nums[midpoint]);
        root.left = recursivelyMakeBST(nums, start, midpoint - 1);
        root.right = recursivelyMakeBST(nums, midpoint + 1, end);

        return root;
    }
}
