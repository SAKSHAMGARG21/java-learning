import java.util.*;

public class t5hashset {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(100);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);

        LinkedHashSet  linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(100);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        System.out.println(linkedHashSet);
    }
}
