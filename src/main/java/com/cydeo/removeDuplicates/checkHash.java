package com.cydeo.removeDuplicates;

import java.util.HashSet;
import java.util.Set;

public class checkHash {

    public static void main(String[] args) {
        firstRepeatingChar("thisis");
    }

    public static Character firstRepeatingChar(String str){

        Set<Character> characters = new HashSet<>(); //random

        for (Character ch : str.toCharArray()){
            if (!characters.add(ch)){
                return ch;
            }
        }
        return null;
    }
}
