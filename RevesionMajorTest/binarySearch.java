package RevesionMajorTest;

import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for target
        System.out.println("Enter Target: ");
        int target = input.nextInt();

        // Enter Array Size
        System.out.println("Enter the size of the Array: ");
        int size = input.nextInt();

        // Declare the Array
        int array[] = new int[size];

        // Read Array elements
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Calling Array
        System.out.println("Elements found at index: " + binarySearchAlgorithm(array, target));

        input.close();
    }

    // Array Method
    public static int binarySearchAlgorithm(int array[], int target) {
        int min = 0;
        int max = array.length - 1;

        // loop
        while (min <= max) {
            int mid = (min + max) / 2;

            if (target < array[mid])
                max = mid - 1;

            else if (target > array[mid])
                min = mid + 1;

            else
                return mid;
        }
        return -1;
    }
}
