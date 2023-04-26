package RevisionLabTest;

import java.util.Scanner;
import java.util.Stack;

public class OldLabTestQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> stk = new Stack<Integer>();
        System.out.println("Enter # of elements: ");

        int n = input.nextInt();

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            stk.push(input.nextInt());
        }

        System.out.println("Before: ");

        System.out.println("Bottom" + stk + "Top");
        System.out.println();

        System.out.println("After: ");
        System.out.println("Bottom" + sumPairs(stk) + "Top");

        input.close();
    }

    public static Stack<Integer> sumPairs(Stack<Integer> stk) {
        Stack<Integer> sum = new Stack<Integer>();

        int n1, n2;
        if (stk.size() % 2 == 0) {
            while (!stk.isEmpty()) {
                n1 = stk.pop();
                n2 = stk.pop();
                sum.push(n1 + n2);
            }
        } else {
            while (stk.size() != 1) {
                n1 = stk.pop();
                n2 = stk.pop();
                sum.push(n1 + n2);
            }
        }
        while (!sum.isEmpty()) {
            stk.push(sum.pop());
        }
        return stk;
    }
}
