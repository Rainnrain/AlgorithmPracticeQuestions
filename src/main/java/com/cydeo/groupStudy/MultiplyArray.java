package com.cydeo.groupStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArrayList<Integer> num= new ArrayList<>(Arrays.asList(1,2,3,4,5));
      //  MultiplyOddByTwo(num);
      //  MultiplyOddByTwoArray(arr);
      //  Multiply(arr);
    }

    public static void MultiplyOddByTwo( ArrayList<Integer> num){

        for (int i = 0; i < num.size(); i++) {
            if(num.get(i)%2==0) num.set(i, (num.get(1)*2));
        }
        System.out.println(num);
    }

    public static void MultiplyOddByTwoArray(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) arr[i]*=2;
        }
        System.out.println(Arrays.toString(arr));


    }

    public static List<Integer> multiplyOddsBy2Stream(List<Integer> list) {

        return list.stream().map(num -> {

                    if (num % 2 != 0) num *= 2;

                    return num;
                }
        ).collect(Collectors.toList());
    }

    public static void multiplication1(int[]arr) {

        Arrays.stream(arr).forEach(value -> {
            if (value % 2 != 0) value *= 2;
            System.out.println(value);

        });
    }

    public static void multiplication12(int[]arr) {

        Arrays.stream(arr).forEach(value -> {
            if (value % 2 != 0) value *= 2;
            System.out.println(value);

        });
    }

}
