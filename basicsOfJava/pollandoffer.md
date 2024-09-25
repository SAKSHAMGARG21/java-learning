In Java, the `poll` and `offer` methods are commonly used with `Queue` and `Deque` data structures. Here's a detailed explanation and examples for each:

### Queue
- **`offer(E e)`**: Inserts the specified element into the queue. Returns `true` if the element was added successfully, otherwise `false`.
- **`poll()`**: Retrieves and removes the head of the queue, or returns `null` if the queue is empty.

#### Example:
```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Using offer to add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        // Using poll to remove elements
        System.out.println("Polled: " + queue.poll()); // 10
        System.out.println("Polled: " + queue.poll()); // 20
        
        // Peek at the front element
        System.out.println("Front element: " + queue.peek()); // 30
    }
}
```

### Deque
- **`offerFirst(E e)`**: Inserts the specified element at the front of the deque. Returns `true` if the element was added successfully, otherwise `false`.
- **`offerLast(E e)`**: Inserts the specified element at the end of the deque. Returns `true` if the element was added successfully, otherwise `false`.
- **`pollFirst()`**: Retrieves and removes the first element of the deque, or returns `null` if the deque is empty.
- **`pollLast()`**: Retrieves and removes the last element of the deque, or returns `null` if the deque is empty.

#### Example:
```java
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        // Using offerFirst and offerLast to add elements
        deque.offerFirst(10);
        deque.offerLast(20);
        deque.offerFirst(30);
        
        // Using pollFirst and pollLast to remove elements
        System.out.println("Polled from front: " + deque.pollFirst()); // 30
        System.out.println("Polled from back: " + deque.pollLast()); // 20
        
        // Peek at the front and back elements
        System.out.println("Front element: " + deque.peekFirst()); // 10
        System.out.println("Back element: " + deque.peekLast()); // 10
    }
}
```

### Key Points:
- **`offer`**: Adds an element to the queue or deque. Returns `true` if successful.
- **`poll`**: Retrieves and removes an element from the queue or deque. Returns `null` if the structure is empty.
- **`peek`**: Retrieves, but does not remove, the head of the queue or the first/last element of the deque.

These methods provide a safe way to add and remove elements without throwing exceptions, making them useful for handling edge cases like full queues or empty deques¹²³.

Let me know if you have any other questions or need further assistance!

Source: Conversation with Copilot, 26/9/2024
(1) Enqueue and Dequeue in Java - Delft Stack. https://www.delftstack.com/howto/java/enqueue-and-dequeue-java/.
(2) Introduction to the Java ArrayDeque - Baeldung. https://www.baeldung.com/java-array-deque.
(3) Storing Elements in Stacks and Queues - Dev.java. https://dev.java/learn/api/collections-framework/stacks-queues/.
(4) Guide to the Java Queue Interface - Baeldung. https://www.baeldung.com/java-queue.
(5) Deque (Java Platform SE 8 ) - Oracle. https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html.