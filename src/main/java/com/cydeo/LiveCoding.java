package com.cydeo;

import java.util.HashSet;
import java.util.Set;

public class LiveCoding {
/*

    Given a string s, find the length of the longest
            substring
    without repeating characters.



            Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


            Constraints:

            0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.

    */

    public static void main(String[] args) {
        String str= "aab";
        System.out.println(lengthOfLongestSubstring2(str));
        System.out.println(lengthOfLongestSubstring(str));

    }

    public static int lengthOfLongestSubstring(String str) {


        Set<Character> letters= new HashSet<>();

        if(str.length()==0) return 0;

        int max =0;


        for(int i=0, j=0; i<str.length(); i++){

            if(!letters.contains(str.charAt(i))){
                letters.add(str.charAt(i));
                max = Math.max(max, letters.size());
            } else{
                letters.remove(str.charAt(j++));
            }
        }

        return max;

                }




    public static int lengthOfLongestSubstring2(String s){
        if (s.length() == 0)
             return 0;
         Set<Character> set = new HashSet<>();
         int i = 0, j = 0, max = 0;
         while (j < s.length()) {
             if (!set.contains(s.charAt(j))) {
                 set.add(s.charAt(j++));
                 max = Math.max(max, set.size());
             } else {
                 set.remove(s.charAt(i++));
             }
         }
         return max;
} 

    }

