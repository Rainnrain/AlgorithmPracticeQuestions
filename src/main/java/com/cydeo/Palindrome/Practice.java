package com.cydeo.Palindrome;

import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(2);
        listNode.next.next.next.next.next = new ListNode(1);
        System.out.println(palindrome(listNode));

    }


    public static boolean palindrome(ListNode node) {

        ListNode current = node;
        Stack<Integer> pile = new Stack<>();

        while (current != null) {
            pile.push(current.value);
            current = current.next;
        }

        while (node != null) {

            if (node.value != pile.pop()) {
                return false;
            }
            node = node.next;
        }
        return true;

    }
}
