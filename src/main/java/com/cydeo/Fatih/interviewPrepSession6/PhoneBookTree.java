package com.cydeo.Fatih.interviewPrepSession6;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookTree {
    CustomerNode root;
    void insert(CustomerNode newNode){
        if(root==null){
            root=newNode;
            return;
        }

        CustomerNode current=root;
            while(true){
                if (newNode.firstName.compareToIgnoreCase(current.firstName)<0){
                    if (current.leftChild==null){
                        current.leftChild=newNode;
                        break;
                    }
                    current=current.leftChild;
                }
                else {
                    if (current.rightChild==null){
                        current.rightChild=newNode;
                        break;
                    }
                    current=current.rightChild;
                }
            }
        }


    void printNamesInAscOrder(CustomerNode root){
        if (root==null) return;
        printNamesInAscOrder(root.leftChild);
        System.out.print(root.firstName +", ");
        printNamesInAscOrder(root.rightChild);
    }


    List<String> firstNamesList(CustomerNode root){ // This is an In Order Traversal Iteratively
        List<String> names= new ArrayList<>();
        if (root==null) return null;
        helper(root, names);
        return names;
    }


    void helper(CustomerNode root, List<String> names) {
        if (root != null) {
            helper(root.leftChild, names);
            names.add(root.firstName);
            helper(root.rightChild, names);
        }
    }

//    void helper(CustomerNode root, List<String> names) {
//        if (root==null) return;
//        helper(root.leftChild, names);
//        names.add(root.firstName);
//        helper(root.rightChild, names);
//
//    }

//    List <String> names= new ArrayList<>();
//    List<String> firstNamesList(CustomerNode root){ // This is an In Order Traversal Iteratively
//
//        if (root==null) return null; // termination
//
//        firstNamesList(root.leftChild);
//        names.add(root.firstName);
//        firstNamesList(root.rightChild);
//        return names;
//    }
//
//    // return size or number of entries in the phonebook


}

