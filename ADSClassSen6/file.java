import java.util.Scanner;

public class file {
    public static int[] diffuseBom(int[] arr, int n, int k) {
        int[] res = new int[n];
        if (k > n)
            return res;
        if (k == 0)
            return res;

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= k; j++) {
                    res[i] += arr[(i + j) % n];
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= k; j++) {
                    res[i] += arr[(i + j + n) % n];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = diffuseBom(arr, n, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
