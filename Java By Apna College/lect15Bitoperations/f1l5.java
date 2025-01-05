import java.util.*;

public class f1l5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        // find the nth bit
        // find the bit on the basis of position
        // int mask = 1 << p;
        // int a = n & mask;

        // if (a > 0)
        //     System.out.println("Bit on the position " + p + " is =>" + 1);
        // else
        //     System.out.println("Bit on the position " + p + " is =>" + 0);

        // set the nth bit
        // int mask = 1 << p;
        // int a = n | mask;
        // System.out.println("After setting the " + p + "th bit, the number becomes " + a);

        // clear the nth bit
        // int mask = ~(1 << p);
        // int a = n & mask;
        // System.out.println("After clearing the " + p + "th bit, the number becomes " + a);

        // update the nth bit 0 to 1
        // int mask = 1 << p;
        // int c = n | mask;
        // System.out.println("After updating the " + p + "th bit, the number becomes " + c);

        // update the nth bit 1 to 0
        // int mask = ~(1 << p);
        // int c = n & mask;
        // System.out.println("After updating the " + p + "th bit, the number becomes " + c);
    }
}
