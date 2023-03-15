package RevesionMajorTest;

import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 99, 22, 55, 11, 77, 33, 44, 66, 88 };

        // Print Array Before
        System.out.println("\nBefore: " + Arrays.toString(arr));

        // Call selection Sort
        insertionSortAlgorithm(arr);

        // Print Array After
        System.out.println("\nAfter: " + Arrays.toString(arr));
    }

    public static void insertionSortAlgorithm(int arr[]) {
        int temp, in, out;

        for (out = 1; out < arr.length; out++) {
            temp = arr[out];

            for (in = out; in > 0; in--) {
                if (temp < arr[in - 1])
                    arr[in] = arr[in - 1];

                else
                    break;
            }
            arr[in] = temp;
        }
    }
}
