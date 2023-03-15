package RevesionMajorTest;

import java.util.Scanner;

public class linearSerach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size: ");

        int size = input.nextInt();
        String arr[] = new String[size];

        System.out.println("Enter Elements: ");

        // read array elements
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.next();

        // read target
        System.out.println("Enter target: ");
        String target = input.next();

        // check if target found
        System.out.println("Element found at index = " + linearSearchAlgorithm(arr, target));

        input.close();
    }

    public static int linearSearchAlgorithm(String arr[], String target) {
        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i]))
                return i;
        }
        return -1;
    }

}
