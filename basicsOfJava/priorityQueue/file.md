**Implementing a Priority Queue in Java**

Java provides a built-in `PriorityQueue` class in the `java.util` package, making it easy to implement a priority queue. Here's a basic example:

```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default min heap

        // Add elements to the queue
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        // Print the elements in priority order
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
```

**Explanation:**

1. **Create a PriorityQueue:**
   - `PriorityQueue<Integer> pq = new PriorityQueue<>();` creates an empty priority queue of integers.

2. **Add Elements:**
   - `pq.add(element);` adds an element to the queue. By default, it's a min-heap, meaning the smallest element is at the top.

3. **Remove and Retrieve:**
   - `pq.poll();` removes and returns the element with the highest priority (smallest in a min-heap).
   - `pq.peek();` returns the element with the highest priority without removing it.

**Customizing Priority:**

You can customize the priority order by implementing the `Comparable` interface or using a custom comparator.

**Example with a Custom Comparator:**

```java
import java.util.Comparator;
import java.util.PriorityQueue;

class Employee {
    int id;
    int salary;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    // Custom Comparator to prioritize by salary
    static class SalaryComparator implements Comparator<Employee> {
        public int compare(Employee e1, Employee e2) {
            return e2.salary - e1.salary; // Descending order by salary
        }
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Employee> pq = new PriorityQueue<>(new Employee.SalaryComparator());
        pq.add(new Employee(1, 10000));
        pq.add(new Employee(2, 5000));
        pq.add(new Employee(3, 15000));

        // Print employees in descending order of salary
        while (!pq.isEmpty()) {
            Employee emp = pq.poll();
            System.out.println(emp.id + " " + emp.salary);
        }
    }
}
```

In this example, we've created a custom `SalaryComparator` to prioritize employees based on their salary in descending order.

By understanding these concepts and using the `PriorityQueue` class effectively, you can implement various priority-based algorithms and data structures in Java.
