package com.cydeo.twoSum;

import java.util.ArrayList;
import java.util.Arrays;


public class twoSumReview {

    public static void main(String[] args) {

        int [] num= {3,2,4};
        System.out.println(Arrays.toString(sumOfTwo(num, 6)));

        int [] num2= {3,2,4,8};
        System.out.println(Arrays.toString(sumOfTwo(num, 6)));
    }


    public static int[] sumOfTwo(int [] arr, int target) {

        Arrays.sort(arr);
        int pointer1 = 2;
        int pointer2 = 0;


      while(arr[pointer1]+arr[pointer2]!=target){

          if(arr[pointer1]+arr[pointer2]<target) {
              pointer1++;

          }else if(arr[pointer1]+arr[pointer2]>target){
              pointer1--;
          }
         if( arr[pointer1]+arr[pointer2]!=target ) pointer2++;
      }
      return new int [] {arr[pointer1], arr[pointer2]};
    }



}
