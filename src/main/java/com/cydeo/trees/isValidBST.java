package com.cydeo.trees;

public class isValidBST {

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min, long max){

        if(root==null) return true;

        if(root.val <= min || root.val >= max) return false;

        return  helper(root.right, root.val, max) &&
                helper(root.left, min, root.val);

    }
}

