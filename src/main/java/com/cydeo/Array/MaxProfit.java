package com.cydeo.Array;

import java.util.*;

public class MaxProfit {

    public static void main(String[] args) {
 int [] arr={7,6,4,3,1};
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
