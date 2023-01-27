package com.cydeo;

import java.util.*;

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
        String str2= "abcabcbb";



        System.out.println(lengthOfLongestSubstring2(str));
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(lengthOfLongestBruteForce(str));

        List<String> syncCollection = Collections.synchronizedList(Arrays.asList("a", "b", "c"));
        List<String> uppercasedCollection = new ArrayList<>();

        Runnable listOperations = () -> {
            synchronized (syncCollection) {
                syncCollection.forEach((e) -> {
                    uppercasedCollection.add(e.toUpperCase());
                });
            }
        };

    }

    public static int lengthOfLongestSubstring(String str) {

//a,  ab
        Set<Character> letters= new HashSet<>();// bc

        if(str.length()==0) return 0;

        int max =0; //3


        for(int i=0, j=0; i<str.length(); i++){

            if(!letters.contains(str.charAt(i))){
                letters.add(str.charAt(i));
                max = Math.max(max, letters.size());
            } else{
                letters.remove(str.charAt(j++));
                i--;
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

    public static int lengthOfLongestBruteForce(String s){

        String str="";
        int max=0;
        for (int i = 0; i < s.length(); i++) {

            if(str.contains(""+s.charAt(i))){
                i--;
                max=Math.max(max, str.length());
                str="";

            }else{
                str+=s.charAt(i);
                max=Math.max(max, str.length());
            }

        }
        return max;

    }

    }

