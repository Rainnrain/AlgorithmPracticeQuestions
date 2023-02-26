package com.cydeo.Array;

import java.util.Arrays;

public class difference {

    public static void main(String[] args) {
        int ar[]={10,4,8,3};
        System.out.println(Arrays.toString(leftRigthDifference(ar)));

    }
    public static int[] leftRigthDifference(int[] nums) {

        int [] ar= new int[nums.length];
        int [] ar2= new int[nums.length];
        int temp=0;
        for(int i=0; i<nums.length; i++){

            if(i==0){ ar[i]=temp;}
            else{
                temp=temp+nums[i-1];
                ar[i]=temp;
            }

        }
        temp=0;
        for(int j=nums.length-1; j>=0; j--){
            if(j==nums.length-1){
                ar[j]=temp;
            } else{
                temp=temp+nums[j+1];
                ar[j]=temp;
            }

        }

        for(int k=0; k<nums.length; k++){
            nums[k]=Math.abs(ar[k]-ar2[k]);
        }

        return nums;
    }
}
