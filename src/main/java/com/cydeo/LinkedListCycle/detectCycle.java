package com.cydeo.LinkedListCycle;

import java.util.HashSet;
import java.util.LinkedList;

public class detectCycle {
    public static void main(String[] args) {

        ListNode listNode=new ListNode(3);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(0);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=listNode.next;

        System.out.println(detectCycle(listNode).val);
    }

    public static ListNode detectCycle(ListNode listNode){

       HashSet<ListNode> nodes= new HashSet<>();

       while(listNode.next!=null){

           if(nodes.contains(listNode)){
               return listNode;
           }else{
               nodes.add(listNode);
           }
           listNode=listNode.next;
       }
        return null;
    }
}
