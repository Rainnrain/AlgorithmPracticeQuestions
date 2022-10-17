package com.cydeo.singleNumberFromAnArray;

import java.util.HashSet;

public class SingleNumber {

    public static void main(String[] args) {

        int [] nums={4,1,2,1,2};

        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int [] nums){
        HashSet <Integer> numbers= new HashSet<>();

        for (int each : nums) {
            if (numbers.contains(each)) {
                numbers.remove(each);
            } else {
                numbers.add(each);
            }
        }

        return numbers.stream().findFirst().orElseThrow();
    }
}
