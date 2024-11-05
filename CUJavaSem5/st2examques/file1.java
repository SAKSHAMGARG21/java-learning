import java.util.Arrays;
import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    if (arr[j] == 0) {
                        arr[j] = 1;
                    } else {
                        arr[j] = 0;
                    }
                }
            }
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;
            }
        }

        System.out.println();

    }
}
