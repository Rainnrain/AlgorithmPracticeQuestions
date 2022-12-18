package com.cydeo.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {


        int x = 6;
        int y = 3;
        int z = 12;

        int w = method1(x, y, z);
        System.out.println("w= " + w);

        System.out.println(Arrays.toString(convertNumber(35231)));
        int[] arr={1,2,3,4,3};
        int num=6;
        System.out.println(twoSum(arr,num));

        int [] numbers={6,3,4,5};
        System.out.println("test"+Arrays.toString( arrayMultiplyWithPointer(numbers)));

    }

    public static int method1(int y, int z, int x) {
        return (x * z) / y;
    }

    public static char[] convertNumber(int num) { //35231


        String temp = "35231";

        char[] newGuess = new char[temp.length()];

        for (int i = temp.length() - 1; i >= 0; i--) {
            newGuess[i] = temp.charAt(i);
        }

        return newGuess;
    }

    public static Map<Integer, Integer> twoSum(int[] array, int sum) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int k = 1; k < array.length; k++) {

                    if (array[i] + array[k] == sum) {
                        map.put(array[i], array[k]);


                }
            }
        }
        return map;
    }

    public static int[] arrayMultiplyWithPointer(int[] arr){

        if (arr.length <= 1) return arr;//int [] numbers={6,3,4,5};
        int pointer = 1;

        for (int i = 0; i < arr.length; i++) {

            if (i == 0){
                pointer = arr[i]; //0
                arr[i] = arr[i] * arr[i+1];
            } else if (i == arr.length-1) {
                arr[i] = pointer * arr[i];
            }else{
                int temp = arr[i]; temp=
                arr[i] = pointer * arr[i +1];
                pointer = temp;
            }
        }
        return arr;

    }

}