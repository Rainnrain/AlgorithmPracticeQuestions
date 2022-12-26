package com.cydeo.groupStudy;

public class runningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       // Output: [1,3,6,10]
    }

    public int[] runningSumMethod(int[] nums) {

        int count = nums[0];

        for (int i = 1; i < nums.length; i++) {

            count += nums[i];

            nums[i] = count;
        }
        return nums;
    }

    public static int[] runningSumVioletta(int[] nums) {   // Output: [1,3,6,10]

        int[] arr2 = new int[nums.length];

        arr2[0] = nums[0]; //1

        for (int i = 1; i < nums.length; i++) { //arr[1]=3

            arr2[i] = arr2[i-1] + nums[i]; //1+3+6
        }
        return arr2;
    }

    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            nums[i] += nums[i - 1];

        }

        return nums;
    }
}

