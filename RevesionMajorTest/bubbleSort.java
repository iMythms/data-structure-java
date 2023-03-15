package RevesionMajorTest;

import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size = input.nextInt();

        // Declare Array
        int array[] = new int[size];

        // Add your values
        System.out.println("Enter your values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Print values before
        System.out.println("Before: " + Arrays.toString(array));

        // Calling Algorithm
        sorting(array);

        // Print After
        System.out.println("After: " + Arrays.toString(array));

        input.close();
    }

    public static void sorting(int[] array) {
        for (int out = array.length - 1; out > 0; out--) {

            for (int in = 0; in < out; in++) {

                // > For Ascending || < For Descending
                if (array[in] < array[in + 1]) {
                    // Swap
                    int temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }
    }
}
