package com.cydeo.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

        return true;

    }
}
