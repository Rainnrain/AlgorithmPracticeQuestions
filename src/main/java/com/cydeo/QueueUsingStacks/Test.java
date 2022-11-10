package com.cydeo.QueueUsingStacks;

public class Test {
    public static void main(String[] args) {
        MyQueue q= new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.peek());
        q.enqueue(3);
        System.out.println(q.peek());
        q.dequeue();
    }
}
