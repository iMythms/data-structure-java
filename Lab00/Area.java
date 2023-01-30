package Lab00;

import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Length;
        double Width;

        System.out.println("Enter the Length: ");
        Length = input.nextDouble();

        System.out.println("Enter the Length: ");
        Width = input.nextDouble();

        double Area = Length * Width;

        System.out.println("Your Area is: " + Area);

        input.close();
    }
}
