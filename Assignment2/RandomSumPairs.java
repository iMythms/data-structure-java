package Assignment2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RandomSumPairs {

    public static void main(String[] args) {
        // Read number of elements from user
        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(System.console().readLine());

        // Generate random integer queue
        Queue<Integer> queue = randomInteger(n);

        // Print random elements
        System.out.println("\nRandom Elements: " + queue);

        // Print original queue
        System.out.println("\nBefore:");
        System.out.println("First" + queue + "Last");

        // Call sumPairs method to modify queue
        sumPairs(queue);

        // Print modified queue
        System.out.println("\nAfter:");
        System.out.println("First" + queue + "Last");
    }

    public static Queue<Integer> randomInteger(int n) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            // Generate random integer in the range [1-10]
            int random = (int) (Math.random() * 10) + 1;
            queue.offer(random);
        }
        return queue;
    }

    public static void sumPairs(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            if (queue.size() >= 2) {
                // Pop first two elements from queue and add them
                int num1 = queue.poll();
                int num2 = queue.poll();
                int sum = num1 + num2;
                stack.push(sum);
            } else {
                // If there is only one element left in the queue, push it to stack
                stack.push(queue.poll());
            }
        }

        // Push back the modified elements from stack to queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Sort the queue in descending order
        stack.clear();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }
}