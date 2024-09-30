
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Using offer to add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        while (!queue.isEmpty()) {
            int ele= queue.poll();
            queue.offer(ele);
            queue.offer(ele);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.poll();
        }

    }
}