package Lab03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read size
        System.out.println("Enter Size: ");
        int size = input.nextInt();

        // declare elements
        String arr[] = new String[size];

        // read elements
        System.out.println("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }

        // ENTER TARGET
        System.out.println("Enter Target");

        // read target
        String target = input.next();

        // call linear method
        System.out.println(linearSearch(arr, target));

        input.close();
    }

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i]))
                return i;
        }
        return -1;
    }
}
