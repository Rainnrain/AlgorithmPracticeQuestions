package com.cydeo.String;

public class ReverseWords {

    public String reverseWords(String s) {
        String [] strAr=s.split(" ");
        StringBuilder rev= new StringBuilder();

        for(int i=strAr.length-1; i>=0 ;i--){
            if(!strAr[i].isBlank()){
                rev.append(strAr[i]).append(" ");
            }
        }
        return rev.toString().trim();

    }

    public String reverseWords2(String s) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i].length()>0) str.append(arr[i]+" ");
        }
        return str.toString().trim();
    }
}
