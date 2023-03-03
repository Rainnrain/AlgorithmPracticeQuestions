package com.cydeo.String;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(prefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        String l="";
        if(strs.length==1) return "";
        for(int i=0; i<strs[0].length(); i++){
            String ch= strs[i].charAt(i)+"";
            for(int j=1; j<strs.length; j++){
                String ch2=strs[j].charAt(i)+"";
                if(!ch.equals(ch2)){
                    return l;
                }
            }
            l+=ch;
        }
        return l;
    }

    public static String prefix(String [] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
