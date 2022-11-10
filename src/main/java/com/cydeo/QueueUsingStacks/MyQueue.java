package com.cydeo.QueueUsingStacks;

import java.util.Stack;

public class MyQueue {

    Stack <Integer> stack1= new Stack<>();
    Stack<Integer> stack2= new Stack<>();


    void enqueue(int num){
        stack1.push(num);
    }


    public int dequeue(){
        peek();
        return stack2.pop();

    }

    public int peek(){
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    boolean isEmpty(){
        return stack1.empty() && stack2.isEmpty();
    }


}
