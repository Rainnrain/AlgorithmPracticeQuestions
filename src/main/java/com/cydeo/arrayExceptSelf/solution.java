package com.cydeo.arrayExceptSelf;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {

        int[] nums = {-1, 1, 0, -3,3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] array = new int[nums.length];
        array[nums.length-1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            array[i] = array[i + 1] * nums[i + 1];

        }
        int left=1;

        for (int i = 0; i < nums.length; i++) {
            array[i] = array[i] * left;
            left=left*nums[i];
        }


        return array;
    }
}

