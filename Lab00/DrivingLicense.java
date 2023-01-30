package Lab00;

import java.util.*;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.println("Enter your Age: ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("You can get a driving license.");
        } else
            System.out.println("You Can't get a driving license.");

        input.close();
    }
}
