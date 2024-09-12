
// import java.io.*;
import java.util.Scanner;

class hourglass {
    static void pattern(int rows_no) {
        int i, j, k;

        // Print the upper half of the pattern
        for (i = 1; i <= rows_no; i++) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (j = i; j <= rows_no; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print the lower half of the pattern
        for (i = rows_no - 1; i >= 1; i--) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (j = i; j <= rows_no; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }







    public static void mypattern(int n){

    }

    // Driver code
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows_no = scn.nextInt();
        // pattern(rows_no);
        mypattern(rows_no);
    }
}