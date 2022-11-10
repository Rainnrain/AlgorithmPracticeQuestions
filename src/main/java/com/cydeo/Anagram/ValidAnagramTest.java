package com.cydeo.Anagram;

import java.util.Arrays;

public class ValidAnagramTest {


    public static void main(String[] args) {
String a= "lorraine";
String b="rainelor";
        System.out.println(anagramTest(a, b));
    }


    public static boolean anagramTest(String s, String t){

      String [] ch= s.split("");
      String [] ch2=t.split("");

      Arrays.sort(ch);
      Arrays.sort(ch2);

//        for (int i = 0; i < ch.length; i++) {
//
//            if(!ch[i].equals(ch2[i])) return false;
//
//        }
//        return true;
        return Arrays.equals(ch, ch2);
    }
}
