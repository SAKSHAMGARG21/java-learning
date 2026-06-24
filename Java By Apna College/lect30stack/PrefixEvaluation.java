import java.util.*;

public class PrefixEvaluation {
    public static int evalPrefix(String expr) {
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int a = stack.pop();
                int b = stack.pop();

                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                    case '^': stack.push((int)Math.pow(a, b)); break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            String expr = sc.nextLine().trim();
            System.out.println(evalPrefix(expr));
        }

        sc.close();
    }
}
