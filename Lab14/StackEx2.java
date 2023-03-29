package Lab14;

import java.util.*;

public class StackEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(15);
        list.add(1);
        list.add(6);
        list.add(12);
        list.add(-3);
        list.add(4);
        list.add(8);
        list.add(21);
        list.add(21);
        list.add(2);
        list.add(30);
        list.add(-1);
        list.add(9);

        int val = 5;
        System.out.println("\nBefore: " + list);
        partition(list, val);
        System.out.println("After: " + list + "\n");
    }

    // should rearrange the list
    public static void partition(ArrayList<Integer> list, int val) {
        Stack<Integer> less = new Stack<Integer>();
        Stack<Integer> greater = new Stack<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > val)
                greater.push(list.get(i));
            else
                less.push(list.get(i));
        }

        list.clear();

        // move less to list
        while (!less.isEmpty()) {
            list.add(less.pop());
        }

        // move greater to list
        while (!greater.isEmpty()) {
            list.add(greater.pop());
        }
    }
}
