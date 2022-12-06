package com.cydeo.Recursion;

public class SumOfDigits {


    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }


    public static int Sum(int num){
        int total=0;
        if(num>=10){
          String [] values= String.valueOf(num).split(""); "1","2","3"
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

    public static int addDigits2(int num) {


            if ( num == 0 ) return 0;
            return num%9 == 0 ? 9 : num%9 ;
        }


    public static int addDigits(int num) { // num=1
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        if (result < 10) return result;
        return addDigits(result);
    }



    }

