package com.cydeo.String;

import java.util.*;

public class String_FrequencyOfCharactersInSortedManner {

    /*
    Return the frequency of each character in the given string in Sorted manner
        Ex:
            Input: DDDAACCCCCCB
            Output: A2B1C6D3
     */

    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("DDDAACCCCCCB"));
        System.out.println(frequencyOfLetter2("DDDAACCCCCCB"));
        System.out.println(frequencyOfLetter3("DDDAACCCCCCB"));
        System.out.println(frequencyOfLetter4("DDDAACCCCCCB"));
    }

    public static String frequencyOfLetter(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        String s = "";

        for (int i = 0; i < letters.length; i++) {
            int count = 0;
            for (int j = 0; j < letters.length; j++) {

                if (letters[i] == letters[j]) count++;
            }
            if (!s.contains("" + letters[i])) {
                s += letters[i] + "" + count;
            }
        }
        return s;
    }

    public static Map<String, Integer> frequencyOfLetter2(String str) {
        Map<String, Integer> freq = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {

            freq.put(str.charAt(i) + "", freq.getOrDefault(str.charAt(i) + "", 0) + 1);

        }
        return freq;
    }

    public static String frequencyOfLetter3(String str) {
        Map<String, Integer> freq = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {

            freq.put(str.charAt(i) + "", freq.getOrDefault(str.charAt(i) + "", 0) + 1);

        }
        String result = "";
        for (Map.Entry<String, Integer> each : freq.entrySet()) {
            result += each.getKey() + each.getValue();
        }
        return result;
    }

    public static String frequencyOfLetter4(String str) {

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        String s = "";

        while (p2 != ch.length) {

            if (ch[p1] == ch[p2]) {
                count++;
                p2++;
            } else {
                s += "" + ch[p1] + count;
                count = 0;
                p1 = p2;
            }
        }
        s += "" + ch[p1] + count;
        return s;
    }

    public static String frequencyOfCharacterInSortedManner(String str) {
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        str = "";
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            str += each.getKey() + each.getValue();
        }
        return str;
    }

}



