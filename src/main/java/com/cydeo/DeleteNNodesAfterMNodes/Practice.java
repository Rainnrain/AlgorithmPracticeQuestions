package com.cydeo.DeleteNNodesAfterMNodes;

import java.util.Arrays;
import java.util.LinkedList;

public class Practice {

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
        removeNafterM(listNode,3,2 );
        ListNode.printList(listNode);
    }


    public static ListNode removeNafterM(ListNode head, int n, int m) {

        if (head== null) return null;
        ListNode current= head;
        while (current.next != null) {
            int i = 1;
            while (i < m) {
                if(current.next==null) return current;
                current = current.next;
                i++;
            }
            i = 1;
            while (i <= n && current.next!=null) {
                if(current.next.next==null){
                    current.next=null;
                    return current;
                }
                current.next = current.next.next;
                i++;
            }
            current=current.next;
        }
        return current;
    }
}
