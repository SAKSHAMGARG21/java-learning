import java.util.*;

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
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());  // prints in descending order: 20, 10, 5
        }
    }
    
}