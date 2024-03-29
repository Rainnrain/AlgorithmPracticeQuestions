package com.cydeo.Array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MaxSubarray {
    //https://leetcode.com/problems/maximum-subarray/description/?envType=study-plan&id=data-structure-i
    public static void main(String[] args) {
        int[] ar = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsum(ar));
        System.out.println(maxSubArray2(ar));
    }

    public static int maxProduct(int[] nums) {
        int max = nums[0];
        boolean check = false;
        for (int i = 1; i < nums.length; i++) {

            Integer temp = 0;
            if (check) {
                temp = Math.max(nums[i] * nums[i - 1], max);
            } else {
                temp = Math.max(nums[i] * max, max);
            }

            if (temp > max) {
                max = temp;
                check = false;
            } else {
                check = true;
            }
        }
        return max;

    }

    public static int maxProduct2(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;  // store the max because before updating min your max will already be updated

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

            if (max > ans) {
                ans = max;
            }


        }

        return ans;

    }

    public static int maxsum(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;  // store the max because before updating min your max will already be updated

            max = Math.max(Math.max(max + nums[i], min + nums[i]), nums[i]);
            min = Math.min(Math.min(temp + nums[i], min + nums[i]), nums[i]);

            if (max > ans) {
                ans = max;
            }
        }

        return ans;
    }

    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n == 1) {
            return 1;
        }
        int result = 2;
        for (int i = 0; i < n; i++) {
            Map<Double, Integer> cnt = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    cnt.merge(Math.atan2(points[j][1] - points[i][1],
                            points[j][0] - points[i][0]), 1, Integer::sum);
                }
            }
            result = Math.max(result, Collections.max(cnt.values()) + 1);
        }
        return result;
    }


    public static int maxSubArray(int[] nums) {
// doesn't work
        int left=0;
        int right=nums.length-1;
        int sum=nums[0];
        Integer max=Integer.MIN_VALUE;

        while(left<right){
            sum=0;
            for(int i=left; i<=right; i++){
                sum+=nums[i];
            }
            if(nums[left]<=nums[right]) left++;
            if(nums[left]>=nums[right]) right--;


            max=Math.max(sum, max);

        }

        return Math.max(sum, max);

    }


    public static int maxSubArray2(int[] nums) {

        int prev = nums[0];
        int max = prev;
        for(int i = 1; i < nums.length; i++){
            int cur = 0;
            if(prev < 0){
                cur = nums[i];
            }else{
                cur = nums[i] + prev;
            }
            prev = cur;
            max = Math.max(max, cur);
        }
        return max;
    }
}
