package RevesionMajorTest;

import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 99, 22, 55, 11, 77, 33, 44, 66, 88 };

        // Print Array Before
        System.out.println("\nBefore: " + Arrays.toString(arr));

        // Call selection Sort
        selectionSortAlgorithm(arr);

        // Print Array After
        System.out.println("\nAfter: " + Arrays.toString(arr));
    }

    // Minimum to Maximum
    public static void selectionSortAlgorithm(int arr[]) {
        for (int out = 0; out < arr.length - 1; out++) {
            int min = out;
            for (int in = out + 1; in < arr.length; in++) {
                if (arr[min] > arr[in])
                    min = in;
            }

            // Swapping
            int temp = arr[out];
            arr[out] = arr[min];
            arr[min] = temp;
        }
    }
}
