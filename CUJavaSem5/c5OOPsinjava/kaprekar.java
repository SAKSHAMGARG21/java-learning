import java.util.*;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();
        System.out.println(kap(n));
    }

    static boolean kap(int n) {

        if (n == 1) {
            return false;
        }
        int digits = String.valueOf(n).length();
        System.out.println(digits);
        int sqr = n * n;
        for (int i = 1; i < digits; i++) {
            int pow = (int) Math.pow(10, i); // we can use double instead of typecasting(double int in code)
            if (n == pow) {
                return false;
            }
            int sum = sqr % pow + sqr / pow;
            if (sum == n) {
                return true;
            }

        }

        return false;
    }
}