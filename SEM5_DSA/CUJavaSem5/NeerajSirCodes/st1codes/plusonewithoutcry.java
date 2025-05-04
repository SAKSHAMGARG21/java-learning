import java.util.*;

public class plusonewithoutcry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cstr = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (char c : cstr) {
            int digit = c - '0';
            digit = (digit + 1) % 10;
            res.append(digit);
        }

        // System.out.println(Integer.parseInt(res.toString()));
        System.out.println(res);
        // String myVariable = "Hello, World!";
        System.out.println(res.getClass().getName()); // Output: java.lang.String

    }
}
