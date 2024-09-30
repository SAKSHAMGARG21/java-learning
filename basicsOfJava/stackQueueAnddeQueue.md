In Java, the `Stack`, `Queue`, and `Deque` (Double Ended Queue) are important data structures provided by the Java Collections Framework. Here's a brief overview of each, along with examples:

### Stack
A `Stack` is a Last-In-First-Out (LIFO) data structure. Java provides a `Stack` class that extends `Vector`.

#### Example:
```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
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
```

### Queue
A `Queue` is a First-In-First-Out (FIFO) data structure. Java provides the `Queue` interface, which is implemented by classes like `LinkedList` and `PriorityQueue`.

#### Example:
```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        // Remove elements from the queue
        System.out.println("Removed: " + queue.remove()); // 10
        System.out.println("Removed: " + queue.remove()); // 20
        
        // Peek at the front element
        System.out.println("Front element: " + queue.peek()); // 30
    }
}
```

### Deque
A `Deque` (Double Ended Queue) allows insertion and removal of elements from both ends. It can be used as both a stack and a queue. Java provides the `Deque` interface, which is implemented by classes like `ArrayDeque` and `LinkedList`.

#### Example:
```java
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        // Add elements to the front and back
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(30);
        
        // Remove elements from the front and back
        System.out.println("Removed from front: " + deque.removeFirst()); // 30
        System.out.println("Removed from back: " + deque.removeLast()); // 20
        
        // Peek at the front and back elements
        System.out.println("Front element: " + deque.peekFirst()); // 10
        System.out.println("Back element: " + deque.peekLast()); // 10
    }
}
```

### Key Points:
- **Stack**: LIFO, use `push()`, `pop()`, and `peek()`.
- **Queue**: FIFO, use `add()`, `remove()`, and `peek()`.
- **Deque**: Double-ended, use `addFirst()`, `addLast()`, `removeFirst()`, `removeLast()`, `peekFirst()`, and `peekLast()`.

For more detailed comparisons and use cases, you can refer to resources like Baeldung¹ and Educative².

Let me know if you have any specific questions or need further examples!

Source: Conversation with Copilot, 27/9/2024
(1) Java Deque vs. Stack - Baeldung. https://www.baeldung.com/java-deque-vs-stack.
(2) Data structures 101: How to use stacks and queues in Java - Educative. https://www.educative.io/blog/data-structures-stack-queue-java-tutorial.
(3) Java Collections: Queue and Deque Interfaces - Stack Abuse. https://stackabuse.com/java-collections-queue-and-deque-interfaces/.
(4) Stack, Queue, Deque in Java - HappyCoders.eu. https://www.happycoders.eu/algorithms/stack-queue-deque-java/.