package com.cydeo.stack;

import java.util.Stack;

public class greaterThanTheirRight {

    public static void main(String[] args) {

        Integer[] arr = {10, 4, 6, 3, 5};  // length=5

        find(arr);
    }
    public static void find2(Integer[] arr) {
        Stack<Integer> num = new Stack<>();
        int j = arr.length - 1;

        while (j >= 0) {

            if (j == arr.length - 1) {
                num.push(arr[j]);}

            if (j != arr.length - 1) {

                if (arr[j] > num.peek()) {
                    num.push(arr[j]);
                }
            }
            j--;
        }
        System.out.println(num);
    }
    Integer[] arr = {10, 4, 6, 3, 5};
    public static void find(Integer[] arr) {

        if (arr == null || arr.length == 0) return;

        Stack<Integer> stack = new Stack<>();

        for (int value : arr) {


            while (!stack.isEmpty() && stack.peek() < value) {
                stack.pop();

            }
            stack.push(value);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}

