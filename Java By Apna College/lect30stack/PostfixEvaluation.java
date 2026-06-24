import java.util.*;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
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
            System.out.println(evaluatePostfix(expr));
        }

        sc.close();
    }
}