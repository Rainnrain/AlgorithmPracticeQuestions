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


            String txt = "this is some code";
            int p1 = 0;
            int p2 = 1;
            String output = "";

            for (int i = 0; i < txt.length(); i += 2) {

                if (p1 >= txt.length()) {
                    break;
                }
                if (p2 >= txt.length()) {
                    break;
                }
                if (txt.charAt(p1)==' '){
                    output += ' ';
                    p1++;
                    p2++;
                }
                output += (txt.charAt(p1) + "").toUpperCase();
                if (p2 >= txt.length()) {
                    break;
                }
                output += (txt.charAt(p2) + "").toLowerCase();
                p1 += 2;
                p2 += 2;

            }
            System.out.println(output);
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
