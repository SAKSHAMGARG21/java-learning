The `PriorityQueue` class in Java is a part of the `java.util` package. It provides an implementation of a priority queue data structure, where elements are ordered based on their natural ordering or by a custom comparator provided at the queue's construction time. Below are some of the key functions along with examples of how to use them:

### Key Functions of PriorityQueue

1. **add(E e)**: Inserts the specified element into this priority queue.
2. **offer(E e)**: Inserts the specified element into this priority queue.
3. **peek()**: Retrieves, but does not remove, the head of this queue, or returns `null` if this queue is empty.
4. **poll()**: Retrieves and removes the head of this queue, or returns `null` if this queue is empty.
5. **remove(Object o)**: Removes a single instance of the specified element from this queue, if it is present.
6. **clear()**: Removes all of the elements from this priority queue.
7. **contains(Object o)**: Returns `true` if this queue contains the specified element.
8. **size()**: Returns the number of elements in this queue.
9. **iterator()**: Returns an iterator over the elements in this queue.

### Implementation Example

Here's an example demonstrating the usage of some of these functions:

```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements using add() and offer()
        pq.add(10);
        pq.offer(20);
        pq.add(5);
        pq.offer(15);

        // Display the size of the priority queue
        System.out.println("Size: " + pq.size());

        // Peek at the head of the queue
        System.out.println("Head: " + pq.peek());

        // Remove and display elements using poll()
        System.out.println("Removed: " + pq.poll());
        System.out.println("Removed: " + pq.poll());

        // Check if a specific element is in the queue
        System.out.println("Contains 10: " + pq.contains(10));

        // Remove a specific element
        pq.remove(10);

        // Display remaining elements using iterator()
        System.out.println("Remaining elements:");
        for (Integer element : pq) {
            System.out.println(element);
        }

        // Clear the queue
        pq.clear();
        System.out.println("Size after clearing: " + pq.size());
    }
}
```

### Explanation:
- **add() and offer()**: Both methods are used to insert elements into the queue.
- **peek()**: Returns the head of the queue without removing it.
- **poll()**: Removes and returns the head of the queue.
- **contains()**: Checks if a specific element is present in the queue.
- **remove()**: Removes a specific element from the queue.
- **clear()**: Removes all elements from the queue.
- **iterator()**: Iterates over the elements in the queue.

Feel free to explore these functions and see how they can be useful in your applications! If you have any more questions or need further assistance, just let me know. 😊