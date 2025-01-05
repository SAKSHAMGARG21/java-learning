import java.util.PriorityQueue;

public class t3priorityQue {
    public static void main(String[] args) {
        PriorityQueue pq1= new PriorityQueue<>();

        pq1.add(100);
        pq1.add(60);
        pq1.add(10);
        pq1.add(130);
        pq1.add(45);
        pq1.add(32);
        // pq1.add("pw") // error 

        System.out.println(pq1); // the data stored in the form of min-heep binary tree type structure  
    }
}
