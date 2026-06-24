import java.util.*;

public class SlidingWinMax {

    public static int[] slidingwinfun(int[] arr, int n, int k) {

        Queue<Integer> q = new LinkedList<>();
        int mx = Integer.MIN_VALUE;
        int[] res = new int[n - k + 1];
        for (int i = 0; i < k; i++) {
            mx = Math.max(mx, arr[i]);
        }
        res[0] = mx;
        for (int i = 1; i <= n - k; i++) {
            mx = Integer.MIN_VALUE;
            for (int j = i; j <= i+k-1 ; j++) {
                q.add(arr[j]);
            }
            while(!q.isEmpty()){
                mx=Math.max(mx,q.poll());
            }
            res[i]=mx;
        }
        return res; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = slidingwinfun(arr, n,k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
