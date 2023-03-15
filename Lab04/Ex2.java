package Lab04;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // reading target
        System.out.print("Enter target: ");
        int target = input.nextInt();

        // reading size
        System.out.print("Enter Size: ");
        int size = input.nextInt();

        // declare the array
        int arr[] = new int[size];

        // read array elements
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.nextInt();

        // call method + output
        System.out.print("Element found at pos: " + binarySearch(arr, target));

        input.close();
    }

    public static int binarySearch(int arr[], int target) {
        int min = 0, max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (target < arr[mid])
                max = mid - 1;
            else if (target > arr[mid])
                min = mid + 1;
            else
                return mid;
        }
        return -1;

    }
}
