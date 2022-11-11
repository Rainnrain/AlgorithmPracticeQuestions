package com.cydeo.Array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums = {1};

removeDuplicates(nums);
    }



    public static int removeDuplicates(int [] nums){

      int counter=1;

        for (int i = 1; i < nums.length; i++) {


            if(nums[i-1]!=nums[i]){
                nums[counter]=nums[i];
                counter++;
            }


        }
      return counter;
    }
}
