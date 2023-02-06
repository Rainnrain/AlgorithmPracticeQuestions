package com.cydeo.InterviewPrepSession1;

import java.util.Arrays;
import java.util.Collections;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {

        int[] ar = {12,1,12};
        System.out.println(Arrays.toString( greatestAmountOfCandies(ar, 10)));

    }

    public static boolean[] greatestAmountOfCandies(int[] ar, int extra) {
        //Space complexity On, time complexity On

        boolean[] greatest = new boolean[ar.length];
        int max = 0;
        for (int each : ar) {
            max = Math.max(max, each);
        }

        for (int i = 0; i < greatest.length; i++) {
            greatest[i] = ar[i] + extra >= max;
        }

        return greatest;
    }
}
