import java.util.Scanner;

// Other imports go here, Do NOT change the class name
class Main {
    static Scanner sc = new Scanner(System.in);

    static void rotate(int n) {
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Write your code here

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            rotate(n);
        }
    }
}