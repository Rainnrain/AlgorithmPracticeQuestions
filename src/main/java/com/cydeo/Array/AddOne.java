package com.cydeo.Array;

import java.util.Arrays;

public class AddOne {
    //This was in an online assessment
    //https://leetcode.com/problems/plus-one/solutions/
    public static void main(String[] args) {
        int [] ar= {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(ar)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
