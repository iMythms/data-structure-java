package Lab01;

import java.util.Scanner;

public class declaringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        input.close();
    }
}
