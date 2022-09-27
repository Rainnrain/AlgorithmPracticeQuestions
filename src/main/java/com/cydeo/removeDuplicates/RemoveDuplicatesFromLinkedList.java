package com.cydeo.removeDuplicates;

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveDuplicatesFromLinkedList {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        int[] num = {1, 1, 3, 4, 4, 4, 5, 6, 6};

        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }

        list.printNodes();
        list.noDuplicates();
        list.printNodes();

        String str= "Was it a car or a cat I saw?";
        System.out.println(palindrome(str));

        int [] arr={1,0,2,0,0,7};
        System.out.println(Arrays.toString(moveZeros(arr)));

    }
    public static boolean palindrome(String str) {
        ArrayList<String> letters= new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isLetter(str.charAt(i))){
                letters.add(""+str.charAt(i));
            }
        }
        //str.str.toLowerCase().replaceAll("[^a-z0-9]",""); is the same as [\\W]

        int left=0;
        int right=letters.size()-1;

        while(left<right){
            if(letters.get(left).equalsIgnoreCase(letters.get(right))){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static int [] moveZeros(int [] arr){
    int nextIndex=0;
    for (int i = 0; i <arr.length ; i++) {

        if(arr[i]==0 && nextIndex!=arr.length-1){
            nextIndex=i;
            while(arr[nextIndex]==0){
//
                nextIndex++;
            }
            arr[i]=arr[nextIndex];
            arr[nextIndex]=0;
        }
    }
        return arr;
}

    }



