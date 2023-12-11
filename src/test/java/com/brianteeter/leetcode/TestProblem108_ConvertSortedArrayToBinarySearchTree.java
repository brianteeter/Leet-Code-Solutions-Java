package com.brianteeter.leetcode;

import com.brianteeter.leetcode.common.LeetCode_TreeNode;
import org.junit.Test;

public class TestProblem108_ConvertSortedArrayToBinarySearchTree
{
    @Test
    public void testConvert1()
    {
        int[] nums =  {0,1,2,3,4,5,6};

        Problem108_ConvertSortedArrayToBinarySearchTree p108 = new Problem108_ConvertSortedArrayToBinarySearchTree();
        LeetCode_TreeNode result = p108.sortedArrayToBST(nums);

        // Not the best test, but its a pain to setup all the objects so this is a placeholder:
        assert(result != null);
    }
}
