import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class t6iterator {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList<>();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);

        // System.out.println(al1);

        // for (int i = 0; i < al1.size(); i++) {
        //     System.out.print(al1.get(i) + " ");
        // }
        // System.out.println();

        // for (Object obj : al1) {
        //     System.out.print(obj + " ");
        // }

        Iterator itr = al1.iterator();
        System.out.println();
        while (itr.hasNext()) {
            // Iterator itr1 = (Iterator) al1.next();
            System.out.print(itr.next() + " ");
        }

        ListIterator litr= al1.listIterator(al1.size());
        System.out.println();
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }
    }
}
