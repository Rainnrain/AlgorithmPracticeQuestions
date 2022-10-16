package com.cydeo.Palindrome;


import java.util.List;
import java.util.Stack;

public class ListNodePalindrome {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next =new ListNode(2);
        listNode.next.next.next.next.next =new ListNode(1);

        System.out.println(isPalindrome(listNode));
        System.out.println(Palindrome2(listNode));
    }

    public static boolean Palindrome(ListNode head) {
        ListNode current = head;
        ListNode check = new ListNode();
        check.value = head.value;
        ListNode top = check;


        while (current.next != null) {

            ListNode node = new ListNode();
            node.next = top;
            node.value = current.next.value;
            top = node;
            current = current.next;
        }
        current = head;
        while (current.next != null) {
            if (current.value != top.value) return false;
            current = current.next;
            top = top.next;
        }
        return true;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public static boolean Palindrome2(ListNode head) {
        ListNode current = head;
        Stack<Integer> reverse = new Stack<>();

        while (current != null) {
            reverse.push(current.value);
            current = current.next;
        }
        current = head;

        while (current!= null) {
            if (current.value != reverse.pop())
                return false;
            current=current.next;
        }
        return true;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.value != slow.value) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
//3 <- 2 <- 1
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }
}
