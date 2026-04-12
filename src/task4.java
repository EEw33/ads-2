import java.util.Scanner;
import java.util.Stack;

public class task4 {

    public static void test() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        readInput(stack, sc, n);
        reverse(stack);
        printStack(stack);
    }

    public static void readInput(Stack<Integer> stack, Scanner sc, int n) {
        if (n == 0) {
            return;
        }

        stack.push(sc.nextInt());
        readInput(stack, sc, n - 1);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }

    public static void printStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        System.out.print(stack.pop());
        if (!stack.isEmpty()) {
            System.out.print(" ");
        }

        printStack(stack);
    }
}