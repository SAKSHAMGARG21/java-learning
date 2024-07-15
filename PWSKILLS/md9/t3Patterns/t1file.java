import java.util.Scanner;

public class t1file {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // int n=4;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // int n=6;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || j == n - 1 || i == n / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n=6;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || j == (n - 1) && i >
        // 0 || i == n / 2 &&
        // j <= n - 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // int n=6;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 && j < (n - 1) || j == 0 || j == (n - 1) && i > 0 && i < (n - 1)
        // || i == n - 1 &&
        // j < n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // int n=11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == 10 || i == 0 || j == 0 || i + j == (n) / 2 || i - j == n / 2 || j - i == n / 2
                        || i + j == (n - 1) + (n - 1) / 2 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
