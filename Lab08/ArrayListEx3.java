package Lab08;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {

        // Create an ArrayList of type integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Print the size of the list
        System.out.println("\nSize of list: " + list.size());

        // Add the values from 0-9
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // Print the list
        System.out.println("List: " + list);

        // Replace the fifth value with 44
        list.set(4, 44);

        // Print the updated list
        System.out.println("\nUpdated list: " + list);

        // Add the value 42 at index 4
        list.add(4, 42);

        // Print the updated list
        System.out.println("\nUpdated list: " + list);

        // Remove the value at index 10
        list.remove(10);

        // Print the size of the list
        System.out.println("Size of list: " + list.size());

        // Check if the list contains the value 6
        if (list.contains(6)) {
            System.out.println("\nList contains 6");
        } else {
            System.out.println("\nList does not contain 6");
        }

        // Print the index of value 44
        System.out.println("Index of 44: " + list.indexOf(44));

    }
}
