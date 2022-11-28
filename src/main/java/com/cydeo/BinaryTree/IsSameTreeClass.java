package com.cydeo.BinaryTree;

public class IsSameTreeClass {

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
