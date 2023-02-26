package com.cydeo.Array;

import java.util.HashSet;
import java.util.Set;

public class NotTwin {

    public static void main(String[] args) {
        int [] ar={1,1,2,3,3,4,4};
        System.out.println( notTwin(ar, ar.length-1));
    }

    public static int notTwin(int [] ar, int l){
        Set<Integer> noDup= new HashSet<>();

        for (int each : ar) {
            if(!noDup.add(each)) noDup.remove(each);
        }
    if (!noDup.isEmpty()) {
        return noDup.iterator().next();
    }
        return -1;
    }

    public static int notTwin2(int [] ar, int l){
        Set<Integer> noDup= new HashSet<>();

        for (int each : ar) {
            if(!noDup.add(each)) noDup.remove(each);
        }
        if (!noDup.isEmpty()) {
            return noDup.iterator().next();
        }
        return -1;
    }
}
