package com.cydeo.String;

public class LengthOfLasWord {
    //https://leetcode.com/problems/length-of-last-word/
    public static void main(String[] args) {
        String s=" fly me  to the moon ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int end=s.length()-1;
        int start;

        while(s.charAt(end)==' '){
            end--;
        }

        start=end;
        while(s.charAt(start)!=' '){
            start--;
        }

        return start-end;
    }
}
