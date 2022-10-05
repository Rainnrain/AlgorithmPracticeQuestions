package com.cydeo.stack;

import java.util.Stack;

public class greaterThanTheirRight {

    public static void main(String[] args) {

        Integer[] arr = {10, 4, 6, 3, 5};  // length=5

        find(arr);
    }
    public static void find(Integer[] arr) {
        Stack<Integer> num = new Stack<Integer>(); //6, 5
        int j = arr.length - 1; // last index of array j=4

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
}

