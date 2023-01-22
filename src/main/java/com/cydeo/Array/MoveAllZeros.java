package com.cydeo.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZeros {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0));
        System.out.println(moveAllZeros(list));
    }


    public static List<Integer> moveAllZeros(List<Integer> list) {
        System.out.println(list.size());
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(count, list.get(i));
                count++;
            }
        }
        while (count != list.size()) {
            list.set(count, 0);
            count++;
        }
        return list;
    }

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {

        int originalSize = list.size();

        list.removeAll(Arrays.asList(0));

        int newSize = list.size();

        int totalNumberOfZeros = originalSize - newSize;


        for (int i = 0; i < totalNumberOfZeros; i++) {

            list.add(0);

        }
        return list;

    }

    public static void moveZeros(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[end] == 0) {
                end--;
            } else if (arr[start] != 0) {
                start++;

            } else {
                swap(arr, start, end);
                start++;
                end--;

            }
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

