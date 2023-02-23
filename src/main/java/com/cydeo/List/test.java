package com.cydeo.List;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {


        List<String> cat= new ArrayList<>();

        cat.add("Coco");
        cat.add("Ginger");
        System.out.println(cat);

        while(!cat.isEmpty()){
            int index=cat.size()-1;
            System.out.println(cat.remove(index));
        }
        System.out.println(cat);
    }
}
