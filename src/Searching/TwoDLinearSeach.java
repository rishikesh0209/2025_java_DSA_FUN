package Searching;

import java.util.*;

public class TwoDLinearSeach {
    public static void main(String[] args) {
        // your code goes here
        int[][] arr = {
                { 23, 4, 1, 9 },
                { 78, 23, 21 },
                { 1, 2, 3, 4, 102, 110 }
        };
        int max = -1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        System.out.println("Max value in is xcfdsfdf: " + max);

    }
}