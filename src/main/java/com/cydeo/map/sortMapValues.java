package com.cydeo.map;

import java.util.*;

public class sortMapValues {
    /*
        Write a method that can sort the map by values
     */

    public static void main(String[] args) {
        Map<Integer, Integer> mapOfNumbers = new LinkedHashMap<>();

        mapOfNumbers.put(1, 3);
        mapOfNumbers.put(45, 345);
        mapOfNumbers.put(0, 111);
        System.out.println(mapOfNumbers);

        HighestFirst(mapOfNumbers);


    }

    public static void HighestFirst(Map<Integer, Integer> mapOfNumbers) {

        mapOfNumbers.entrySet().stream()

                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }
}


