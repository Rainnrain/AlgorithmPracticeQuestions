package com.cydeo.Fatih.InterviewPrepSession2;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] num1 = {4,5,6,0,0,0};
        int[] num2 = {1,2,3};
        int m = 3;
        int n = 3;
        mergedArrays(num1, num2, m, n);

    }

    public static void mergedArrays(int[] a, int[] b, int m, int n) {
        // find the largest array  On time, O1 space

        int i=(m +n)-1;
        int j=m-1;
        int k=n-1;

        while( k>=0){

            if(j>=0 && a[j]>b[k]){
                a[i--]=a[j--];
            }else {
                a[i--] = b[k--];
            }
        }
        System.out.println(Arrays.toString(a));
    }


}
