package com.cydeo.LinkedListIntersection;

public class intersection {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(10);
        ListNode listNode2 = new ListNode(3);

        ListNode newNode = new ListNode(6);
        listNode2.next = newNode;

        newNode = new ListNode(9);
        listNode2.next.next = newNode;

        newNode = new ListNode(15);
        listNode.next = newNode;
        listNode2.next.next.next = newNode;

        newNode = new ListNode(30);
        listNode.next.next = newNode;

        listNode.next.next.next = null;

        System.out.println(valueOfIntersection(listNode, listNode2));

    }

    public static int valueOfIntersection(ListNode a, ListNode b){

        ListNode current=a;
        ListNode current2=b;


        while(current!=null){

            current2=b;
            while(current2!=null){

            if(current==current2){
                return current.value;
            }
                current2=current2.next;
            }
            current=current.next;
        }

        return 1;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }
}
