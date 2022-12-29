package com.cydeo.Array;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
public class test2 {
    String name;
    String id;


    public static void main(String[] args) {
        List<test2> cat= new ArrayList<>();
        test2 test20=new test2("goat", "p-003");
        test2 test3=new test2("boat", "p-004");
        test2 test=new test2("cat", "p-001");
        test2 test1=new test2("dog", "p-002");
        cat.add(test20);
        cat.add(test3);
        cat.add(test);
        cat.add(test1);

        System.out.println(cat);
       List<test2> testtest= cat.stream().sorted(Comparator.comparing(test2::getId)).collect(Collectors.toList());
        System.out.println(testtest );

    }

}
