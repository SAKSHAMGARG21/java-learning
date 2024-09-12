import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        kaprekar(k);
    }

    static void kaprekar(int k) {
        if (k == 1) {
            return;
        }

        int sq = k * k;
        int countDigits = 0;

        while (sq != 0) {
            countDigits++;
            sq = sq / 10;
        }

        sq = k * k;

        for (int r = 1; r < countDigits; r++) {
            int powTen = (int) Math.pow(10, r);

            if (powTen == k) {
                continue;
            }

            int sum = sq / powTen + sq % powTen;

            if (sum == k) {
                System.out.println(sq / powTen + " " + sq % powTen);
            }
        }
    }
}