package com.cydeo.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTransvesal {


    public static void main(String[] args) {


    }

    List<Integer> valuesInTree = new ArrayList<>();

    public List<Integer> treeTransversal(TreeNode root) {


        if (root == null) {
            return valuesInTree;
        } else {

            treeTransversal(root.left);
            valuesInTree.add(root.val);
            treeTransversal(root.right);
            return valuesInTree;
        }
    }


        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> valuesInTree= new ArrayList<>();


            if(root==null)return valuesInTree;

            helper(root, valuesInTree);

            return valuesInTree;
        }
        public void helper(TreeNode root, List<Integer> res) {
            if (root != null) {
                helper(root.left, res);
                res.add(root.val);
                helper(root.right, res);
            }
        }
}
