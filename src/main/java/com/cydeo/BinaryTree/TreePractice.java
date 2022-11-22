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


    public boolean sameTree(TreeNode p, TreeNode q){
        boolean same=false;
        while(root==null||p.val==q.val){
            sameTree( p.left, q.left);
            sameTree(p.right, q.right);
        }

        if(root==null) same=true;
        return same;
    }
}
