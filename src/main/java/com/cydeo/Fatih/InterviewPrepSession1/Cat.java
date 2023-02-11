package com.cydeo.Fatih.InterviewPrepSession1;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {
    String name;

    @Override
    void canThisBeOverrident() {
        System.out.println("This is the second");
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Millie");

        Object cat2 = new Cat("Sunday");
        List<Cat> cats = new ArrayList<>();
        cats.add(cat);

        cat.canThisBeOverrident();


        Object cat3 = cats;
        System.out.println(cat3);
    }
}
