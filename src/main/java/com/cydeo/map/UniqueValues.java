package com.cydeo.map;

import java.util.*;

public class UniqueValues {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault( arr[i],0) +1);

        }

        Set<Integer> num= new HashSet<>();

        for (Map.Entry<Integer, Integer> each : map.entrySet()) {

            if(!num.add(each.getValue()))
                return false;


        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            
        }

        return true;

    }


}
