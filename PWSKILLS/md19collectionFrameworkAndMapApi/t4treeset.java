import java.util.PriorityQueue;
import java.util.TreeSet;

public class t4treeset {
    public static void main(String[] args) {
        TreeSet ts1= new TreeSet();

        ts1.add(100);
        ts1.add(60);
        ts1.add(10);
        ts1.add(130);
        ts1.add(45);
        ts1.add(32);
        System.out.println(ts1); // the data stored in the form of min-heep binary tree type structure  

        System.out.println(ts1.higher(40));
        System.out.println(ts1.lower(40));
        System.out.println(ts1.ceiling(40));
        System.out.println(ts1.floor(50));
        System.out.println(ts1.ceiling(50));
        System.out.println(ts1.floor(50));
    }
}
