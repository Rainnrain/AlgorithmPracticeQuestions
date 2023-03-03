package com.cydeo.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTransverse {

    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7},};
        int[][] matrix= { {1, 2 ,3,4}, {12, 13, 14,5 },{11, 16, 15, 6}, { 10, 9, 8,7}};
        spiralTraverseRecursive(matrix).forEach(System.out::println);
        System.out.println(Arrays.toString(spiral(ar)));
        System.out.println(spiralOrder(ar));
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
                ordered[index++] = ar[startRow][startCol++];

            }
            startCol = it;
            while (startRow < endRow) {
                ordered[index++] = ar[startRow++][endCol];
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

    public static List<Integer> spiralOrder(int[][] ar) {
        int index = 0;
        int ordered = ar[0].length * ar.length;
        int it = 0;
        List<Integer> s= new ArrayList<>();

        while (index < ordered) {
            int startRow = it;
            int startCol = it;
            int endCol = ar[0].length - 1 - it;
            int endRow = ar.length - 1 - it;

            while (startCol < endCol) {
                s.add( ar[startRow][startCol++]);
                index++;

            }
            startCol = it;
            while (startRow < endRow) {
                s.add( ar[startRow++][endCol]);
                index++;
            }
            startRow = it;
            while (endCol > startCol) {
                s.add( ar[endRow][endCol--]);
                index++;
            }

            while (endRow > startRow) {
                s.add( ar[endRow--][startCol]);
                index++;
            }
            System.gc();
            it++;

        }
        return s;
    }


    public static List<Integer> spiralTraverseRecursive(int[][] array) {
        if (array.length == 0) return new ArrayList<Integer>();
        var result = new ArrayList<Integer>();
        spiralRecursive(array, 0, array.length - 1, 0, array[0].length - 1, result);
        return result;
    }
    public static void spiralRecursive( int[][] array,int startRow,int endRow,
                                        int startCol,int endCol, ArrayList<Integer> result) {
        // Base condition- Termination Criteria
        if (startRow > endRow || startCol > endCol) {
            return;
        }
        for (int col = startCol; col <= endCol; col++) {
            result.add(array[startRow][col]);
        }
        for (int row = startRow + 1; row <= endRow; row++) {
            result.add(array[row][endCol]);
        }
        for (int col = endCol - 1; col >= startCol; col--) {

            if (startRow == endRow) break;
            result.add(array[endRow][col]);
        }
        for (int row = endRow - 1; row >= startRow + 1; row--) {
            if (startCol == endCol) break;
            result.add(array[row][startCol]);
        }
        spiralRecursive(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
    }
}
