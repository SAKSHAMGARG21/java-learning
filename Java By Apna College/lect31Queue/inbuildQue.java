import java.util.*;

public class inbuildQue {
    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>();
        Deque<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.offer(5);
        q.addFirst(9);

        while (!q.isEmpty()) {
            // System.out.println(q.peek());
            // q.remove();
            System.out.println(q.poll());
        }
    }
}
