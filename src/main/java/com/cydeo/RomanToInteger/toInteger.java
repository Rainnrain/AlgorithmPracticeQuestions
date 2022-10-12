package com.cydeo.RomanToInteger;

import java.util.*;

public class toInteger {


    public static void main(String[] args) {

        String roman = "MCMXCIV";
        System.out.println(romanToDigit(roman));
    }


    public static int romanToDigit(String str) {
        int value = 0;
        List<String> strMinus = new ArrayList<>(Arrays.asList("IV", "IX", "CM", "CD", "XC", "XL"));
        Map<String, Integer> romanLetters = new HashMap<>();

        romanLetters.put("I", 1);
        romanLetters.put("V", 5);
        romanLetters.put("C", 100);
        romanLetters.put("M", 1000);
        romanLetters.put("X", 10);
        romanLetters.put("D", 500);
        romanLetters.put("L", 50);

        for (int i = 0; i <= str.length() - 1; i++) {


                if(i<str.length()-1){

                    if (strMinus.contains(""+(str.charAt(i) + ""+str.charAt(i + 1)))){
                        value -= romanLetters.get(""+str.charAt(i));


                    } else {
                        value += romanLetters.get("" + str.charAt(i));
                    }
                }
                   else if(i==str.length()-1) value += romanLetters.get("" + str.charAt(i));
        }
        return value;
    }
}
