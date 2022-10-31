package com.cydeo.DeleteNNodesAfterMNodes;

public class ListNode {
    ListNode next;
    ListNode head;
    int value;


    public ListNode(int a) {
         value = a;
         next = null;
    }

    static void printList( ListNode head)
    {
        ListNode temp = head;
        while (temp != null)
        {
            System.out.printf("%d ", temp.value);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

}
