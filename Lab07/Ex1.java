package Lab07;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        int arr[] = { 99, 22, 55, 11, 77, 33, 44, 66, 88 };

        // Print Array Before
        System.out.println("\nBefore: " + Arrays.toString(arr));

        // Call selection Sort
        insertionSort(arr);

        // Print Array After
        System.out.println("\nAfter: " + Arrays.toString(arr));
    }

    // Minimum to Maximum
    public static void insertionSort(int arr[]) {
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
