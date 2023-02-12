package com.cydeo.frequencyOfWords;

import com.cydeo.Fatih.InterviewPrepSession1.Cat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
Cat cat= new Cat("Joe");

String str= "This is an _ example-  of Example";
removeSpace(str);

        Predicate predicate= new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };


        System.out.println(frequencyOfWords(str));
        System.out.println(frequencyOfLetters(str));
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

    public static Map<Character,Integer> frequencyOfLetters(String str){
        String str2=str.toLowerCase();
        Map<Character, Integer> freqOfLetter= new HashMap<>();
        for(int i=0; i<str2.length(); i++){

           if(Character.isLetter(str2.charAt(i))){
               freqOfLetter.put(str2.charAt(i), freqOfLetter.getOrDefault(str2.charAt(i),0)+1 );
           }
        }
        return freqOfLetter;
    }
}
