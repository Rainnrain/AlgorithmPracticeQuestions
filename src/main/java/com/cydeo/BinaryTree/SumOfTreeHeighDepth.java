package com.cydeo.BinaryTree;

public class SumOfTreeHeighDepth {



    public static int sumOfDepth(TreeNode root){
        int sum=0;

        if(root==null) return sum;

        sumOfDepth(root.left);
        sum++;
        sumOfDepth(root.right);



        return sum;
    }
}
