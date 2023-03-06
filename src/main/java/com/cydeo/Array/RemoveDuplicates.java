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

    public static int removeDup(int [] nums){

    int count=1; // Keep first element

        for (int i = 0; i <nums.length ; i++) {
// check that current is not equal to previous
            if(nums[i-1]!=nums[i]) nums[count++]=nums[i];
        }
        return count;
    }
}
