package Lab08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // Array List decleration
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ahmed");
        list.add("Ali");
        list.add("Zahra");

        System.out.println(list); // Calling toString
        System.out.println("Size: " + list.size()); // # of elements
        System.out.println("Index of Ahmed: " + list.indexOf("Ahmed"));
        System.out.println();

        // Create arrayList to store the following values: 20, 30, 50, 60
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(20);
        list2.add(30);

        // int a = list2.get(0);

        String arr[] = new String[10];
        arr[0] = "Ahmed";
        arr[1] = "Zahra";
        arr[2] = "Ali";

        System.out.println(Arrays.toString(arr)); // Calling toString
        System.out.println("Size: " + arr.length); // # of elements
    }
}
