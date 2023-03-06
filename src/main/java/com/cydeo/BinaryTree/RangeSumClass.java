package com.cydeo.BinaryTree;

public class RangeSumClass {
//https://leetcode.com/problems/range-sum-of-bst/
    TreeNode root;
    public int rangeSum(TreeNode node, int low, int high){
        int sum=0;
        if(node==null) return 0;
        if(root.val>=low && root.val<=high) {
            sum+= node.val;
            return sum + rangeSum(node.left,  low,  high)+ rangeSum(node.right, low, high);
        }
        return sum+ rangeSum(node.left,  low,  high)+ rangeSum(node.right, low, high);
    }



}
