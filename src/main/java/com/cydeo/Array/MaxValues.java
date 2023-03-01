package com.cydeo.Array;

import java.util.*;

public class MaxValues {

    public static void main(String[] args) {
int [] ar={9,3,5,11,10};
        System.out.println(Arrays.toString(maxOfArray(ar, 3)));
    }

    public static int [] maxThree(int [] nums, int n){
        Arrays.sort(nums);
        int [] arr= new int[n];

        for (int i = nums.length-n, j=0; i <nums.length ; i++) {
            arr[j++]=nums[i];
        }
        return arr;
    }
    
    public static int[] maxOfArray( int [] nums, int n){
        int [] arr= new int[n];
        Set <Integer> t= new TreeSet<>();

        for (int i = 0; i < nums.length ; i++) {
            t.add(nums[i]);
        }

        int start= nums.length-n;
        int count=0;
        int index=0;
      Iterator<Integer> it=  t.iterator();
        while(it.hasNext()){
            if(count>=start){
                arr[index++]= (int) it.next();
            }else{
                it.next();
            }

            count++;
        }
        return arr;
    }


    public static int[] maxValueN( int [] nums, int n){

        int min=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;


        for (int i = 0; i <nums.length ; i++) {

            if(nums[i]>max){
                min= mid;
                mid=max;
                max=nums[i];
            }else if(nums[i]>mid){
                min=mid;
                mid=nums[i];
            }else if(nums[i]>min){
                min=nums[i];
            }
        }
        return new int[] {min, mid, max};
    }

}
