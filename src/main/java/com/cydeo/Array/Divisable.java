package com.cydeo.Array;

import java.util.Arrays;

public class Divisable {
    public static void main(String[] args) {
        String str="1010";

        System.out.println(Arrays.toString(divisibilityArray(str, 10)));
    }
    public static int[] divisibilityArray(String word, int m) {
        int [] num=new int[word.length()];
        int a=0;

        for(int i=0; i<word.length(); i++){

           // a=a*10+Integer.parseInt(word.charAt(i)+"");
            a=a*10+word.charAt(i)-'0';

            if(a%m==0) {num[i]=1;}
            else{
                num[i]=0;
            }
            a%=m;
        }
        return num;
    }
}
