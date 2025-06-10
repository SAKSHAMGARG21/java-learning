import java.util.*;

public class InfixToPrefix {
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    static String infixToPrefix(String infix) {
        Stack<String> stack = new Stack<>();
        Stack<Character> ops = new Stack<>();

        // Reverse the infix expression and process
        for (int i = infix.length() - 1; i >= 0; i--) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else if (ch == ')') {
                ops.push(ch);
            } else if (ch == '(') {
                while (!ops.isEmpty() && ops.peek() != ')') {
                    String a = stack.pop();
                    String b = stack.pop();
                    char op = ops.pop();
                    stack.push(op + a + b);
                }
                ops.pop(); // remove ')'
            } else if (isOperator(ch)) {
                while (!ops.isEmpty() && precedence(ops.peek()) > precedence(ch)) {
                    String a = stack.pop();
                    String b = stack.pop();
                    char op = ops.pop();
                    stack.push(op + a + b);
                }
                ops.push(ch);
            }
        }

        while (!ops.isEmpty()) {
            String a = stack.pop();
            String b = stack.pop();
            char op = ops.pop();
            stack.push(op + a + b);
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine().trim();
        System.out.println("Prefix: " + infixToPrefix(infix));
        sc.close();
    }
}
