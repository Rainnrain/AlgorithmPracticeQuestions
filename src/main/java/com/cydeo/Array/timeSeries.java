package com.cydeo.Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class timeSeries {
    /*

  A time series is represented as a list of time/value pairs.

  Write a function whose input is two time series and whose output is a new time series of the summation of them.

      Example:

          series A: [(1, 1.0), (2, 1.5), (3, 2.0)]

          series B: [(2, 1.0), (3, 2.5), (5, 1.0)]

          Assuming we have '0' for a time pair that's missing, this is the result:

          output:

              [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]

   */
    public static void main(String[] args) {


        Map<Integer, Double> map1 = new LinkedHashMap<>();
        map1.put(1, 1.0);
        map1.put(2, 1.5);
        map1.put(3, 2.0);

        Map<Integer, Double> map2 = new HashMap<>();
        map2.put(2,1.0);
        map2.put(3,2.5);
        map2.put(5,1.0);
        System.out.println(totalTime(map1, map2));

    }

    public static Map<Integer, Double> totalTime(Map<Integer, Double> map1, Map<Integer, Double> map2){
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            map1.put(entry.getKey(), map1.getOrDefault(entry.getKey(),0.0)+ entry.getValue() );
        }

        return map1;

    }
}
