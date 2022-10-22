package com.cydeo.TimeNeededtoBuyTickets;

import java.util.*;

public class tickets {

    public static void main(String[] args) {
        int [] nums={2,3,2};

        System.out.println( timeRequiredToBuy2(nums,2));

    }

    public static int timeRequiredToBuy2(int[] tickets, int k) {
        if(tickets[k] == 0) return 0;

        Deque<Integer> numbers= new ArrayDeque<>();
        for (int i = 0; i < tickets.length; i++) {
            numbers.add(tickets[i]);
        }
        int seconds=0;
        int counter=0;


        while(seconds<10000){

            if(counter%numbers.size()==k && numbers.peek()==1) {
                return ++seconds;
            }
            if(numbers.peek()>0){
                numbers.add(numbers.pop()-1);
                seconds++;
                counter++;
            } else if(numbers.peek()==0){
                numbers.add(numbers.pop());
                counter++;
            }

        }
        return seconds;
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {

        if(tickets[k] == 0) return 0;

        tickets[k] = -1 * tickets[k];

        Deque<Integer> queue = new ArrayDeque<>();
        for(int n : tickets){
            if(n != 0) queue.offerLast(n);
        }

        int timeTaken = 0;

        while(!queue.isEmpty()){
            int ticket = queue.pollFirst();

            boolean target = ticket < 0;

            if(ticket < 0) ticket++;
            else ticket--;

            ++timeTaken;

            if(ticket == 0 && target) break;
            if(ticket != 0) queue.offerLast(ticket);
        }

        return timeTaken;
    }
}
