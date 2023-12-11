package com.brianteeter.leetcode;

import com.brianteeter.leetcode.common.LeetCode_TreeNode;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * See: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Problem104_MaxDepthOfBinaryTree
{
    public int maxDepth(LeetCode_TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        return Math.max(left_depth, right_depth) + 1;

    }
}
