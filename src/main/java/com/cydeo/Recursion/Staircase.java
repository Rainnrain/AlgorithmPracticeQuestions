package com.cydeo.Recursion;

public class Staircase {

    public static void main(String[] args) {

        System.out.println(steps(3));
    }

    public static int steps(int n){

     if(n==0){
         return 1;
     }else if(n<0){
         return 0;
     }else{
         return steps(n-3)+steps(n-2)+steps(n-1);
     }
    }
}
