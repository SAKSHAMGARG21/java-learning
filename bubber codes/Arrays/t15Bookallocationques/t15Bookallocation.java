import java.util.Scanner;

public class t15Bookallocation {
    public static boolean isPossible(int[] arr, int mid, int n, int m) {

        int stcnt = 1;
        int pagessum = 0;
        for (int i = 0; i < n; i++) {
            if (pagessum + arr[i] <= mid && m <= n) {
                pagessum += arr[i];
            } else {
                stcnt++;
                if (stcnt > m || arr[i] > mid) {
                    return false;
                }
                pagessum = arr[i];
            }
        }
        return true;
    }

    public static int findPages(int arr[], int n, int m) {
        int s = 0;
        int e = 0;
        for (int i : arr) {
            e += i;
        }
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(arr, mid, n, m)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findPages(arr, n, m));
    }
}
