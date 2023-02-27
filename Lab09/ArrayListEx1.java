package Lab09;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Cars");
        list.add("Computers");
        list.add("Book");
        list.add("Laptops");
        list.add("Pens");
        list.add("Pencils");
        list.add("Cup");

        // First Display all words
        System.out.println("\nOriginal List: " + list);

        // Then display them in revers order
        System.out.print("Reverse Order: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " - ");
        }

        // Remove all plural words
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).endsWith("s"))
                list.remove(i);
        }

        System.out.println("\nRemoving Plurals: " + list + "\n");

        System.out.println();

        // Remove Plurals Method
        removePlurals(list);
        System.out.println("Remove Plurals Method: " + list);

    }

    public static void removePlurals(ArrayList<String> list) {

        ArrayList<String> plurals = new ArrayList<>(Arrays.asList("s"));

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);

            if (plurals.contains(word.substring(word.length() - 1))) {
                list.remove(i);
                i--;
            }
        }
    }

}