package com.cydeo.groupStudy;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 0, 1, 0};
        moveZerosTatiana(arr);
        moveZerosVioletta(arr);
        moveAllZerosToTheEndMuhtar(arr);
        moveZerosOneLoop(arr);
        moveZeroesTwoLoop(arr);

    }


    public static void moveZerosTatiana(int[] arr) {
                        //{10, 1, 5, 0, 0, 0};
                      //   ^               ^
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[end] == 0) {
                end--;
            } else if (arr[start] != 0) {
                start++;

            } else {
                swap(arr, start, end);
                start++;
                end--;

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) { //i=1, j=4
        int temp = arr[i];//0
        arr[i] = arr[j];//1
        arr[j] = temp;//0
    }


    public static void moveZerosVioletta(int[] arr) {

        int count = 0;

        for (int each : arr) {
            if (each != 0) {
                arr[count++] = each;
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveAllZerosToTheEndMuhtar(int[] arr) {   //{0,1,0,3,13};

        int[] result = new int[arr.length];
        int j = 0; //j=1;

        for (int i = 0; i < arr.length; i++) { i=1;

            if (arr[i] != 0) { //arr[1]=1;

                result[j++] = arr[i];
             //result[0]=1;
            }
        }

        System.out.println(Arrays.toString(result));


    }

    public static void moveZeroesTwoLoop(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
//int[] arr = {10, 0, 5, 0, 1, 0};
    public static void moveZerosOneLoop(int[] nums){  //num-> 10, 5, 1, 0, 0, 0
        int k=0; //k=2
        for(int i=0;i<nums.length;i++){ //i=4, 1
            if(nums[i]!=0){
                int temp=nums[k];//temp=0 , k=2
                nums[k]=nums[i]; //num[2]=1;
                nums[i]= temp;//num[4]=0
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
