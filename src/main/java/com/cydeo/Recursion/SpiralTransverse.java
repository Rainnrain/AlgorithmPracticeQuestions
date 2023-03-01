package com.cydeo.Recursion;

import java.util.Arrays;

public class SpiralTransverse {

    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7},};
        System.out.println(Arrays.toString(spiral(ar)));
    }

    public static int[] spiral(int[][] ar) {

        int index = 0;
        int[] ordered = new int[ar[0].length * ar.length];
        int it = 0;

        while (index < ordered.length) {
            int startRow = it;
            int startCol = it;
            int endCol = ar[0].length - 1 - it;
            int endRow = ar.length - 1 - it;

            while (startCol < endCol) {
                ordered[index++] = ar[startRow][startCol++]; // ar[0,3]

            }
            startCol = it;
            while (startRow < endRow) {
                ordered[index++] = ar[startRow++][endCol]; //ar[3,3]
            }
            startRow = it;
            while (endCol > startCol) {
                ordered[index++] = ar[endRow][endCol--];
            }

            while (endRow > startRow) {
                ordered[index++] = ar[endRow--][startCol];
            }

            it++;

        }
        return ordered;
    }
}
