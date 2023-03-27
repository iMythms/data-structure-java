package Lab13;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        // 10, 20, 30, 80, 50
        s.push(10);
        s.push(25);
        s.push(31);
        s.push(80);
        s.push(50);

        System.out.println("Bottom " + s + " Top");

        // Check even numbers in the stack
        checkEven(s);

        System.out.println("\nBottom " + s + " Top");
    }

    public static void checkEven(Stack<Integer> s) {

        // declare backup stack
        Stack<Integer> backup = new Stack<Integer>();

        // check even numbers in the stack
        while (!s.isEmpty()) {
            int e = s.pop();
            backup.push(e);

            if (e % 2 == 0) {
                System.out.println("\nEVEN");
            } else
                System.out.println("\nODD");
        }

        // return elements back to stack
        while (!backup.isEmpty()) {
            int e = backup.pop();
            s.push(e);
        }
    }
}
