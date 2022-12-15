package com.cydeo.Array;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {


        int x=6;
        int y=3;
        int z=12;

        int w=method1(x,y,z);
        System.out.println("w= "+w);

        System.out.println(Arrays.toString(convertNumber(35231)));


    }
    public static int method1(int y, int z, int x){
        return (x*z)/y;
    }

    public static char[] convertNumber(int num) { //35231


        String temp = "35231";

        char [] newGuess = new char[temp.length()];

        for (int i = temp.length()-1 ; i >= 0; i--) {
            newGuess[i] = temp.charAt(i);
        }

        return newGuess;
    }
}
