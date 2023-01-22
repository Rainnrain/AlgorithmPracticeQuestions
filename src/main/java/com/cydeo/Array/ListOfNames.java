package com.cydeo.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfNames {
    public static void main(String[] args) {
        List<String> listOfNames= new ArrayList<> (Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeName(listOfNames));
    }
  public static List<String> removeName(List<String> listOfNames){
listOfNames.removeIf(name->name.equals("Ahmed"));
   return listOfNames;
  }
}
