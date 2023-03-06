package com.cydeo.EnglishWordFrequency;

import java.util.HashMap;
import java.util.Map;

public class FrequencyEnglish {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2};
        numberFreqEng(array);

    }

    public static void numberFreqEng(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        String[] ar = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }

        int i = 0;
        while (i < 11) {
            for (Map.Entry<Integer, Integer> Entry : map.entrySet()) {
                i++;
                if (Entry.getKey().equals(i)) {
                    if (Entry.getValue() < 10) {

                        System.out.println(i + " is " + ar[map.get(i)] + " times");

                    } else {
                        System.out.println(i + " is " + ar[11] + " times");

                    }
                }
            }
        }
    }
}
