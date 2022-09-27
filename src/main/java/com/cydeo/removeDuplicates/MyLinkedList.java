package com.cydeo.removeDuplicates;



public class MyLinkedList <T> {

    SNode<T> head;
    SNode<T> tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        SNode node = new SNode(data);

        if (isEmpty()) {
            head = tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void noDuplicates() {
        SNode current = head;
        SNode toDelete = head;
        SNode previous = head;

        while (current.next != null) {

            if (current.value.equals(current.next.value)) {
                toDelete = current.next;
                current.next = current.next.next;
                toDelete = null;
                size--;
            }

            previous = current;
            current = current.next;

            if (current == null) {
                break;
            } else if (previous.value.equals(current.value)) {
                toDelete = previous.next;
                previous.next = current.next;
                toDelete = null;
                size--;
            }
        }
    }


    public void printNodes() {
        SNode current = head;
        while (current != null) {
            if (current.next == null)
                System.out.println(current.value + "=> null");
            else {
                System.out.print(current.value + "=> ");
            }
            current = current.next;
        }
    }



}
