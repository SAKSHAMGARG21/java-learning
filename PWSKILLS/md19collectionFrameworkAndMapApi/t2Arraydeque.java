import java.util.ArrayDeque;

public class t2Arraydeque {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();

        ad1.add(10);
        ad1.add(20);
        ad1.add(30);
        System.out.println(ad1);
        ad1.addFirst(34);
        ad1.addLast(20);

        System.out.println(ad1);
        ad1.add("pu");
        System.out.println(ad1);

        ad1.offer(500);
        ad1.offerLast(1);
        ad1.offerFirst(10);

        System.out.println(ad1);

    }
}
