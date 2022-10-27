package com.cydeo.TimeNeededtoBuyTickets;

import java.util.*;

public class tickets {

    public static void main(String[] args) {
        int [] nums={5,3,2};

        System.out.println( timeRequiredToBuy2(nums,2));
        System.out.println(timeRequiredToBuyFast(nums, 1));


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

    public static int getTimeWithQueue(int[] tickets, int k) {
        Queue<Integer> ticketQueue = new ArrayDeque<>();
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] == 0) {
                    continue;
                }
                if (tickets[k] == 0) {
                    break;
                }
                ticketQueue.add(tickets[i]--);
            }
        }
        return ticketQueue.size();
    }

    public static int timeRequiredToBuyFast(int[] tickets, int k) {
        int seconds = 0;
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] < tickets[k]) {
                seconds += tickets[i];
            }
            else{
                if(i <= k) {
                    seconds += tickets[k];
                }
                else {
                    seconds += tickets[k] - 1;
                }
            }
        }
        return seconds;
    }


}
