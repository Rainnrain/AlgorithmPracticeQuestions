package com.cydeo.String;

public class CamelCase {

        /*
    Camel Case
    Have the function Camel Case (str) take the str parameter being passed and return it in proper
    camel case format where the first letter of each word is capitalized (excluding the first letter).
    The string will only contain letters and some combination of delimiter punctuation characters separating each word.
        For example:
            if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
        Examples
            Input: "cats AND*Dogs-are Awesome"
            Output: catsAndDogsAreAwesome
            Input: "a b c d-e-f%g"
            Output: aBCDEFG
     */


    public static void main(String[] args) {
        System.out.println(Camel("cats AND*Dogs-are Awesome"));
        System.out.println(Camel("a b c d-e-f%g"));
    }

    public static String Camel(String str) {
    str=str.toLowerCase();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                if (i != 0 && !Character.isLetter(str.charAt(i - 1))) {
                    String upper = String.valueOf(str.charAt(i)).toUpperCase();
                    result += upper;
                } else {
                    result += str.charAt(i);
                }
            }
        }
        return result;
    }

}
