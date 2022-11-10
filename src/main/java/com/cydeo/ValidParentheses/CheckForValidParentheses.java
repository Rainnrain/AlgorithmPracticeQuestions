package com.cydeo.ValidParentheses;

import java.util.Stack;

public class CheckForValidParentheses {

    public static void main(String[] args) {

        String str="";
        System.out.println(checkingParentheses(str));
    }

    public static int checkingParentheses(String str) {
        Stack<String> paraentheses = new Stack<>();
        int i = 0;
        int count = 0;

        while (i < str.length()) {
            if (str.charAt(i)=='(' || str.charAt(i)==')' ) {


                if (str.charAt(i)  == '(') {
                    paraentheses.push("(");
                }else if (str.charAt(i)  == ')' && !paraentheses.isEmpty()) {
                    paraentheses.pop();
                    count += 2;
                }
            }
            i++;
        }
        return count;
    }
}
