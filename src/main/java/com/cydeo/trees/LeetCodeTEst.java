package com.cydeo.trees;

public class LeetCodeTEst {

    public int minDiffInBST(TreeNode root) {
        Integer min=Integer.MAX_VALUE;
        if(root==null) return 0;
        min(root, min);
        return min;
    }

    public void min(TreeNode root, Integer min){
        if(root==null) return;

        if(root.left!=null){
            min=Math.min(root.val-root.left.val, min);
        }if(root.right!=null){
            min=Math.min(root.right.val-root.val, min);
        }
        min(root.left, min);
        min(root.left,min);

    }

}
}
