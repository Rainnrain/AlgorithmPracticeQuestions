package com.cydeo.Array;

import java.util.Arrays;

public class multiplicationOfPrevious {


    public static void main(String[] args) {
        Integer [] arr={2,3,4,5,6};

        System.out.println(Arrays.toString(MultiplyArray(arr)));
    }

    public static Integer[] MultiplyArray(Integer [] arr){
    int temp=arr[0];
    int current;
        for (int i = 0; i <arr.length ; i++) {

            if(i==0){
                arr[i]= arr[i]*arr[i+1];
                continue;
            }
            if(i== arr.length-1){
                arr[i]=arr[i]*temp;
                continue;
            }
            current=arr[i];
            arr[i]=temp*arr[i+1];
            temp=current;
        }
        return arr;
    }
}
