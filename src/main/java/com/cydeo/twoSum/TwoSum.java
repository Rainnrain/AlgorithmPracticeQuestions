package com.cydeo.twoSum;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

      int [] nums= {16,3,11,5,15};
      // System.out.println(Arrays.asList(twoSum(nums, 8)));
     //  System.out.println(Arrays.asList(twoSumIndex(nums, 8)));
     //   System.out.println(findThePairNumbers(nums, 8));
        System.out.println( Arrays.toString( findThePairNumbers(nums, 8))  );
    }

    public static Integer[] twoSum(Integer [] array, Integer num){

        Map <Integer, Integer> map=new HashMap<>();


        for (int j = 0; j <array.length ; j++) {
           int targetValue=num-array[j];
           if(map.containsValue(targetValue)){
               return new Integer[]{targetValue,array[j]};
           }else{
               map.put(j, array[j]);
             }
            }
        return new Integer[]{};
        }


    public static Integer[] twoSumIndex(Integer [] array, Integer num){
        Map <Integer, Integer> map=new HashMap<>();

        for (int j = 0; j <array.length ; j++) {
            int targetValue=num-array[j];
            if(map.containsKey(targetValue)){
                return new Integer[]{map.get(targetValue),j};
            }else{
                map.put(array[j],j);
            }
        }
        return new Integer[]{};
    }
    public static int[] findThePairNumbers(int [] arr, int target){
        int left=0, right=arr.length-1;
        Arrays.sort(arr); // nlog(n)

        while(left<right){
            if(arr[left]+arr[right]==target)
                return new int[]{arr[left],arr[right]};
                else if(arr[left]+arr[right]<target){
                    left++;
                } else
                    right--;

        }
        return new int[0];

    }

    public static int[] findIndicesWithTwoPointerAndHasMap(int [] arr, int target){
        int left=0, right=arr.length-1;
        Map <Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) { //n
            map.put(arr[i],i);
        }
        Arrays.sort(arr); //n log(n)

        while(left<right){
            if(arr[left]+arr[right]==target){
                return new int[]{map.get(arr[left]),map.get(arr[right])};
            } else if (arr[left]+arr[right]<target){
                left++;
            }else
                right--;
        }
        return new int [0]; // time complexity O(n log(n)
    }




}
