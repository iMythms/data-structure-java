package Lab10;

import java.util.ArrayList;

public class Ex6 {
    public static ArrayList<Integer> filterNegative(ArrayList<Integer> list) {
        ArrayList<Integer> positiveList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0) {
                positiveList.add(list.get(i));
            }
        }
        return positiveList;
    }

    public static void minMax(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                minIndex = i;
            }
            if (list.get(i) > max) {
                max = list.get(i);
                maxIndex = i;
            }
        }
        System.out.println("\nMinimum value: " + min + ", at index: " + minIndex);
        System.out.println("Maximum value: " + max + ", at index: " + maxIndex);
        if (minIndex < maxIndex) {
            System.out.println("\nValues between minimum and maximum:");
            for (int i = minIndex + 1; i < maxIndex; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static boolean includesValue(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(2);
        list.add(-4);
        list.add(-3);
        list.add(0);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(-7);
        list.add(8);

        System.out.println("\nArrayList before filtering: " + list);
        System.out.println("Size before filtering: " + list.size());

        ArrayList<Integer> positiveList = filterNegative(list);

        System.out.println("ArrayList after filtering the negative values: " + positiveList);
        System.out.println("Size after filtering: " + positiveList.size());

        minMax(positiveList);

        int valueToCheck = 20;
        boolean includes = includesValue(positiveList, valueToCheck);
        System.out.println("Does the list include " + valueToCheck + "? " + includes);
    }
}
