package com.leetCode;

public class searchInsertionPosition {

        public int searchInsert(int[] nums, int target) {

            int i=0;

            while(i < nums.length && nums[i] < target){
                i++;
            }

            return i;

        }

    }

