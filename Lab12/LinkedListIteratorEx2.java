package Lab12;

import java.util.*;

public class LinkedListIteratorEx2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Ahmed");
        list.add("Mohammed");
        list.add("Ali");
        list.add("Khaled");
        list.add("John");
        list.add("Mary");
        list.add("Adam");

        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}