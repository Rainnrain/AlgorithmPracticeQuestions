package com.cydeo.trees;



public class RangeOfSum {

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root == null) {
            return sum;
        }

        if (root.val <= high && root.val >= low) {
            sum += root.val;
        }

        return sum + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

    }

    public int rangeSumBST2(TreeNode root, int low, int high) {
    int sum=0;

if(root==null) return 0;

if(root.val>=low || root.val<=high) { sum+=root.val;}
    sum+= rangeSumBST(root.right,low,high);
    sum+= rangeSumBST(root.left,low,high);
    return sum;
}


}


