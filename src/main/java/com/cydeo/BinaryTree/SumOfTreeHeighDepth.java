package com.cydeo.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfTreeHeighDepth {



    public static int sumOfDepth(TreeNode root){
        int sum=0;

        if(root==null) return sum;

        sumOfDepth(root.left);
        sum++;
        sumOfDepth(root.right);



        return sum;
    }

    public int sumOfDepth2(TreeNode root) {
        int sum = 0;

        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            TreeNode toVisit = queue.poll(); // gets front element of the queue
            sum++;

            if (toVisit.left != null) {
                queue.add(toVisit.left);
                sum += 1 ;
            }
            if (toVisit.right!= null) {
                queue.add(toVisit.right);
                sum += 1  ;
            }

        }
        return sum;
    }
}
