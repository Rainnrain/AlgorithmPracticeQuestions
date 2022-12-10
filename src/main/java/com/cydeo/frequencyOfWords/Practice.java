package com.cydeo.frequencyOfWords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

String str= "This is an  example!  of Example";

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
}
