package Lab13;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        // 10, 20, 30, 80, 50
        s.push(10);
        s.push(25);
        s.push(31);
        s.push(80);
        s.push(50);

        System.out.println("\nBottom " + s + " Top");

        // Check even numbers in the stack
        checkMax(s);

        System.out.println("\nBottom " + s + " Top");
    }

    public static void checkMax(Stack<Integer> s) {

        // declare backup stack
        Stack<Integer> backup = new Stack<Integer>();

        // find max
        int max = s.pop();
        backup.push(max);

        // check max with all other elements
        while (!s.isEmpty()) {
            int e = s.pop();
            backup.push(e);
            max = Math.max(max, e);
        }

        System.out.println("\nMAX= " + max);

        // return elements back to stack
        while (!backup.isEmpty()) {
            int e = backup.pop();
            s.push(e);
        }
    }
}
