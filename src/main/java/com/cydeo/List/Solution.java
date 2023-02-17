package com.cydeo.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        System.out.println(generate(5));

        final String word="cat";
        final List<Integer> list= new ArrayList<>();
    list.add(1);
    list.set(0,2);
        System.out.println(list);
      //  word="bird";
       // list=new ArrayList<>();
    }


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<>();
        int count=1;
        while(numRows>=count){
        List<Integer> put= new ArrayList<>();
            for(int i=1, j=1; i<=count; i++){
    
                if(i>1 && i<count && count>2){
                    Integer add= list.get(count-2).get(i-2);
                    Integer add1=list.get(count-2).get(i-1);
                put.add(add +add1);
            }else{
               put.add(j);
            }
        }
        list.add(put);
        count++;

    }
    return list;
}
}