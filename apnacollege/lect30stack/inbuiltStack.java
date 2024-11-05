import java.util.*;
import java.util.Stack;

public class inbuiltStack {
    public static void main(String[] args) {
        Stack st = new Stack(); // Use raw type without generics
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }

        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Size: " + stack.size()); // 30

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // 10
    }
}