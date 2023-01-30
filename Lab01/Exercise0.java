package Lab01;

import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arr = { 1, 9, 2, 9, 3, 4, 3, 5 };

        double sum = 0;

        System.out.println("Enter array size: ");

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum= " + sum);

        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println("Max= " + max);

        input.close();
    }
}
