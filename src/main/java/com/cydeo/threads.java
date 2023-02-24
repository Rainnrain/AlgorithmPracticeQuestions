package com.cydeo;

public class threads extends Thread{


    @Override
    public void run() {
       for(int i=1; i<=5; i++){
           System.out.println(i);

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }

    public static void main(String[] args) {
        threads cat=new threads();
        threads cat2=new threads();
        cat.start();
        cat2.start();


    }
}
