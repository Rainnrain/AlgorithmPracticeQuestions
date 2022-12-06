package com.cydeo.BinaryTree;

public class LowestCommonAncestor {

    public static void main(String[] args) {

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

//        if((root.val==p.val && root.val<q.val)||(root.val==p.val && root.val>q.val)) return root;
//
//
//        if((root.val==q.val && root.val<p.val)||(root.val==q.val && root.val>p.val)) return root;
//
//
//        if(root.val>p.val && root.val< q.val) return root;
//
//
//        if(root.val<p.val && root.val> q.val) return root;


        if(root.val> p.val && root.val>q.val) return lowestCommonAncestor(root.left, p, q);
        else if(root.val< p.val && root.val< q.val) return lowestCommonAncestor(root.right, p,q);
        return root;
    }
}
