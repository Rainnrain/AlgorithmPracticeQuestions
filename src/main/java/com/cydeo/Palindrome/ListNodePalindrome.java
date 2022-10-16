package com.cydeo.Palindrome;


import java.util.List;

public class ListNodePalindrome {

    public static void main(String[] args) {

      ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(2);
        listNode.next.next.next=new ListNode(3);
        listNode.next.next.next.next=null;

        System.out.println( Palindrome(listNode));
    }

    public static boolean Palindrome(ListNode head){
        ListNode current=head;
        ListNode check= new ListNode();
        check.value=head.value;
        ListNode top=check;


        while(current.next!=null){

              ListNode node=new ListNode();
              node.next = top;
              node.value = current.next.value;
              top = node;
              current = current.next;
        }
        current=head;
        while(current.next!=null){
            if(current.value!=top.value) return false;
            current= current.next;
            top=top.next;
        }
        return true;
    }
    static void printList(ListNode node)
    {
        while (node != null)
        {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

}
