package com.cydeo.Set;

import java.util.*;

public class practice {
    /*
        return a Set equal to the intersection of the parameter Sets
     */
    public static void main(String[] args) {
        Set<Object> test = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Object> test2 = new HashSet<>(Arrays.asList(4, 5, 6));
        System.out.println(getIntersection(test, test2));
    }


    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
            Please implement this method to
            return a Set equal to the intersection of the parameter Sets
            The method should not chage the content of the parameters.
        */
        Set<Object> intersection = new HashSet<>();

        Iterator<Object> obj = a.iterator();

        for (Object each : a) {
            if (b.contains(each)) {
                intersection.add(each);
            } else {
                obj.next();
            }
        }
        return intersection;
    }
}
