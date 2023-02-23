package com.cydeo.String;

public class Delete_Non_ordered {


    public static void main(String[] args) {

String [] strs= {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize2(strs));
    }
    public static int minDeletionSize(String[] strs) {
        int deleted=0;
        for(int i=0; i<strs.length-1; i++){
            for (int j = 0; j <strs[0].length() ; j++) {
                if(strs[i].charAt(j) >strs[i+1].charAt(j)){
                    deleted++;
                    break;
                }
            }
        }
        return deleted;
    }

    public static int minDeletionSize2(String[] strs) {
        int K = strs[0].length();

        int answer = 0;
        for (int col = 0; col < K; col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}

