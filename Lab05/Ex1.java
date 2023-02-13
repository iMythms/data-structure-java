package Lab05;

import java.util.Arrays;

// The Bubble Sort Algorithm
public class Ex1 {
    public static void main(String[] args) {
        int arr[] = { 99, 22, 55, 11, 77, 33, 44, 66, 88 };

        // Print Array Before
        System.out.println("Before: " + Arrays.toString(arr));

        // Call bubbleSort
        bubbleSort(arr);

        // Print Array After
        System.out.println("After: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]) {
        for (int out = arr.length - 1; out > 0; out--) {

            for (int in = 0; in < out; in++) {

                if (arr[in] > arr[in + 1]) {
                    // Swap
                    int temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
    } // End of Method
}