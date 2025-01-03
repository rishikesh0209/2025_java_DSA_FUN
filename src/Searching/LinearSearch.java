package Searching;

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int num = sc.nextInt();
        int count = 0;
        do {
            if (arr[count] == num) {
                System.out.println("The number found at index:" + count);
                break;
            }
            count++;
        } while (count < arr.length);
        if (count >= arr.length) {
            System.out.println("The num not found in the array of:" + Arrays.toString(arr));
        }
    }
}
