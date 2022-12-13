package com.cydeo.TimeNeededtoBuyTickets;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class practice {

    public static void main(String[] args) {
        int[] array = {2, 3, 2};
        System.out.println(timeToBuyTickets(array, 2));

    }

    public static int timeToBuyTickets(int[] array, int k) {

        Queue<Integer> people = new ArrayDeque<>(); // create queue

        for (int each : array) { // populate queue
            people.offer(each);
        }

        int index = 0;
        int seconds = 0;

        while (true) {

            if (index == k && people.peek() - 1 == 0) {
                return ++seconds; // add 1 since it wont reach below statements
            }
            if (people.peek() != 0) { //don't count seconds if ==0
                people.offer(people.remove() - 1);
                seconds++;
            } else {
                people.offer(people.remove());
            }
            if (index == array.length - 1) {
                index = 0;
            } else {
                index++;
            }
        }
    }

}
