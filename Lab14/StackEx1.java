package Lab14;

import java.util.Stack;
import java.util.Arrays;

public class StackEx1 {
    public static void main(String[] args) {
        // Array
        int[] arr = { 15, 1, 6, 12, 4, 8, 21, 30, 9, -3, -1 };
        System.out.println("\nArray= " + Arrays.toString(arr));

        // Creat the Stacks
        Stack<Integer> posStack = new Stack<Integer>();
        Stack<Integer> negStack = new Stack<Integer>();
        Stack<Integer> tempStack = new Stack<Integer>();

        // Store the positive numbers in posStack, negative numbers in negStack
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                posStack.push(arr[i]);
            else
                negStack.push(arr[i]);
        }

        System.out.println("Positive Stack: " + posStack);
        System.out.println("Negative Stack: " + negStack + "\n");

        // Move from posStack to tempStack
        while (!posStack.isEmpty()) {
            tempStack.push(posStack.pop());
        }

        // Move posStack from tempStack to negStack
        while (!tempStack.isEmpty()) {
            negStack.push(tempStack.pop());
        }

        System.out.println("Positive Stack: " + posStack);
        System.out.println("Negative Stack: " + negStack + "\n");
    }
}