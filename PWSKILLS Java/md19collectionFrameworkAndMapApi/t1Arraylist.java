// Dynamic array in ArrayList

import java.util.ArrayList;

public class t1Arraylist {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        ArrayList al2 = new ArrayList<>();
        ArrayList al3 = new ArrayList<>();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);

        System.out.println(al1);


        System.out.println("***********");
        al2.add("pw skills");
        al2.add("23");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);
        System.out.println(al2);

        System.out.println("***********");
        al3.add(1);
        al3.add(2);
        al3.add(3);
        System.out.println(al3);

        System.out.println("***********");

        al3.addAll(al2);
        System.out.println(al3);

        System.out.println("***********");

        al3.add(2, "Pu");
        System.out.println(al3);

        System.out.println("***********");

        al3.add(100);
        System.out.println(al3);
    }
}
