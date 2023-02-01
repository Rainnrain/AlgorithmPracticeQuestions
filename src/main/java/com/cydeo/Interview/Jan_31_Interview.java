package com.cydeo.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Jan_31_Interview {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6
    ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(101, 23, 34, 56, 345, 56));
        System.out.println(removeGreaterThan100(listOfIntegers));
        BruteForce(listOfIntegers);
    }

    public static List<Integer> removeGreaterThan100(List<Integer> list) {

        Iterator each = list.iterator();

        while (each.hasNext()) {
            if ((int) each.next() > 100) each.remove();
        }
        return list;
    }

    public static void BruteForce(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > 100) list.remove(i);
        }
        System.out.println(list);

    }

}
