import java.util.*;

public class file {

    public static ArrayList<ArrayList<Integer>> pairsum(int[] arr, int k) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(Math.min(arr[i], arr[j]));
                    temp.add(Math.max(arr[i], arr[j]));
                    res.add(temp);
                }
            }
        }
        return res;
    }

    public static int firstOcc(int[] arr, int key) {
        int n = arr.length;
        int res = 0;

        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                res = mid;
                e = mid - 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return res;
    }

    public static int lastOcc(int[] arr, int key) {
        int n = arr.length;
        int res = 0;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                res = mid;
                s = mid + 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return res;
    }

    public static int peekEle(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    public static int pivotEle(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[0] < arr[mid]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    public static int sqrt(int x) {
        int s = 0;
        int e = x;
        int res = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid > x) {
                e = mid - 1;
            } else {
                res = mid;
                s = mid + 1;
            }
        }
        return res;
    }

    public static double dicVal(int n, int dig, int sqrt) {
        double frac = 1;
        double res = sqrt;
        for (int i = 0; i < dig; i++) {
            frac /= 10;
            for (double j = res; j * j < n; j += frac) {
                res = j;
            }
        }
        return res;
    }

    public static void setMatrixZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int row = 0;
        int col = 0;
        boolean[] zerorow = new boolean[n];
        boolean[] zerocol = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    zerorow[i] = true;
                    zerocol[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zerorow[i] || zerocol[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // reverse
        // int n = sc.nextInt();
        // int rev = 0;
        // while (n != 0) {
        // if (Integer.MAX_VALUE % 10 < rev || Integer.MIN_VALUE % 10 > rev)
        // rev = (rev * 10) + (n % 10);
        // n /= 10;
        // }
        // System.out.println(rev);

        // complement of the number
        // int n = sc.nextInt();
        // int m = n;
        // int mask = 0;
        // while (m != 0) {
        // mask = m << 1 | 1;
        // m = m >> 1;
        // }
        // int res= (~n) & mask;
        // System.out.println(res);

        // pair sum
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // int k = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // ArrayList<ArrayList<Integer>> res = pairsum(arr, k);
        // for (ArrayList<Integer> a : res) {
        // System.out.println(a.get(0) + " " + a.get(1));
        // }

        // first occ and last occ
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int key= sc.nextInt();
        // int fstoc = firstOcc(arr,key);
        // int lstoc = lastOcc(arr,key);
        // System.out.println(fstoc + " " + lstoc);

        // peek element
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int peek = peekEle(arr);
        // System.out.println(peek);

        // sqrt
        // int n = sc.nextInt();
        // int res1= sqrt(n);
        // double res2 = dicVal(n,3,res1);
        // System.out.println(res2);
        // String strval= String.format("%.3f", res2);
        // double sqrtval= Double.parseDouble(strval);
        // System.out.println(sqrtval);

        // set zeros
        // int n= sc.nextInt();
        // int m= sc.nextInt();
        // int[][] mat=new int[n][m];

        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[0].length; j++) {
        //         mat[i][j]=sc.nextInt();
        //     }
        // }

        // setMatrixZeroes(mat);

        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat.length; j++) {
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // } 
   
    }
}
