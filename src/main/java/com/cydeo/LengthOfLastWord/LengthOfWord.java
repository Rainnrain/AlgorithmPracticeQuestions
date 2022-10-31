package com.cydeo.LengthOfLastWord;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class LengthOfWord {
    public static void main(String[] args) {
        String str="Hello world";

        System.out.println(lengthOfLastWord(str));

    }

    public static String lengthOfLastWord(String str){

        ArrayDeque<String> unorderedWord=new ArrayDeque<>();
        Stack<String> sentence= new Stack<>();
        String lastWord="";

        for (int i = 0; i < str.length(); i++) {
            sentence.push(""+str.charAt(i));
        }
        while(!sentence.peek().equals(" ")){
            unorderedWord.add(sentence.pop());
        }

        while(!unorderedWord.isEmpty()){
            lastWord+=unorderedWord.removeLast();
        }

        return lastWord;
    }


}
