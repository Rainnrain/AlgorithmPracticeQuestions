package com.cydeo.QueueUsingStacks;

public class Test {
    public static void main(String[] args) {
        MyQueue1 q= new MyQueue1();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.peek());
        q.enqueue(3);
        System.out.println(q.peek());
        q.dequeue();
    }
}
