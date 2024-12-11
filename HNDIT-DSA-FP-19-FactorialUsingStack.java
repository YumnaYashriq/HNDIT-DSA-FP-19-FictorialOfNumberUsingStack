import java.util.Stack;
public class FactorialUsingStack {
    public static void main(String[] args) {
        int number = 5;
        int result = factorialUsingStack(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorialUsingStack(int n) {
        if (n <= 1) return 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        int factorial = 1;
        while (!stack.isEmpty()) {
            factorial *= stack.pop();
        }
        return factorial;
    }
}