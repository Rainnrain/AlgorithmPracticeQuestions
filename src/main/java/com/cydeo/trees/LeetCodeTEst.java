package com.cydeo.trees;

public class LeetCodeTEst {
    public static void main(String[] args) {
        TreeNode a= new TreeNode(2);
        a.left=new TreeNode(1);
        a.right=new TreeNode(3);
        minDiffInBST(a);
    }
    public static int minDiffInBST(TreeNode root) {
        Integer min=Integer.MAX_VALUE;
        if(root==null) return 0;
        min=min(root, min);
        return min;
    }

    public static int min(TreeNode root, Integer min){
        if(root==null) return min;

        if(root.left!=null){
            min=Math.min(root.val-root.left.val, min);
        }if(root.right!=null){
            min=Math.min(root.right.val-root.val, min);
        }
        min(root.left, min);
        min(root.left,min);
return min;
    }

}

