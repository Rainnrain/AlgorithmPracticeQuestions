package com.cydeo.BinaryTree;

public class TreePractice {

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


    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean same=true;

        if(p==null && q== null){
            return same;

        }
        if(p==null || q==null){
            return same= false;
        }
        if(q.val!=p.val ){
            return same= false;}


        return isSameTree( p.left, q.left)&&
                isSameTree(p.right, q.right);

    }
}
