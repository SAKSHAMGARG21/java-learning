
// package apnacollege;
import java.util.*;

public class l1 {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // System.out.println("This is my fir st Java program");

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }

        n = rev;

        int i = 0;
        int sum = 0;
        while (n != 0 && i <= 3) {

            if (i == 0 || i == 3) {
                sum += n % 10;
            }
            i++;
            n /= 10;
        }

        System.out.println(sum);
    }
}
