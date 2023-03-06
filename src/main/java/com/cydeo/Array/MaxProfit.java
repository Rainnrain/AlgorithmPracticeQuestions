package com.cydeo.Array;

import java.util.*;

public class MaxProfit {
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices){

        int min=Integer.MAX_VALUE;
        int profit=0;

        for (int i = 0; i < prices.length ; i++) {

            if(min>prices[i]){
                min=prices[i];
            }if(prices[i]-min>profit){
                profit=prices[i]-min;
            }
        }
        return profit;

    }

}
