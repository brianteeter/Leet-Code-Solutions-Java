package com.brianteeter.leetcode.common;

public class LeetCode_TreeNode
{
    public int val;
    public LeetCode_TreeNode left;
    public LeetCode_TreeNode right;

    LeetCode_TreeNode()
    {
    }

    public LeetCode_TreeNode(int val)
    {
        this.val = val;
    }

    public LeetCode_TreeNode(int val, LeetCode_TreeNode left, LeetCode_TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
