package com.cydeo.Interview;

public class January_11 {


    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String str){
        int j=str.length()-1;
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
