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
}
