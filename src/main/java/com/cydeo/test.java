package com.cydeo;

import java.util.Map;
import java.util.TreeMap;

public class test {


    public static void main(String[] args) {


        String str = "JJavvaDDevellopeer";
        System.out.println(firstNonRepeatingCharacter(str));
    }

    public static Character firstNonRepeatingCharacter(String str) {

        //create Map, space complexity O(n)
        //count frequency of chars
        //start from beginning, check if there is a char with frequency 1

        Map<Character, Integer> map = new TreeMap<>();
        int count = 1;

        for (Character ch : str.toCharArray()) {

            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, count);
            }
        }

        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1)return ch;
        }
        return null;
    }
}
class test2{

}