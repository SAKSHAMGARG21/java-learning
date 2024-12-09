import java.util.*;

class sch {
    int p;
    int d;

    public sch(int p, int d) {
        this.p = p;
        this.d = d;
    }

    @Override
    public String toString() {
        return "jobs-> " + p + " " + d;
    }
}

class jobSch {
    static int jobScheduling(int[] deadlines, int[] profits) {
        int n = profits.length;
        sch[] arr = new sch[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new sch(profits[i], deadlines[i]);
        }

        Arrays.sort(arr, (a, b) -> b.p - a.p); // Sort by profit in descending order

        int mxd = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mxd = Math.max(mxd, arr[i].d);
        }

        int[] res = new int[mxd + 1];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].d; j > 0; j--) {
                if (res[j] == 0) {
                    res[j] = arr[i].p;
                    sum += arr[i].p;
                    break;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] deadlines = new int[n];
        int[] profits = new int[n];

        for (int i = 0; i < n; i++) {
            deadlines[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            profits[i] = sc.nextInt();
        }

        int result = jobScheduling(deadlines, profits);
        System.out.println("Maximum profit: " + result);

        sc.close();
    }
}
