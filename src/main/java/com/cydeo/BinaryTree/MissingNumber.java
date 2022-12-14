package com.cydeo.BinaryTree;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class MissingNumber {

    public static void main(String[] args) {
        int [] arr={3,0,1};
    }



    public static int missingNumber(int [] nums){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int i = 0; i <nums.length ; i++) {
            maxHeap.add(nums[i]);
        }
        if(maxHeap.peek()!=0) return 0;

        while(maxHeap.peek()!=null){

            int first= maxHeap.poll();
            if(maxHeap.peek()==null) return first+1;
            if(maxHeap.peek()-first!=1){
                return first+1;
            }
        }
        return -1;

     }


    }

