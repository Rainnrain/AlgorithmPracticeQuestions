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
                        // if left is null insert there!!!
                        current.leftChild=newNode;
                        break;
                    }
                    //if leftChild is not null branch into left subtree!!
                    current=current.leftChild;
                }
                else {
                    if (current.rightChild==null){
                        // if right is null insert there!!!
                        current.rightChild=newNode;
                        break;
                    }
                    //if rightChild is not null branch into right subtree!!
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
    List <String> names= new ArrayList<>();
    List<String> firstNamesList(CustomerNode root){ // This is an In Order Traversal Iteratively

        if (root==null) return null; // termination

        firstNamesList(root.leftChild);
        names.add(root.firstName);
        firstNamesList(root.rightChild);
        return names;
    }

    // return size or number of entries in the phonebook


}

