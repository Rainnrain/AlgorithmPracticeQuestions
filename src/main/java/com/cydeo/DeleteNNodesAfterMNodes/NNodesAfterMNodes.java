package com.cydeo.DeleteNNodesAfterMNodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NNodesAfterMNodes {
    public static void main(String[] args) {

        ListNode listNode= new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        listNode.next.next.next.next.next=new ListNode(6);
        listNode.next.next.next.next.next.next=new ListNode(7);
        listNode.next.next.next.next.next.next.next=new ListNode(8);
        listNode.next.next.next.next.next.next.next.next=new ListNode(9);
        listNode.next.next.next.next.next.next.next.next.next=new ListNode(10);
        listNode.next.next.next.next.next.next.next.next.next.next=new ListNode(11);



        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

        ListNode.printList(listNode);
                deleteSkip(listNode,3,2 );
        ListNode.printList(listNode);

    }

    public static ListNode deleteSkip(ListNode listNode, int n, int m) { // O(n) Time o(1) space since not passing one node more than once.

        ListNode current = listNode;
        ListNode previous = listNode;

        if (listNode == null) return null;

        while (current.next != null) {

            for (int i = 0; i < m; i++) { // could use a while loop w/ M!=0 as the condition and decrease M
                if(current.next==null){
                   return current;
                }
                previous=current;
                current = current.next;
            }

            for (int i = 0; i < n; i++) {

                if(current.next==null){
                    current=null;
                    break;
                }
                previous.next=current.next;// Rather than this we could make a jump when you exit this loop and assign
                current=current.next; // the previous.next to current when finished the loop

            }
        }
        return current;
    }
}
