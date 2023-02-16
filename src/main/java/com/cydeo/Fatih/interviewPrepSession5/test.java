package com.cydeo.Fatih.interviewPrepSession5;

public class test {
    public static void main(String[] args) {

        LRUCache obj= new LRUCache(2);

    obj.put(1,1);
    obj.put(2,2);
obj.put(1,1);


        System.out.println(obj);
        obj.get(2);

        System.out.println(obj);

    }
}
