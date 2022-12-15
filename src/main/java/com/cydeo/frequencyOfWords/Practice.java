package com.cydeo.frequencyOfWords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

String str= "This is an _ example-  of Example";
removeSpace(str);

        System.out.println(frequencyOfWords(str));
    }

    public static Map<String, Integer> frequencyOfWords(String str){

        Map<String, Integer> freq= new HashMap<>();
        char[] ch=str.toCharArray();
        String newSentence="";

        for (int i = 0; i <ch.length ; i++) {

            if(!Character.isLetter(ch[i])){
                ch[i]=' ';
            }
            newSentence+=(""+ch[i]).toLowerCase();
        }

        String[] newStringArray= newSentence.split(" ");

        for (String each : newStringArray) {
            if (!each.isBlank()) {
                freq.put(each, (freq.getOrDefault(each, 0)+1));
            }
        }
        return freq;

    }

    public static void removeSpace(String str){
       String []string= str.split("[-_]+");
        System.out.println(Arrays.toString(string));
    }

    public static Map <String, Long> withStreamLong(String str){
        if(str==null) return null;

        return Arrays.stream(str.trim().toLowerCase().split("[^A-Za-z]+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map <String, Integer> withStream(String str){
        if(str==null) return null;

        return Arrays.stream(str.trim().toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(s->1)));
    }
}
