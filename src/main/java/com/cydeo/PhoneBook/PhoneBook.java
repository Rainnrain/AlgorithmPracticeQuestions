package com.cydeo.PhoneBook;

import com.cydeo.PhoneBook.mine.PhoneBookNode;

public class PhoneBook {
    Node head;
    Node tail;
    int size;

    public PhoneBook() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size(){
    return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void add(Node node){
        if(isEmpty()){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.firstName);
            current=current.next;
        }
    }

    public int indexOf(String email){

        Node current= head;
        int count=0;

        while(current!=null) {

            if (current.email.equalsIgnoreCase(email)){
                return count;
        }
            count++;
            current=current.next;
        }
       return -1;
    }


    public int findByFirstName(String firstName){
        Node current= head;
        int index=0;

        while(current!=null){
            if(current.firstName.equalsIgnoreCase(firstName)){
                return index;}

            current=current.next;
            index++;
        }
        return -1;
    }

    public void sortByName(){
        Node current1=head;
        if(current1==tail) return;

        Node current2;

        boolean swap=true;
        while(swap){
            swap=false;
            current1= head;
            current2=head.next;

            while(current1!=null && current2!=null){
                if(current1.firstName.compareToIgnoreCase(current2.firstName)>0){
                    swap=true;
                    swapData(current1, current2);
                }
                current1=current1.next;
                current2=current2.next;
            }
        }
    }

    public void swapData(Node current1, Node current2){
        Node temp=new Node(current2.firstName, current2.lastName, current2.email, current2.phoneNumber);

        current2.firstName=current1.firstName;
        current2.lastName=current1.lastName;
        current2.email=current1.lastName;
        current2.phoneNumber=current1.phoneNumber;

        current1.firstName= temp.firstName;
        current1.lastName=temp.lastName;
        current1.email=temp.email;
        current1.phoneNumber= temp.phoneNumber;


    }


    public void deleteByEmail(String email) {
        Node previous = head;
        Node current = head;

        while (current != null) {
            if (current.email.equalsIgnoreCase(email)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }
}
