import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class t7maping {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        // LinkedHashMap line= new LinkedHashMap();
        // TreeMap tm= new TreeMap();

        hm.put(6, "loki6");
        hm.put(4, "loki5");
        hm.put(5, "lok8");
        hm.put(3, "loki");
        hm.put(1, "tony");
        hm.put(2, "thor");
        System.out.println(hm);

        HashMap hm1 = new HashMap();

        hm1.put("t1", "tony"); // not maintain inserting order
        hm1.put("t2", "thor");
        hm1.put("t3", "loki");
        System.out.println(hm1);

        LinkedHashMap lh1 = new LinkedHashMap(); // maintain inserting order
        lh1.put("t1", "tony");
        lh1.put("t3", "loki");
        lh1.put("t2", "thor");
        System.out.println(lh1);

        Hashtable ht = new Hashtable();

        ht.put(1, "tony");
        ht.put(2, "thor");
        ht.put(3, "loki");
        // ht.putIfAbsent(2, "osai");
        System.out.println(ht);

        TreeMap tm = new TreeMap();

        // Integer i = new Integer(5);

        tm.put(4, "tony2");
        tm.put(1, "tony");
        tm.put(2, "thor");
        tm.put(3, "loki");
        System.out.println(tm);

    }
}
