package com.cydeo.String;

public class splitByOtherString {
    public static void main(String[] args) {
        String a="ABABAB";
        String b="ABAB";

        System.out.println(gcdOfStrings(a, b));
    }
    public static String gcdOfStrings(String str1, String str2) {
        String m="";
        int max=0;

        for (int i = 0; i <str2.length() ; i++) {
           // str1.split()
        }
        String [] dv= str1.split(str2);
        if(dv.length==0) return str2;
        return dv[0];
     //   int [] cat= new int[5];
    }
}
