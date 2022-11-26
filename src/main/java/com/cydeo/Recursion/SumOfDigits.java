package com.cydeo.Recursion;

public class SumOfDigits {


    public static void main(String[] args) {

    }


    public static int Sum(int num){
        int total=0;
        if(num>=10){
          String [] values= String.valueOf(num).split("");
            for (int i = 0; i < values.length ; i++) {
               total+= Integer.parseInt(values[i]);
            }

        }else{
            total+=num;
        }
        if(total>=10){
            return Sum(total);
        }
        return total;
    }
}
