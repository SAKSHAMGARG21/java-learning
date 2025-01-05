import java.util.*;

public class q2AggressiveCows {
    public static boolean isPossible(int[] arr, int mid, int n, int m) {
        int cowcnt = 1;
        int lp = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] - lp >= mid) {
                cowcnt++;
                if (cowcnt == m) {
                    return true;
                }
                lp = arr[i];
            }
        }
        return false;

    }

    public static int findPositions(int[] arr, int n, int m) {
        Arrays.sort(arr);
        int s = 0;
        int e = -1;
        for (int i : arr) {
            e = Math.max(e, i);
        }
        int ans = -1;
        e = e - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(arr, mid, n, m)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
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

        System.out.println(findPositions(arr, n, m));
    }
}
