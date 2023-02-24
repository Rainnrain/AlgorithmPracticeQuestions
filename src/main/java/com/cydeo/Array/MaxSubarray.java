package com.cydeo.Array;

import java.util.HashMap;
import java.util.Hashtable;

public class MaxSubarray {
    public static void main(String[] args) {
        int [] ar={0,2};
        maxProduct(ar);
    }
    public static int maxProduct(int[] nums) {
        int max=nums[0];
        boolean check=false;
        for(int i=1; i<nums.length; i++){

            Integer temp=0;
            if(check){
                temp=Math.max(nums[i]* nums[i-1], max);
            }else{
                temp=Math.max(nums[i]*max, max);
            }

            if(temp>max){
                max=temp;
                check=false;
            }else{
                check=true;
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
}
