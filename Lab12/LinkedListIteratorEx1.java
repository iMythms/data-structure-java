package Lab12;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIteratorEx1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
