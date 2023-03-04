package com.cydeo.JavaCore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortign {

    public static void main(String[] args) {

     List<String> names= new ArrayList<>();
     names.add("Lorraine");
     names.add("Sema");
     names.add("Ramazan");

     names.stream().sorted().forEach(System.out::println);
    }
}
