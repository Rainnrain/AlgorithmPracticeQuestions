package com.cydeo.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinDifference {
    //https://leetcode.com/problems/minimum-absolute-difference/
    public static void main(String[] args) {
        int[] ar = {1, 3, 6, 10, 15};
     //   System.out.println(minimumAbsDifference(ar));
        System.out.println(minAbsDiff(ar));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res= new ArrayList<>();
        //in a sorted array consecutive numbers have the least min diff
        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;

        for(int i=0;i< arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            //we found a new min difference
            if(diff < min){
                min =diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
            else if(diff == min)
                res.add(Arrays.asList(arr[i], arr[i+1]));
        }
        return res;
    }

    public static List<List<Integer>> minAbsDiff(int[] arr) {
        List<List<Integer>> minDiffList = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {


            if (min > Math.abs(arr[i + 1] - arr[i])) {
                minDiffList.clear();
                min = Math.abs(arr[i + 1] - arr[i]);
            }
            if (min == Math.abs(arr[i + 1] - arr[i])) {
                minDiffList.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
            }
        }
        return minDiffList;
    }
}
