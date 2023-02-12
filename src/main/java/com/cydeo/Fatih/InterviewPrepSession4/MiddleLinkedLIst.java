package com.cydeo.Fatih.InterviewPrepSession4;


import com.cydeo.LinkedListCycle.ListNode;

public class MiddleLinkedLIst {


    ListNode returnMiddle(ListNode head){
        int count=0;

        ListNode current= head;

        while(current!=null){
            count++;
            current=current.next;
        }

        int middle= count/2;

        current=head;
        while(middle!=0){
            current=current.next;
            middle--;
        }
        return current;
    }


}
