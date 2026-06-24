import java.util.Stack;
import java.util.*;
public class file1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Using enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (int num : stack) {
            System.out.println(num);
        }

        // Using iterator
        System.out.println("Using iterator:");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using while-loop with pop (destructive iteration)
        System.out.println("Using while-loop with pop:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}