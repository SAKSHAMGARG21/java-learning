import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

public class c42darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println(arr);
        arr.add(10);
        arr.add(20);
        arr.add(40);
        arr.add(30);
        arr.add(60);
        // System.out.println(arr);
        // arr.add(1, 34);
        // System.out.println(arr);
        // arr.remove(1);
        // System.out.println(arr);
        // arr.remove(Integer.valueOf(42));
        // System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }

        // System.out.println();
        // arr.set(1, 72);
        // System.err.println(arr);
        // Collections.sort(arr);
        // System.out.println(arr);

        // if (!arr.contains(72))
        //     arr.add(72);

        // System.out.println(arr);

        int n=sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(a.size());

        Collections.sort(a);
        System.out.println(a);
    }
}

