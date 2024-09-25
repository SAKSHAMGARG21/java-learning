Iterating over data structures like `Stack`, `Queue`, and `Deque` in Java can be done using various methods, including enhanced for-loops, iterators, and while-loops. Here are examples for each data structure:

### Iterating Over a Stack
```java
import java.util.Stack;

public class Main {
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
```

### Iterating Over a Queue
```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Using enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (int num : queue) {
            System.out.println(num);
        }

        // Using iterator
        System.out.println("Using iterator:");
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using while-loop with poll (destructive iteration)
        System.out.println("Using while-loop with poll:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```

### Iterating Over a Deque
```java
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(30);

        // Using enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (int num : deque) {
            System.out.println(num);
        }

        // Using iterator
        System.out.println("Using iterator:");
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using while-loop with pollFirst (destructive iteration)
        System.out.println("Using while-loop with pollFirst:");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }
    }
}
```

### Key Points:
- **Enhanced For-Loop**: Simplifies iteration over collections that implement `Iterable`.
- **Iterator**: Provides more control over the iteration process, allowing safe removal of elements during iteration.
- **While-Loop with Destructive Methods**: Iterates by removing elements, which can be useful when you need to process and empty the collection.

These examples demonstrate different ways to iterate over `Stack`, `Queue`, and `Deque` in Java. Let me know if you have any specific questions or need further assistance!

Source: Conversation with Copilot, 26/9/2024
(1) What is iteration in data structure? - Javatpoint. https://www.javatpoint.com/what-is-iteration-in-data-structure.
(2) Data Structures in Java (with code examples) - CodeChef. https://www.codechef.com/blogs/data-structures-in-java.
(3) Differences Between Iterator and Iterable and How to Use Them?. https://www.baeldung.com/java-iterator-vs-iterable.
(4) Iterate Over a Set in Java - Baeldung. https://www.baeldung.com/java-iterate-set.
(5) How to Iterate with Java - belief driven design. https://belief-driven-design.com/how-to-iterate-with-java-b94d197897b/.